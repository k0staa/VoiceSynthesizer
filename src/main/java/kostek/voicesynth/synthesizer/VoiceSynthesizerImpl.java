package kostek.voicesynth.synthesizer;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.audio.SingleFileAudioPlayer;
import de.dfki.lt.freetts.en.us.MbrolaVoiceDirectory;
import kostek.voicesynth.constants.VoiceEnum;
import org.apache.commons.lang.ArrayUtils;

import javax.sound.sampled.AudioFileFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Michal Kostewicz on 30.04.16.
 */
public class VoiceSynthesizerImpl implements VoiceSynthesizer{
    private List<Voice> allPossibleVoices;

    public void synthSpeak(VoiceEnum voiceEnum, String text, String mbrolaBasePath) {
        Voice chosenVoice = chooseVoiceType(voiceEnum,mbrolaBasePath);
        chosenVoice.allocate();
        SingleFileAudioPlayer singleFileAudioPlayer = new SingleFileAudioPlayer("voice", AudioFileFormat.Type.WAVE);
        chosenVoice.setAudioPlayer(singleFileAudioPlayer);
        chosenVoice.speak(text);
        chosenVoice.deallocate();
        singleFileAudioPlayer.close();
    }

    private Voice chooseVoiceType(VoiceEnum voiceEnum, String mbrolaBasePath){
        for (Voice voice : this.getVoiceArray(mbrolaBasePath)) {
            if (voice.getName().equals(voiceEnum.getVoiceFileName())){
                return voice;
            }
        }
        return this.getVoiceArray(mbrolaBasePath).get(0);
    }

    public void getVoiceTypes(String mbrolaBasePath){
        for (Voice voice: getVoiceArray(mbrolaBasePath)) {
            System.out.print("Voice name is: " + voice.getName() + "\n");
        }
    }

    private List<Voice> getVoiceArray(String mbrolaBasePath){
        if (this.allPossibleVoices != null){
            return this.allPossibleVoices;
        }
        System.setProperty("mbrola.base", mbrolaBasePath );
        VoiceManager voiceManager = VoiceManager.getInstance();
        Voice[] basicVoices = voiceManager.getVoices();
        MbrolaVoiceDirectory mbrolaVoiceDirectory = new MbrolaVoiceDirectory();
        Voice[] mbrolaVoices = mbrolaVoiceDirectory.getVoices();
        Voice[] allVoices =  (Voice[]) ArrayUtils.addAll(basicVoices, mbrolaVoices);
        this.allPossibleVoices = new ArrayList<Voice>();
        this.allPossibleVoices.addAll(Arrays.asList(allVoices));
        return this.allPossibleVoices;
    }

}
