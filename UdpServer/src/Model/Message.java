package Model;

public class Message {
    Etudiant Etd_env;
    Etudiant Etd_rec;
    Message  Msg;

    public Message() {
    }

    public Message(Etudiant etd_env, Etudiant etd_rec, Message msg) {
        Etd_env = etd_env;
        Etd_rec = etd_rec;
        Msg = msg;
    }

    public Etudiant getEtd_env() {
        return Etd_env;
    }

    public void setEtd_env(Etudiant etd_env) {
        Etd_env = etd_env;
    }

    public Etudiant getEtd_rec() {
        return Etd_rec;
    }

    public void setEtd_rec(Etudiant etd_rec) {
        Etd_rec = etd_rec;
    }

    public Message getMsg() {
        return Msg;
    }

    public void setMsg(Message msg) {
        Msg = msg;
    }

}
