package nit.vikaapplication_v100.Model;

/**
 * Created by Admin on 27.11.2015.
 */
public class AboutInfo {
    private String aboutInfo;
    private int aboutInfoTelefone;
    private int aboutIcon;
    private boolean box;

    public AboutInfo(String aboutInfo, int aboutInfoTelefone, int aboutIcon, boolean box) {
        this.aboutIcon = aboutIcon;
        this.aboutInfoTelefone = aboutInfoTelefone;
        this.aboutInfo = aboutInfo;
        this.box = box;
    }

    public String getAboutInfo() {
        return aboutInfo;
    }

    public void setAboutInfo(String aboutInfo) {
        this.aboutInfo = aboutInfo;
    }

    public int getAboutInfoTelefone() {
        return aboutInfoTelefone;
    }

    public void setAboutInfoTelefone(int aboutInfoTelefone) {
        this.aboutInfoTelefone = aboutInfoTelefone;
    }

    public int getAboutIcon() {
        return aboutIcon;
    }

    public void setAboutIcon(int aboutIcon) {
        this.aboutIcon = aboutIcon;
    }

    public boolean isBox() {
        return box;
    }

    public void setBox(boolean box) {
        this.box = box;
    }
}
