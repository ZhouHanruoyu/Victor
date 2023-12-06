import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class Club {
    private String name;
    private String FoundDate;
    private List<String>members=new ArrayList<>();
    public Club(String name,String FoundDate){
         this.name=name;
         this.FoundDate=FoundDate;
    }
    public void AddMembers(String member){
        members.add(member);
    }

    public String getName() {
        return name;
    }


    public String getFoundDate() {
        return FoundDate;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFoundDate(String foundDate) {
        this.FoundDate = foundDate;
    }
}
