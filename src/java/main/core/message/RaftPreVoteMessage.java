package core.message;

public class RaftPreVoteMessage extends RaftMessage{
    //是否把票投给他
    private boolean voteFor = false;

    public boolean isVoteFor() {
        return voteFor;
    }

    public void setVoteFor(boolean voteFor) {
        this.voteFor = voteFor;
    }

    @Override
    public String toString() {
        return super.toString() + "voteFor=" + voteFor + '}';
    }
}
