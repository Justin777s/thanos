package org.justin.thanos.api;

import com.thanos.android.core.model.Book;

import java.util.List;

/**
 *
 * Created by Administrator on 2017/2/3.
 */
public class BookSearchResponse {


    /**
     * current_user_collection : {"status":"read","rating":{"max":5,"value":"5","min":0},"updated":"2012-11-2012:08:04","user_id":"33388491","book_id":"6548683","id":605519800}
     */

    private List<Book> bookList ;

    private CurrentUserCollectionBean current_user_collection;

    public CurrentUserCollectionBean getCurrent_user_collection() {
        return current_user_collection;
    }

    public void setCurrent_user_collection(CurrentUserCollectionBean current_user_collection) {
        this.current_user_collection = current_user_collection;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public static class CurrentUserCollectionBean {
        /**
         * status : read
         * rating : {"max":5,"value":"5","min":0}
         * updated : 2012-11-2012:08:04
         * user_id : 33388491
         * book_id : 6548683
         * id : 605519800
         */

        private String status;
        private RatingBean rating;
        private String updated;
        private String user_id;
        private String book_id;
        private int id;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public RatingBean getRating() {
            return rating;
        }

        public void setRating(RatingBean rating) {
            this.rating = rating;
        }

        public String getUpdated() {
            return updated;
        }

        public void setUpdated(String updated) {
            this.updated = updated;
        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getBook_id() {
            return book_id;
        }

        public void setBook_id(String book_id) {
            this.book_id = book_id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public static class RatingBean {
            /**
             * max : 5
             * value : 5
             * min : 0
             */

            private int max;
            private String value;
            private int min;

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }
        }
    }
}
