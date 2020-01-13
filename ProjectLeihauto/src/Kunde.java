import java.util.Date;

public class Kunde {

	private int kundenNummer = 0;
	private String strasse;
	private String ort;
	private int plz;
	private String land;
	private int alter;
	private int telefonNummer; // string? <- falsch in klassendiagramm? oder wegen abständen?
	private String email;
	private String username;
	private String password;
	boolean gesperrt = false;
	private String kkInhaber;
	private long kkNummer;
	private Date kkAblaufdatum; // nicht string
	private int kkPruefnummer;

	public void lockKunde() {

	}

	public void unlockKunde() {

	}

	public void passwordAendern(String password) { // kontrolle bzw login
		this.password = password;
	}

	public void passwordVergessen() { // kontrolle und wirklich void?

	}

	public void passwordZurueckSetzen() { // wirklich void? nicht doppelt mit vergessen?

	}

	public void login() {

	}

	public void adKunde() {

	}

	public int getKundenNummer() {
		return kundenNummer;
	}

	public void setKundenNummer(int kundenNummer) {
		this.kundenNummer = kundenNummer;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public int getTelefonNummer() {
		return telefonNummer;
	}

	public void setTelefonNummer(int telefonNummer) {
		this.telefonNummer = telefonNummer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isGesperrt() {
		return gesperrt;
	}

	public void setGesperrt(boolean gesperrt) {
		this.gesperrt = gesperrt;
	}

	public String getKkInhaber() {
		return kkInhaber;
	}

	public void setKkInhaber(String kkInhaber) {
		this.kkInhaber = kkInhaber;
	}

	public long getKkNummer() {
		return kkNummer;
	}

	public void setKkNummer(long kkNummer) {
		this.kkNummer = kkNummer;
	}

	public Date getKkAblaufdatum() {
		return kkAblaufdatum;
	}

	public void setKkAblaufdatum(Date kkAblaufdatum) {
		this.kkAblaufdatum = kkAblaufdatum;
	}

	public int getKkPruefnummer() {
		return kkPruefnummer;
	}

	public void setKkPruefnummer(int kkPruefnummer) {
		this.kkPruefnummer = kkPruefnummer;
	}

}
