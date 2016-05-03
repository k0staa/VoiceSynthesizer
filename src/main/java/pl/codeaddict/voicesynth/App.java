package pl.codeaddict.voicesynth;

import pl.codeaddict.voicesynth.constants.VoiceEnum;
import pl.codeaddict.voicesynth.synthesizer.VoiceSynthesizer;
import pl.codeaddict.voicesynth.synthesizer.VoiceSynthesizerImpl;

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
