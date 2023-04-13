package chapterFive.assignment;

import java.util.Scanner;

public class    NokiaMenuFunctions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean backToMenu = true;
        while (backToMenu){
            System.out.printf("%23s%n%20s%n", "NOKIA 3310", "Menu");
            System.out.print("""                   
                            1. Phone book\t\t\t2. Messages
                            3. Chat\t\t\t\t\t4. Call register
                            5. Tones\t\t\t\t6. Settings
                            7. Call divert\t\t\t8. Games
                            9. Calculator\t\t\t10. Reminders
                            11. Clock\t\t\t\t12. Profiles
                            13. Sim services
                            
                            Kindly select from the list of the above options: """);
            int menuFunctions = input.nextInt();
            while (menuFunctions < 1 || menuFunctions > 13){
            System.out.print("""
                                
                                Wrong input!
                                Please try again.
                                1. Phone book\t\t\t2. Messages
                                3. Chat\t\t\t\t\t4. Call register
                                5. Tones\t\t\t\t6. Settings
                                7. Call divert\t\t\t8. Games
                                9. Calculator\t\t\t10. Reminders
                                11. Clock\t\t\t\t12. Profiles
                                13. Sim services
                                
                                Kindly select from the list of the above options: """);
            menuFunctions = input.nextInt();
        }

            switch (menuFunctions){
                case 3, 7, 8, 9, 10, 12, 13 -> {backToMenu = false;}
                case 1 -> {
                    boolean backToPhoneBook = true;
                    while (backToPhoneBook){
                        System.out.println("""
                            Menu/Phone Book
                            1. Search
                            2. Service Nos.
                            3. Add name
                            4. Erase
                            5. Edit
                            6. Assign tone
                            7. Send b'card
                            8. Options
                            9. Speed dials
                            10. Voice tags
                            0. Back
                        
                            Kindly select from the list of the above options for phone book: """);
                        int phoneBookFunctions = input.nextInt();

                        while (phoneBookFunctions < 0 || phoneBookFunctions > 10){
                        System.out.print("""
                            
                            Wrong input!
                            Please try again.
                            
                            Menu/Phone Book
                            1. Search
                            2. Service Nos.
                            3. Add name
                            4. Erase
                            5. Edit
                            6. Assign tone
                            7. Send b'card
                            8. Options
                            9. Speed dials
                            10. Voice tags
                            0. Back
                            
                            Kindly select from the list of the above options for phone book: """);
                        phoneBookFunctions = input.nextInt();
                    }

                        switch (phoneBookFunctions){
                            case 1, 2, 3, 4, 5, 6, 7, 9, 10 -> {backToMenu = false;}
                            case 0 -> {backToPhoneBook = false;}
                            case 8 -> {
                                System.out.println("""
                                
                                    Menu/Phone Book/Options
                                    1. Type of view
                                    2. Memory status
                                    0. Back
                                
                                    Please pick your choice: """);
                                int optionsFunctions = input.nextInt();

                                while (optionsFunctions < 0 || optionsFunctions > 2){
                                    System.out.print("""
                                    
                                        Wrong input!
                                        Please try again.Options
                                    
                                        Menu/Phone Book/Options
                                        1. Type of view
                                        2. Memory status
                                        0. Back
                                
                                        Please pick your choice: """);
                                    optionsFunctions = input.nextInt();
                                }
                                switch (optionsFunctions){
                                    case 1, 2 -> {backToMenu = false;backToPhoneBook = false;}
                                    case 0 -> {}
                                }
                            }
                        }
                    }
                }
                case 2 -> {
                    boolean backToMessages = true;
                    while (backToMessages){
                        System.out.println("""
                            Menu/Messages
                            1. Write Messages
                            2. Inbox
                            3. Outbox
                            4. Picture Messages
                            5. Templates
                            6. Smileys
                            7. Message settings
                            8. Info service
                            9. Voice mailbox number
                            10. Service command editor
                            0. Back
                            
                            Kindly select from the list of the above options for messages: """);
                        int messagesFunctions = input.nextInt();

                        while (messagesFunctions < 0 || messagesFunctions > 10){
                            System.out.print("""
                            
                                Wrong input!
                                Please try again.
                            
                                Menu/Messages
                                1. Write Messages
                                2. Inbox
                                3. Outbox
                                4. Picture Messages
                                5. Templates
                                6. Smileys
                                7. Message settings
                                8. Info service
                                9. Voice mailbox number
                                10. Service command editor
                                Kindly select from the list of the above options for messages: """);
                            messagesFunctions = input.nextInt();
                }

                        switch (messagesFunctions){
                            case 1, 2, 3, 4, 5, 6, 8, 9, 10 -> {backToMessages = false; backToMenu = false;}
                            case 0 -> {backToMessages = false;}
                            case 7 -> {
                                boolean backToMessageSettings = true;
                                while (backToMessageSettings){
                                    System.out.println("""
                                
                                        Menu/Message/Message settings
                                        1. Set 1
                                        2. Common
                                        0. Back
                                
                                        Please pick your choice: """);
                                    int messageSettingsFunctions = input.nextInt();
                                    while (messageSettingsFunctions < 0 || messageSettingsFunctions > 2){
                                        System.out.print("""
                                    
                                            Wrong input!
                                            Please try again.
                                    
                                            Menu/Message/Message settings
                                            1. Set 1
                                            2. Common
                                            0. Back
                                    
                                            Please pick your choice: """);
                                        messageSettingsFunctions = input.nextInt();
                                    }
                                    switch (messageSettingsFunctions){
                                        case 0 -> {backToMessageSettings = false;}
                                        case 1 -> {
                                            boolean backToSet1 = true;
                                            while (backToSet1){
                                                System.out.println("""
                                        
                                                    Menu/Messages/Message settings/Set 1
                                                    1. Message centre number
                                                    2. Messages sent as
                                                    3. Message validity
                                                    0. Back
                                        
                                                    Please pick your choice: """);
                                                int set1Functions = input.nextInt();
                                                while (set1Functions < 0 || set1Functions > 3){
                                                    System.out.print("""
                                            
                                                        Wrong input!
                                                        Please try again.
                                            
                                                        Menu/Messages/Message settings/Set 1
                                                        1. Message centre number
                                                        2. Messages sent as
                                                        3. Message validity
                                                        0. Back
                                        
                                                        Please pick your choice: """);
                                                    set1Functions = input.nextInt();
                                                }
                                                switch (set1Functions){
                                                    case 0 -> {backToSet1 = false;}
                                                    case 1, 2, 3 -> {
                                                        backToSet1 = false;
                                                        backToMessageSettings = false;
                                                        backToMessages = false;
                                                        backToMenu = false;
                                                    }
                                                }
                                            }
                                        }
                                        case 2 -> {
                                            boolean backToCommon = true;
                                            while (backToCommon){
                                                System.out.println("""
                                        
                                                    Menu/Messages/Message settings/Common
                                                    1. Delivery reports
                                                    2. Reply via same centre
                                                    3. Character support
                                                    0. Back
                                        
                                                    Please pick your choice: """);
                                                int commonFuntions = input.nextInt();

                                                while (commonFuntions < 0 || commonFuntions > 3){
                                                    System.out.print("""
                                            
                                                        Wrong input!
                                                        Please try again.
                                            
                                                        Menu/Messages/Message settings/Common
                                                        1. Delivery reports
                                                        2. Reply via same centre
                                                        3. Character support
                                                        0. Back
                                        
                                                        Please pick your choice: """);
                                                    commonFuntions = input.nextInt();
                                                }
                                                switch (commonFuntions){
                                                    case 0 -> {backToCommon = false;}
                                                    case 1, 2, 3 -> {
                                                        backToCommon = false;
                                                        backToMessageSettings = false;
                                                        backToMessages = false;
                                                        backToMenu = false;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                case 4 -> {
                    boolean backToCallRegister = true;
                    while (backToCallRegister){
                        System.out.println("""
                            Menu/Call Register
                            1. Missed calls
                            2. Received calls
                            3. Dialled numbers
                            4. Erase recent call lists
                            5. Show call duration
                            6. Show call costs
                            7. Call cost settings
                            8. Prepaid credit
                            0. Back
                    
                            Kindly select from the list of the above options for call register: """);
                        int callRegisterFunctions = input.nextInt();

                        while (callRegisterFunctions < 0 || callRegisterFunctions > 8){
                            System.out.print("""
                            
                                Wrong input!
                                Please try again.
                            
                                Menu/Call Register
                                1. Missed calls
                                2. Received calls
                                3. Dialled numbers
                                4. Erase recent call lists
                                5. Show call duration
                                6. Show call costs
                                7. Call cost settings
                                8. Prepaid credit
                                0. Back
                    
                                Kindly select from the list of the above options for call register: """);
                            callRegisterFunctions = input.nextInt();
                        }
                        switch (callRegisterFunctions){
                            case 0 -> {backToCallRegister = false;}
                            case 1, 2, 3, 4, 8 -> {
                                backToCallRegister = false;
                                backToMenu = false;
                            }
                            case 5 -> {
                                boolean backToShowCallDuration = true;
                                while (backToShowCallDuration){
                                    System.out.println("""
                                                                
                                        Menu/Call Register/Show Call Duration
                                        1. Last call duration
                                        2. All call's duration
                                        3. Received call's duration
                                        4. Dialled call's duration
                                        5. Clear timers
                                        0. Back
                                
                                        Please pick your choice: """);
                                    int showCallDurationFunctions = input.nextInt();

                                    while (showCallDurationFunctions < 0 || showCallDurationFunctions > 5){
                                        System.out.print("""
                                    
                                            Wrong input!
                                            Please try again.
                                    
                                            Menu/Call Register/Show Call Duration
                                            1. Last call duration
                                            2. All call's duration
                                            3. Received call's duration
                                            4. Dialled call's duration
                                            5. Clear timers
                                            0. Back
                                
                                            Please pick your choice: """);
                                        showCallDurationFunctions = input.nextInt();
                                    }
                                    switch (showCallDurationFunctions){
                                        case 0 -> {backToShowCallDuration = false;}
                                        case 1, 2, 3, 4, 5 -> {
                                            backToShowCallDuration = false;
                                            backToCallRegister = false;
                                            backToMenu = false;
                                        }
                                    }
                                }
                            }
                    case 6 -> {
                                boolean backToShowCallCosts = true;
                                while (backToShowCallCosts){
                                    System.out.println("""
                                
                                        Menu/Call Register/Show call costs
                                        1. Last call cost
                                        2. All call's cost
                                        3. Clear counters
                                        0. Back
                                
                                        Kindly pick your choice: """);
                                    int showCallCostsFunctions = input.nextInt();

                                    while (showCallCostsFunctions < 0 || showCallCostsFunctions > 3){
                                        System.out.print("""
                                    
                                            Wrong input!
                                            Please try again.
                                    
                                            Menu/Call Register/Show call costs
                                            1. Last call cost
                                            2. All call's cost
                                            3. Clear counters
                                            0. Back
                                
                                            Kindly pick your choice: """);
                                        showCallCostsFunctions = input.nextInt();
                                    }
                                    switch (showCallCostsFunctions){
                                        case 0 -> {backToShowCallCosts = false;}
                                        case 1, 2, 3 -> {
                                            backToShowCallCosts = false;
                                            backToCallRegister = false;
                                            backToMenu = false;
                                        }
                                    }
                                }
                            }
                            case 7 -> {
                                boolean backToCallCostSettings = true;
                                while (backToCallCostSettings){
                                    System.out.println("""
                                
                                        Menu/Call Register/Call Cost Settings
                                        1. Call cost limit
                                        2. Show costs in
                                        0. Back
                                
                                        Kindly pick your choice: """);
                                    int callCostSettingsFunctions = input.nextInt();

                                    while (callCostSettingsFunctions < 0 || callCostSettingsFunctions > 2){
                                        System.out.print("""
                                    
                                            Wrong input!
                                            Please try again.
                                    
                                            Menu/Call Register/Call Cost Settings
                                            1. Call cost limit
                                            2. Show costs in
                                            0. Back
                                
                                            Kindly pick your choice: """);
                                        callCostSettingsFunctions = input.nextInt();
                                    }
                                    switch (callCostSettingsFunctions){
                                        case 0 -> {backToCallCostSettings = false;}
                                        case 1, 2 -> {
                                            backToCallCostSettings = false;
                                            backToCallRegister = false;
                                            backToMenu = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                case 5 -> {
                    boolean backToTones = true;
                    while (backToTones){
                        System.out.println("""
                            Menu/Tones
                            1. Ringing tone
                            2. Ringing volume
                            3. Incoming call alert
                            4. Composer
                            5. Message alert tone
                            6. Keypad tones
                            7. Warning and game tones
                            8. Vibrating alert
                            9. Screen saver
                            0. Back
                    
                            Kindly select from the list of the above options for tones: """);
                        int tonesFunctions = input.nextInt();

                        while (tonesFunctions < 0 || tonesFunctions > 9){
                            System.out.print("""
                            
                                Wrong input!
                                Please try again.
                            
                                Menu/Tones
                                1. Ringing tone
                                2. Ringing volume
                                3. Incoming call alert
                                4. Composer
                                5. Message alert tone
                                6. Keypad tones
                                7. Warning and game tones
                                8. Vibrating alert
                                9. Screen saver
                                0. Back
                    
                                Kindly select from the list of the above options for tones: """);
                            tonesFunctions = input.nextInt();
                        }
                        switch (tonesFunctions){
                            case 0 -> {backToTones = false;}
                            case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> {
                                backToTones = false;
                                backToMenu = false;
                            }
                        }
                    }
                }
                case 6 -> {
                    boolean backToSettings = true;
                    while (backToSettings){
                        System.out.println("""
                            Menu/Settings
                            1. Call settings
                            2. Phone settings
                            3. Security settings
                            4. Restore factory settings
                            0. Back
                    
                            Kindly select from the list of the above options for settings: """);
                        int settingsFunctions = input.nextInt();

                        while (settingsFunctions < 0 || settingsFunctions > 7){
                            System.out.print("""
                            
                                Wrong input!
                                Please try again.
                            
                                Menu/Settings
                                1. Call settings
                                2. Phone settings
                                3. Security settings
                                4. Restore factory settings
                                0. Back
                    
                                Kindly select from the list of the above options for settings: """);
                            settingsFunctions = input.nextInt();
                        }
                        switch (settingsFunctions){
                            case 0 -> {backToSettings = false;}
                            case 4 -> {
                                backToSettings = false;
                                backToMenu = false;
                            }
                            case 1 -> {
                                boolean backToCallSettings = true;
                                while (backToCallSettings) {
                                    System.out.println("""
                                                                    
                                        Menu/Settings/Call Settings
                                        1. Automatic redial
                                        2. Speed dialing
                                        3. CAll waiting options
                                        4. Own number sending
                                        5. Phone line in use
                                        6. Automatic answer
                                        0. Back
                                                                    
                                        Kindly pick your choice: """);
                                    int callSettings = input.nextInt();

                                    while (callSettings < 0 || callSettings > 6) {
                                        System.out.print("""
                                                                            
                                            Wrong input!
                                            Please try again.
                                                                            
                                            Menu/Settings/Call Settings
                                            1. Automatic redial
                                            2. Speed dialing
                                            3. CAll waiting options
                                            4. Own number sending
                                            5. Phone line in use
                                            6. Automatic answer
                                            0. Back
                                                                        
                                            Kindly pick your choice: """);
                                        callSettings = input.nextInt();
                                    }
                                    switch (callSettings) {
                                        case 0 -> {backToCallSettings = false;}
                                        case 1, 2, 3, 4, 5, 6 -> {
                                            backToCallSettings = false;
                                            backToSettings = false;
                                            backToMenu = false;
                                        }
                                    }
                                }
                            }
                            case 2 -> {
                                boolean backToPhoneSettings = true;
                                while (backToPhoneSettings) {
                                    System.out.println("""
                                                                    
                                        Menu/Settings/Phone Settings
                                        1. Language
                                        2. Cell info display
                                        3. Welcome note
                                        4. Network selection
                                        5. Lights
                                        6. Confirm SIM service actions
                                        0. Back
                                                                    
                                        Kindly select your choice: """);
                                    int phoneSettingsFunctions = input.nextInt();

                                    while (phoneSettingsFunctions < 0 || phoneSettingsFunctions > 6) {
                                        System.out.print("""
                                                                            
                                            Wrong input!
                                            Please try again.
                                                                            
                                            Menu/Settings/Phone Settings
                                            1. Language
                                            2. Cell info display
                                            3. Welcome note
                                            4. Network selection
                                            5. Lights
                                            6. Confirm SIM service actions
                                            0. Back
                                                                        
                                            Kindly select your choice: """);
                                        phoneSettingsFunctions = input.nextInt();
                                    }
                                    switch (phoneSettingsFunctions) {
                                        case 0 -> {backToPhoneSettings = false;}
                                        case 1, 2, 3, 4, 5, 6 -> {
                                            backToPhoneSettings = false;
                                            backToSettings = false;
                                            backToMenu = false;
                                        }
                                    }
                                }
                            }
                            case 3 -> {
                                boolean backToSecuritySettings = false;
                                while (backToSecuritySettings) {
                                    System.out.println("""
                                                                    
                                        Menu/Settings/Security Settings
                                        1. PIN code request
                                        2. Call barring service
                                        3. Fixed dialling
                                        4. Closed user group
                                        5. Phone security
                                        6. Change access code
                                        0. Back
                                                                    
                                        Kindly pick your choice: """);
                                    int securitySettingsFunctions = input.nextInt();
                                    while (securitySettingsFunctions < 0 || securitySettingsFunctions > 6) {
                                        System.out.print("""
                                                                            
                                            Wrong input!
                                            Please try again.
                                                                            
                                            Menu/Settings/Security Settings
                                            1. PIN code request
                                            2. Call barring service
                                            3. Fixed dialling
                                            4. Closed user group
                                            5. Phone security
                                            6. Change access code
                                            0. Back
                                                                        
                                            Kindly pick your choice: """);
                                        securitySettingsFunctions = input.nextInt();
                                    }
                                    switch (securitySettingsFunctions) {
                                        case 0 -> {backToSecuritySettings = false;}
                                        case 1, 2, 3, 4, 5, 6 -> {
                                            backToSecuritySettings = false;
                                            backToSettings = false;
                                            backToMenu = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                case 11 -> {
                    boolean backToClock = true;
                    while (backToClock){
                        System.out.println("""
                            Menu/Clock
                            1. Alarm clock
                            2. Clock settings
                            3. Date setting
                            4. Stopwatch
                            5. Countdown timer
                            6. Auto update of date and time
                            0. Back
                    
                            Kindly select from the list of the above options for clock: """);
                        int clockFunctions = input.nextInt();

                        while (clockFunctions < 0 || clockFunctions > 6){
                            System.out.print("""
                            
                                Wrong input!
                                Please try again.
                            
                                Menu/Clock
                                1. Alarm clock
                                2. Clock settings
                                3. Date setting
                                4. Stopwatch
                                5. Countdown timer
                                6. Auto update of date and time
                                0. Back
                    
                                Kindly select from the list of the above options for clock: """);
                            clockFunctions = input.nextInt();
                        }
                        switch (clockFunctions){
                            case 0 -> {backToClock = false;}
                            case 1, 2, 3, 4, 5, 6 -> {
                                backToClock = false;
                                backToMenu = false;
                            }
                        }
                    }
                }
            }
        }
    }
}
