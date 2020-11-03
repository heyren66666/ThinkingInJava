public class Practice510 {
    public static void main(String[] args){
        DownloadPicture downloadPicture = new DownloadPicture();
        downloadPicture.closeInternet();
        new DownloadPicture();
        System.gc();
    }
}

class DownloadPicture{
    boolean isClose = false;
    void closeInternet(){
        isClose = true;
    }
    protected void finalize() throws Throwable {
        super.finalize();
        if (!isClose){
            System.out.println("internet is not close");
        }
    }
}
