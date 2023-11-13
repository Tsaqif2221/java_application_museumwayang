package login_tsaqif;

public class sesi {
    private static int id;
    private static String username;
    private static String nama;
    public static int get_id(){
        return id;
    }
    public static void set_id(int id){
        sesi.id = id;
    }
    public static String get_username(){
        return username;
    }
    public static void set_username(String username){
        sesi.username = username;
    }
    public static String get_nama(){
        return nama;
    }
    public static void set_nama(String nama){
        sesi.nama= nama;
    }
}