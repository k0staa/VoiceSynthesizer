package kostek.voicesynth;

import kostek.voicesynth.constants.VoiceEnum;
import kostek.voicesynth.synthesizer.VoiceSynthesizer;
import kostek.voicesynth.synthesizer.VoiceSynthesizerImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        VoiceSynthesizer voice = new VoiceSynthesizerImpl();
        String mbrolaBasePath = "/home/kostek/DEVELOP/mbrola_base";
        voice.getVoiceTypes(mbrolaBasePath);
        voice.synthSpeak(VoiceEnum.US1, "In this document I will speak about me and myself",mbrolaBasePath);
    }
}
