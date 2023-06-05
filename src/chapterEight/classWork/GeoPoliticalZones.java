package chapterEight.classWork;

public enum GeoPoliticalZones {
    NORTH_CENTRAL(new String[]{"Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"}),
    NORTH_EAST(new String[]{"Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"}),
    NORTH_WEST(new String[]{"Kaduna","Kastina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"}),
    SOUTH_EAST(new String[]{"Abia", "Anambra", "Ebonyi", "Enugu", "Imo"}),
    SOUTH_SOUTH(new String[]{"Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"}),
    SOUTH_WEST(new String[]{"Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"});

    public String[] states;

    GeoPoliticalZones(String [] states){
        this.states = states;
    }
    public static GeoPoliticalZones getPoliticalZone(String state){
        for (GeoPoliticalZones zone: GeoPoliticalZones.values()) {
            for (String each : zone.states) {
                if (each.equalsIgnoreCase(state)){
                    return zone;
                }
            }
        }
        return null;
    }
}
