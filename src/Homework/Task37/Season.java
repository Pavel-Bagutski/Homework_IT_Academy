package Homework.Task37;

public enum Season {
    WINTER ,
    SPRING ,
    SUMMER ,
    AUTUMN ;

    public static Season getNextSeason(Season season){
        Season[] seasons = Season.values();
        int nextIndex = (season.ordinal() + 1) % seasons.length;
        return seasons[nextIndex];
    }
}
