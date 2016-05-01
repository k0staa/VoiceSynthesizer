package kostek.voicesynth.constants;

/**
 * Created by Michal Kostewicz on 30.04.16.
 */
public enum VoiceEnum {
    US1("mbrola_us1"),US2("mbrola_us2"),US3("mbrola_us3"), ALAN("alan"),KEVIN("kevin"), KEVIN16("kevin16");

    private final String voiceFileName;

    VoiceEnum(String voiceFileName) {
        this.voiceFileName = voiceFileName;
    }

    public String getVoiceFileName() {
        return voiceFileName;
    }
}
