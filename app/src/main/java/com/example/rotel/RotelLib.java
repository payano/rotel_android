package com.example.rotel;

import java.util.ArrayList;
import java.util.HashMap;

public class RotelLib {
    private static RotelLib instance = null;
    static {
        System.loadLibrary("rotel");
    }

    public static RotelLib getInstance() {
        if(instance == null) {
            instance = new RotelLib();
        }
        return instance;
    }

    private RotelLib() {
        System.out.println("YOLO");
        //cpp_init();
    }
    public Boolean connect(String ipaddress) {

        return false;
    }

    @Override
    public void finalize() {
        cpp_deinit();
    }
    public void sayHelloz() {

        /*
        HashMap<Integer, ArrayList<Integer>> features = cpp_getFeatures();
        HashMap<COMMAND_TYPE, ArrayList<Integer>> command_types = new HashMap<>();
        features.forEach((key,value) -> {
            COMMAND_TYPE cmd = commandTypeIntToEnum(key);
            ArrayList v = new ArrayList<>();
            value.forEach((val) -> {
                switch (cmd) {
                    case POWER_AND_VOLUME_COMMANDS:
                        v.add(powerAndVolumeCommandsIntToEnum(val));
                        break;
                    case SOURCE_SELECTION_COMMANDS:
                        v.add(sourceSelectionCommandsIntToEnum(val));
                        break;
                    case SOURCE_CONTROL_COMMANDS:
                        v.add(sourceControlCommandsIntToEnum(val));
                        break;
                    case TONE_CONTROL_COMMANDS:
                        v.add(toneControlCommandsIntToEnum(val));
                        break;
                    case BALANCE_CONTROL_COMMANDS:
                        v.add(balanceControlCommandsIntToEnum(val));
                        break;
                    case SPEAKER_OUTPUT_COMMANDS:
                        v.add(speakerOutputCommandsIntToEnum(val));
                        break;
                    case OTHER_COMMANDS:
                        v.add(otherCommandsTypeIntToEnum(val));
                        break;
                    case REQUEST_COMMANDS:
                        v.add(requestCommandsTypeIntToEnum(val));
                        break;
                }
            });
            command_types.put(cmd, v);
        });
        System.out.println("converted...");
         */
    }

    public void getSettings() {
        //HashMap<REQUEST_COMMANDS, String> settings =
        //std::map<REQUEST_COMMANDS, std::string>
    }
    private native void cpp_init();
    private native void cpp_deinit();

    private native HashMap<Integer, String> cpp_getSettings();
    // Declare a native method sayHello() that receives no arguments and returns void
    private native void sayHello(String ipaddr);

    private native void sss(String s);
    private native HashMap<Integer, ArrayList<Integer>> cpp_getFeatures();

    public static COMMAND_TYPE commandTypeIntToEnum(Integer val) {
        switch (val) {
            case 0: return COMMAND_TYPE.POWER_AND_VOLUME_COMMANDS;
            case 1: return COMMAND_TYPE.SOURCE_SELECTION_COMMANDS;
            case 2: return COMMAND_TYPE.SOURCE_CONTROL_COMMANDS;
            case 3: return COMMAND_TYPE.TONE_CONTROL_COMMANDS;
            case 4: return COMMAND_TYPE.BALANCE_CONTROL_COMMANDS;
            case 5: return COMMAND_TYPE.SPEAKER_OUTPUT_COMMANDS;
            case 6: return COMMAND_TYPE.OTHER_COMMANDS;
            case 7: return COMMAND_TYPE.REQUEST_COMMANDS;
            default: return null;
        }
    }
    public static Integer commandTypeIntToEnum(COMMAND_TYPE val) {
        switch (val) {
            case POWER_AND_VOLUME_COMMANDS: return 0;
            case SOURCE_SELECTION_COMMANDS: return 1;
            case SOURCE_CONTROL_COMMANDS: return 2;
            case TONE_CONTROL_COMMANDS: return 3;
            case BALANCE_CONTROL_COMMANDS: return 4;
            case SPEAKER_OUTPUT_COMMANDS: return 5;
            case OTHER_COMMANDS: return 6;
            case REQUEST_COMMANDS: return 7;
            default: return null;
        }
    }
    public static REQUEST_COMMANDS requestCommandsTypeIntToEnum(Integer val) {
        switch(val) {
            case 0: return REQUEST_COMMANDS.POWER;
            case 1: return REQUEST_COMMANDS.SOURCE;
            case 2: return REQUEST_COMMANDS.VOLUME;
            case 3: return REQUEST_COMMANDS.MUTE;
            case 4: return REQUEST_COMMANDS.BYPASS;
            case 5: return REQUEST_COMMANDS.BASS;
            case 6: return REQUEST_COMMANDS.TREBLE;
            case 7: return REQUEST_COMMANDS.BALANCE;
            case 8: return REQUEST_COMMANDS.FREQ;
            case 9: return REQUEST_COMMANDS.SPEAKER;
            case 10: return REQUEST_COMMANDS.DIMMER;
            case 11: return REQUEST_COMMANDS.PCUSB;
            case 12: return REQUEST_COMMANDS.VERSION;
            case 13: return REQUEST_COMMANDS.PC_VERSION;
            case 14: return REQUEST_COMMANDS.IP;
            case 15: return REQUEST_COMMANDS.MAC;
            case 16: return REQUEST_COMMANDS.MODEL;
            case 17: return REQUEST_COMMANDS.DISCOVER;
            default: return null;
        }
    }
    public static OTHER_COMMANDS otherCommandsTypeIntToEnum(int val) {
        switch(val) {
            case 0: return OTHER_COMMANDS.DIMMER;
            case 1: return OTHER_COMMANDS.DIMMER_0;
            case 2: return OTHER_COMMANDS.DIMMER_1;
            case 3: return OTHER_COMMANDS.DIMMER_2;
            case 4: return OTHER_COMMANDS.DIMMER_3;
            case 5: return OTHER_COMMANDS.DIMMER_4;
            case 6: return OTHER_COMMANDS.DIMMER_5;
            case 7: return OTHER_COMMANDS.DIMMER_6;
            default: return null;
        }
    }
    public static SPEAKER_OUTPUT_COMMANDS speakerOutputCommandsIntToEnum(int val) {
        switch(val) {
            case 0: return SPEAKER_OUTPUT_COMMANDS.SPEAKER_A;
            case 1: return SPEAKER_OUTPUT_COMMANDS.SPEAKER_B;
            case 2: return SPEAKER_OUTPUT_COMMANDS.SPEAKER_A_ON;
            case 3: return SPEAKER_OUTPUT_COMMANDS.SPEAKER_A_OFF;
            case 4: return SPEAKER_OUTPUT_COMMANDS.SPEAKER_B_ON;
            case 5: return SPEAKER_OUTPUT_COMMANDS.SPEAKER_B_OFF;
            default: return null;
        }
    }
    public static BALANCE_CONTROL_COMMANDS balanceControlCommandsIntToEnum(int val) {
        switch (val) {
            case 0: return BALANCE_CONTROL_COMMANDS.BALANCE_R;
            case 1: return BALANCE_CONTROL_COMMANDS.BALANCE_L;
            case 2: return BALANCE_CONTROL_COMMANDS.BALANCE_L15;
            case 3: return BALANCE_CONTROL_COMMANDS.BALANCE_R15;
            case 4: return BALANCE_CONTROL_COMMANDS.BALANCE_ZERO;
            default: return null;
        }
    }
    public static TONE_CONTROL_COMMANDS toneControlCommandsIntToEnum(int val) {
        switch(val) {
            case 0: return TONE_CONTROL_COMMANDS.BYPASS_ON;
            case 1: return TONE_CONTROL_COMMANDS.BYPASS_OFF;
            case 2: return TONE_CONTROL_COMMANDS.BASS_UP;
            case 3: return TONE_CONTROL_COMMANDS.BASS_DOWN;
            case 4: return TONE_CONTROL_COMMANDS.BASS_PLUS10;
            case 5: return TONE_CONTROL_COMMANDS.BASS_MINUS10;
            case 6: return TONE_CONTROL_COMMANDS.BASS_ZERO;
            case 7: return TONE_CONTROL_COMMANDS.TREBLE_UP;
            case 8: return TONE_CONTROL_COMMANDS.TREBLE_DOWN;
            case 9: return TONE_CONTROL_COMMANDS.TREBLE_PLUS10;
            case 10: return TONE_CONTROL_COMMANDS.TREBLE_MINUS10;
            case 11: return TONE_CONTROL_COMMANDS.TREBLE_ZERO;
            default: return null;
        }
    }
    public static SOURCE_CONTROL_COMMANDS sourceControlCommandsIntToEnum(int val) {
        switch(val) {
            case 0: return SOURCE_CONTROL_COMMANDS.PLAY;
            case 1: return SOURCE_CONTROL_COMMANDS.STOP;
            case 2: return SOURCE_CONTROL_COMMANDS.PAUSE;
            case 3: return SOURCE_CONTROL_COMMANDS.TRKF;
            case 4: return SOURCE_CONTROL_COMMANDS.TRKB;
            default: return null;
        }
    }
    public static SOURCE_SELECTION_COMMANDS sourceSelectionCommandsIntToEnum(int val) {
        switch(val) {
            case 0: return SOURCE_SELECTION_COMMANDS.CD;
            case 1: return SOURCE_SELECTION_COMMANDS.COAX1;
            case 2: return SOURCE_SELECTION_COMMANDS.COAX2;
            case 3: return SOURCE_SELECTION_COMMANDS.OPT1;
            case 4: return SOURCE_SELECTION_COMMANDS.OPT2;
            case 5: return SOURCE_SELECTION_COMMANDS.AUX1;
            case 6: return SOURCE_SELECTION_COMMANDS.AUX2;
            case 7: return SOURCE_SELECTION_COMMANDS.TUNER;
            case 8: return SOURCE_SELECTION_COMMANDS.PHONO;
            case 9: return SOURCE_SELECTION_COMMANDS.USB;
            case 10: return SOURCE_SELECTION_COMMANDS.BLUETOOTH;
            case 11: return SOURCE_SELECTION_COMMANDS.PCUSB;
            default: return null;
        }
    }
    public static POWER_AND_VOLUME_COMMANDS powerAndVolumeCommandsIntToEnum(int val) {
        switch(val) {
            case 0: return POWER_AND_VOLUME_COMMANDS.POWER_ON;
            case 1: return POWER_AND_VOLUME_COMMANDS.POWER_OFF;
            case 2: return POWER_AND_VOLUME_COMMANDS.POWER_TOGGLE;
            case 3: return POWER_AND_VOLUME_COMMANDS.VOL_UP;
            case 4: return POWER_AND_VOLUME_COMMANDS.VOL_DOWN;
            case 5: return POWER_AND_VOLUME_COMMANDS.VOL_NN;
            case 6: return POWER_AND_VOLUME_COMMANDS.MUTE;
            case 7: return POWER_AND_VOLUME_COMMANDS.MUTE_ON;
            case 8: return POWER_AND_VOLUME_COMMANDS.MUTE_OFF;
            default: return null;
        }
    }
}

enum POWER_AND_VOLUME_COMMANDS {
    POWER_ON,
    POWER_OFF,
    POWER_TOGGLE,
    VOL_UP,
    VOL_DOWN,
    VOL_NN,
    MUTE,
    MUTE_ON,
    MUTE_OFF,
};

enum SOURCE_SELECTION_COMMANDS {
    CD,
    COAX1,
    COAX2,
    OPT1,
    OPT2,
    AUX1,
    AUX2,
    TUNER,
    PHONO,
    USB,
    BLUETOOTH,
    PCUSB
};

enum SOURCE_CONTROL_COMMANDS {
    PLAY,
    STOP,
    PAUSE,
    TRKF,
    TRKB
};

enum TONE_CONTROL_COMMANDS {
    BYPASS_ON,
    BYPASS_OFF,
    BASS_UP,
    BASS_DOWN,
    BASS_PLUS10,
    BASS_MINUS10,
    BASS_ZERO,
    TREBLE_UP,
    TREBLE_DOWN,
    TREBLE_PLUS10,
    TREBLE_MINUS10,
    TREBLE_ZERO
};

enum BALANCE_CONTROL_COMMANDS {
    BALANCE_R,
    BALANCE_L,
    BALANCE_L15,
    BALANCE_R15,
    BALANCE_ZERO
};

enum SPEAKER_OUTPUT_COMMANDS {
    SPEAKER_A,
    SPEAKER_B,
    SPEAKER_A_ON,
    SPEAKER_A_OFF,
    SPEAKER_B_ON,
    SPEAKER_B_OFF
};

enum OTHER_COMMANDS {
    DIMMER,
    DIMMER_0,
    DIMMER_1,
    DIMMER_2,
    DIMMER_3,
    DIMMER_4,
    DIMMER_5,
    DIMMER_6,
};

enum REQUEST_COMMANDS {
    POWER,
    SOURCE,
    VOLUME,
    MUTE,
    BYPASS,
    BASS,
    TREBLE,
    BALANCE,
    FREQ,
    SPEAKER,
    DIMMER,
    PCUSB,
    VERSION,
    PC_VERSION,
    IP,
    MAC,
    MODEL,
    DISCOVER
};

enum COMMAND_TYPE {
    POWER_AND_VOLUME_COMMANDS,
    SOURCE_SELECTION_COMMANDS,
    SOURCE_CONTROL_COMMANDS,
    TONE_CONTROL_COMMANDS,
    BALANCE_CONTROL_COMMANDS,
    SPEAKER_OUTPUT_COMMANDS,
    OTHER_COMMANDS,
    REQUEST_COMMANDS
};
