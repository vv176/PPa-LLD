package libmngsys.searcher;

import libmngsys.user.Member;

import java.util.List;

public class IdBasedMemberSearcher implements MemberSearcher{

    private final int id;

    public IdBasedMemberSearcher(int id) {
        this.id = id;
    }


    @Override
    public List<Member> search() {
        return null;
    }
}
