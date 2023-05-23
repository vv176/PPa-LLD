package libmngsys.lib;

import libmngsys.book.BookCopy;
import libmngsys.dataaccessor.DBAccessor;
import libmngsys.dataaccessor.Results;
import libmngsys.dataaccessor.ResultsConverter;
import libmngsys.user.Member;

import java.util.List;

public class Library {

    private final DBAccessor dbAccessor;

    public Library(DBAccessor dbAccessor) {
        this.dbAccessor = dbAccessor;
    }

    public void addBookCopy(BookCopy bookCopy) {
        if (bookCopy == null) {
            //..
        }
        dbAccessor.insertBookCopy(bookCopy);
    }

    public void deleteBookCopy(BookCopy bookCopy) {
        // check if bookCopy is available
        // deletion
        if (dbAccessor.isCopyAvailable(bookCopy))
            dbAccessor.deleteBookCopy(bookCopy);
    }

    public void blockMember(Member member) {

    }

    public void issueBook(BookCopy bookCopy, Member member) {

    }

    public void submitBook(BookCopy bookCopy, Member member) {

    }

    public Member getBorrower(BookCopy bookCopy) {
        Results results = dbAccessor.getBorrower(bookCopy);
        return ResultsConverter.convertToMember(results);
    }

    public List<BookCopy> getBorrowedBooks(Member member) {
        return null;
    }

}
