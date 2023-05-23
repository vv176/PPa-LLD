package libmngsys.tester;

import libmngsys.auth.UserAuthenticator;
import libmngsys.book.BookCopy;
import libmngsys.book.BookDetails;
import libmngsys.dataaccessor.DBAccessor;
import libmngsys.id.IDGenerator;
import libmngsys.lib.Library;
import libmngsys.searcher.*;
import libmngsys.user.Member;

import java.util.Date;
import java.util.List;

public class Tester {

    private final Library library = new Library(new DBAccessor());

    // Validate the parameters
    public List<BookCopy> searchBooksByBookName(String bookName) {
        if (bookName == null)
            throw new IllegalArgumentException("Book Name can't be null");
        BookSearcher bookSearcher = new NameBasedBookSearcher(bookName);
        return bookSearcher.search();
    }

    public List<BookCopy> searchBooksByAuthorNames(List<String> authorNames) {
        if (authorNames == null || authorNames.size() == 0)
            throw new IllegalArgumentException("authorNames can't be null or empty");
        BookSearcher bookSearcher = new AuthorBasedBookSearcher(authorNames);
        return bookSearcher.search();
    }

    public List<Member> searchMembersByMemberName(String memberName, String adminToken) throws IllegalAccessException {
            // authentication & auth
            if (!UserAuthenticator.isAdmin(adminToken)) {
                throw new IllegalAccessException("Operation forbidden");
            }
        MemberSearcher memberSearcher = new NameBasedMemberSearcher(memberName);
        return memberSearcher.search();
    }

    public void addBook(String bookName, Date publicationDate, List<String> authors, String adminToken) throws IllegalAccessException {
        if (!UserAuthenticator.isAdmin(adminToken)) {
            throw new IllegalAccessException("Operation forbidden");
        }
        /**
         * validation based logic here...
         */
        BookCopy bookCopy = new BookCopy(new BookDetails(bookName, publicationDate, authors), IDGenerator.getUniqueId());
        library.addBookCopy(bookCopy);
    }

    public void deleteBook(int bookCopyId, String adminToken) {
        if (bookCopyId <= 0 || adminToken == null || adminToken.length() == 0) {
            throw new IllegalArgumentException("bookCopyId/adminToken cannot be NULL or empty");
        }
        //
        BookSearcher bookSearcher = new IdBasedBookSearcher(bookCopyId);
        List<BookCopy> bookCopies = bookSearcher.search();
        if (bookCopies == null || bookCopies.size() == 0) {
            throw new RuntimeException("No book copies retrieved for given Id");
        }
        library.deleteBookCopy(bookCopies.get(0));
    }

    public void blockMember(int memberId, String adminToken) throws IllegalAccessException {
        if (memberId < 0 ||  adminToken == null || adminToken.length() == 0) {
            //
        }
        if (!UserAuthenticator.isAdmin(adminToken)) {
            throw new IllegalAccessException("Operation forbidden");
        }
        MemberSearcher memberSearcher = new IdBasedMemberSearcher(memberId);
        List<Member> members = memberSearcher.search();
        if (members == null || members.size() == 0) {
            throw new RuntimeException("No members retrieved for given Id");
        }
        library.blockMember(members.get(0));
    }

    public void issueBook(int bookCopyId, int memberId, String adminToken) {
        // params validation
        // auth
        BookSearcher bookSearcher = new IdBasedBookSearcher(bookCopyId);
        List<BookCopy> bookCopies = bookSearcher.search();
        if (bookCopies == null || bookCopies.size() == 0) {
            throw new RuntimeException("No book copies retrieved for given Id");
        }
        MemberSearcher memberSearcher = new IdBasedMemberSearcher(memberId);
        List<Member> members = memberSearcher.search();
        if (members == null || members.size() == 0) {
            throw new RuntimeException("No members retrieved for given Id");
        }
        library.issueBook(bookCopies.get(0), members.get(0));
    }

    public void submitBook(int bookCopyId, int memberId, String adminToken) {

    }

    public Member getBorrowerOfBook(int bookCopyId, String adminToken) {
        return null;
    }

    public List<BookCopy> getBooksBorrowedByMember(int memberId, String adminToken) {
        return null;
    }




}
