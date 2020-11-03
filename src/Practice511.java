public class Practice511 {
    public static void main(String args[]){
        DownloadPicture1 downloadPicture1 = new DownloadPicture1();
        downloadPicture1.closeInternet();
        new DownloadPicture1();
        System.gc();
        System.runFinalization();

    }
}
class DownloadPicture1{
    boolean isClosed = false;
    void closeInternet(){
        isClosed = true;
    }
    protected void finalize() throws Throwable {
        super.finalize();
        if (!isClosed){
            System.out.println("internet is not close");
        }
    }
}
