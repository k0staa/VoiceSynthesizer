package kostek.voicesynth.synthesizer;

import kostek.voicesynth.constants.VoiceEnum;

/**
 * Created by Michal Kostewicz on 30.04.16.
 */
public interface VoiceSynthesizer {

    void synthSpeak(VoiceEnum voiceEnum, String text, String mbrolaBasePath);

    void getVoiceTypes(String mbrolaBasePath);
}
