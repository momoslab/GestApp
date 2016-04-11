package mcteamgestapp.momo.com.mcteamgestapp.Models;

/**
 * Created by YassIne on 09/11/2015.
 */
public class UserInfo {
    /**************************
     * This class containt all the info about the user
     * for more info see the Database table
     **************************/
    private int UserID;
    private String mNome;
    private String mCognome;
    private String mEmail;
    private String mPassword;
    private Boolean mCommerciale;
    private Boolean mGestionale;
    private Boolean mCapoProgetto;
    private Boolean mConsulente;
    private Boolean mAmministratore;
    private Boolean mProduzione;
    private Boolean mDirezione;
    private Boolean mPersonale;
    private Boolean mSistemi;

    //-----------------------------------
    //      SETTER
    //-----------------------------------


    public void setNome(String mNome) {
        this.mNome = mNome;
    }

    public void setCognome(String mCognome) {
        this.mCognome = mCognome;
    }

    public void setEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public void setPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public void setCommerciale(Boolean mCommerciale) {
        this.mCommerciale = mCommerciale;
    }

    public void setGestionale(Boolean mGestionale) {
        this.mGestionale = mGestionale;
    }

    public void setCapoProgetto(Boolean mCapoProgetto) {
        this.mCapoProgetto = mCapoProgetto;
    }

    public void setConsulente(Boolean mConsulente) {
        this.mConsulente = mConsulente;
    }

    public void setAmministratore(Boolean mAmministratore) {
        this.mAmministratore = mAmministratore;
    }

    public void setProduzione(Boolean mProduzione) {
        this.mProduzione = mProduzione;
    }

    public void setDirezione(Boolean mDirezione) {
        this.mDirezione = mDirezione;
    }

    public void setPersonale(Boolean mPersonale) {
        this.mPersonale = mPersonale;
    }

    public void setSistemi(Boolean mSistemi) {
        this.mSistemi = mSistemi;
    }

    public void setID(int userID) {
        UserID = userID;
    }

    //-----------------------------------------
    //          GETTER
    //-----------------------------------------


    public int getID() {
        return UserID;
    }

    public String getNome() {
        return mNome;
    }

    public String getCognome() {
        return mCognome;
    }

    public String getEmail() {
        return mEmail;
    }

    public String getPassword() {
        return mPassword;
    }

    public Boolean getCommerciale() {
        return mCommerciale;
    }

    public Boolean getGestionale() {
        return mGestionale;
    }

    public Boolean getCapoProgetto() {
        return mCapoProgetto;
    }

    public Boolean getConsulente() {
        return mConsulente;
    }

    public Boolean getAmministratore() {
        return mAmministratore;
    }

    public Boolean getProduzione() {
        return mProduzione;
    }

    public Boolean getDirezione() {
        return mDirezione;
    }

    public Boolean getPersonale() {
        return mPersonale;
    }

    public Boolean getSistemi() {
        return mSistemi;
    }
}
