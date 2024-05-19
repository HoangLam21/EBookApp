package com.plcoding.e_book.data.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.plcoding.e_book.domain.model.Books.Author;
import com.plcoding.e_book.domain.model.Books.Category;
import com.plcoding.e_book.domain.model.Books.Feedback;
import com.plcoding.e_book.domain.model.Books.GalleryManage;
import com.plcoding.e_book.domain.model.Books.Language;
import com.plcoding.e_book.domain.model.Books.Provider;
import com.plcoding.e_book.domain.model.Books.Publisher;
import com.plcoding.e_book.domain.model.Books.Result;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BooksDao_Impl implements BooksDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Result> __insertionAdapterOfResult;

  private BooksTypeConvertor __booksTypeConvertor;

  private final EntityDeletionOrUpdateAdapter<Result> __deletionAdapterOfResult;

  public BooksDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfResult = new EntityInsertionAdapter<Result>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `Result` (`authors`,`available`,`bookQuantity`,`createAt`,`createBy`,`description`,`discount`,`feedback`,`galleryManage`,`hot`,`id`,`isebook`,`isvip`,`language`,`num_pages`,`price`,`provider`,`publication_date`,`publisher`,`readingsession`,`title`,`total_pay`,`updateAt`,`updateBy`,`category`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Result entity) {
        final String _tmp = __booksTypeConvertor().authorsToString(entity.getAuthors());
        if (_tmp == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, _tmp);
        }
        statement.bindLong(2, entity.getAvailable());
        statement.bindLong(3, entity.getBookQuantity());
        if (entity.getCreateAt() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getCreateAt());
        }
        if (entity.getCreateBy() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getCreateBy());
        }
        if (entity.getDescription() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getDescription());
        }
        statement.bindLong(7, entity.getDiscount());
        final String _tmp_1 = __booksTypeConvertor().feedbackToString(entity.getFeedback());
        if (_tmp_1 == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, _tmp_1);
        }
        final String _tmp_2 = __booksTypeConvertor().galleryToString(entity.getGalleryManage());
        if (_tmp_2 == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, _tmp_2);
        }
        statement.bindLong(10, entity.getHot());
        if (entity.getId() == null) {
          statement.bindNull(11);
        } else {
          statement.bindLong(11, entity.getId());
        }
        final int _tmp_3 = entity.getIsebook() ? 1 : 0;
        statement.bindLong(12, _tmp_3);
        final int _tmp_4 = entity.getIsvip() ? 1 : 0;
        statement.bindLong(13, _tmp_4);
        final String _tmp_5 = __booksTypeConvertor().fromLanguage(entity.getLanguage());
        if (_tmp_5 == null) {
          statement.bindNull(14);
        } else {
          statement.bindString(14, _tmp_5);
        }
        statement.bindLong(15, entity.getNum_pages());
        statement.bindLong(16, entity.getPrice());
        final String _tmp_6 = __booksTypeConvertor().providerToString(entity.getProvider());
        if (_tmp_6 == null) {
          statement.bindNull(17);
        } else {
          statement.bindString(17, _tmp_6);
        }
        if (entity.getPublication_date() == null) {
          statement.bindNull(18);
        } else {
          statement.bindString(18, entity.getPublication_date());
        }
        final String _tmp_7 = __booksTypeConvertor().publisherToString(entity.getPublisher());
        if (_tmp_7 == null) {
          statement.bindNull(19);
        } else {
          statement.bindString(19, _tmp_7);
        }
        statement.bindLong(20, entity.getReadingsession());
        if (entity.getTitle() == null) {
          statement.bindNull(21);
        } else {
          statement.bindString(21, entity.getTitle());
        }
        statement.bindLong(22, entity.getTotal_pay());
        if (entity.getUpdateAt() == null) {
          statement.bindNull(23);
        } else {
          statement.bindString(23, entity.getUpdateAt());
        }
        if (entity.getUpdateBy() == null) {
          statement.bindNull(24);
        } else {
          statement.bindString(24, entity.getUpdateBy());
        }
        final String _tmp_8 = __booksTypeConvertor().fromCategory(entity.getCategory());
        if (_tmp_8 == null) {
          statement.bindNull(25);
        } else {
          statement.bindString(25, _tmp_8);
        }
      }
    };
    this.__deletionAdapterOfResult = new EntityDeletionOrUpdateAdapter<Result>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `Result` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Result entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
      }
    };
  }

  @Override
  public Object upsert(final Result result, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfResult.insert(result);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object delete(final Result result, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfResult.handle(result);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Flow<List<Result>> getBooks() {
    final String _sql = "SELECT * FROM Result";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"Result"}, new Callable<List<Result>>() {
      @Override
      @NonNull
      public List<Result> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAuthors = CursorUtil.getColumnIndexOrThrow(_cursor, "authors");
          final int _cursorIndexOfAvailable = CursorUtil.getColumnIndexOrThrow(_cursor, "available");
          final int _cursorIndexOfBookQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "bookQuantity");
          final int _cursorIndexOfCreateAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createAt");
          final int _cursorIndexOfCreateBy = CursorUtil.getColumnIndexOrThrow(_cursor, "createBy");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfDiscount = CursorUtil.getColumnIndexOrThrow(_cursor, "discount");
          final int _cursorIndexOfFeedback = CursorUtil.getColumnIndexOrThrow(_cursor, "feedback");
          final int _cursorIndexOfGalleryManage = CursorUtil.getColumnIndexOrThrow(_cursor, "galleryManage");
          final int _cursorIndexOfHot = CursorUtil.getColumnIndexOrThrow(_cursor, "hot");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfIsebook = CursorUtil.getColumnIndexOrThrow(_cursor, "isebook");
          final int _cursorIndexOfIsvip = CursorUtil.getColumnIndexOrThrow(_cursor, "isvip");
          final int _cursorIndexOfLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "language");
          final int _cursorIndexOfNumPages = CursorUtil.getColumnIndexOrThrow(_cursor, "num_pages");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfProvider = CursorUtil.getColumnIndexOrThrow(_cursor, "provider");
          final int _cursorIndexOfPublicationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "publication_date");
          final int _cursorIndexOfPublisher = CursorUtil.getColumnIndexOrThrow(_cursor, "publisher");
          final int _cursorIndexOfReadingsession = CursorUtil.getColumnIndexOrThrow(_cursor, "readingsession");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfTotalPay = CursorUtil.getColumnIndexOrThrow(_cursor, "total_pay");
          final int _cursorIndexOfUpdateAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updateAt");
          final int _cursorIndexOfUpdateBy = CursorUtil.getColumnIndexOrThrow(_cursor, "updateBy");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final List<Result> _result = new ArrayList<Result>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Result _item;
            final List<Author> _tmpAuthors;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfAuthors)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfAuthors);
            }
            _tmpAuthors = __booksTypeConvertor().stringToAuthors(_tmp);
            final int _tmpAvailable;
            _tmpAvailable = _cursor.getInt(_cursorIndexOfAvailable);
            final int _tmpBookQuantity;
            _tmpBookQuantity = _cursor.getInt(_cursorIndexOfBookQuantity);
            final String _tmpCreateAt;
            if (_cursor.isNull(_cursorIndexOfCreateAt)) {
              _tmpCreateAt = null;
            } else {
              _tmpCreateAt = _cursor.getString(_cursorIndexOfCreateAt);
            }
            final String _tmpCreateBy;
            if (_cursor.isNull(_cursorIndexOfCreateBy)) {
              _tmpCreateBy = null;
            } else {
              _tmpCreateBy = _cursor.getString(_cursorIndexOfCreateBy);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final int _tmpDiscount;
            _tmpDiscount = _cursor.getInt(_cursorIndexOfDiscount);
            final List<Feedback> _tmpFeedback;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfFeedback)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfFeedback);
            }
            _tmpFeedback = __booksTypeConvertor().stringToFeedback(_tmp_1);
            final List<GalleryManage> _tmpGalleryManage;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfGalleryManage)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfGalleryManage);
            }
            _tmpGalleryManage = __booksTypeConvertor().stringToGallery(_tmp_2);
            final int _tmpHot;
            _tmpHot = _cursor.getInt(_cursorIndexOfHot);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final boolean _tmpIsebook;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfIsebook);
            _tmpIsebook = _tmp_3 != 0;
            final boolean _tmpIsvip;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfIsvip);
            _tmpIsvip = _tmp_4 != 0;
            final Language _tmpLanguage;
            final String _tmp_5;
            if (_cursor.isNull(_cursorIndexOfLanguage)) {
              _tmp_5 = null;
            } else {
              _tmp_5 = _cursor.getString(_cursorIndexOfLanguage);
            }
            _tmpLanguage = __booksTypeConvertor().toLanguage(_tmp_5);
            final int _tmpNum_pages;
            _tmpNum_pages = _cursor.getInt(_cursorIndexOfNumPages);
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            final Provider _tmpProvider;
            final String _tmp_6;
            if (_cursor.isNull(_cursorIndexOfProvider)) {
              _tmp_6 = null;
            } else {
              _tmp_6 = _cursor.getString(_cursorIndexOfProvider);
            }
            _tmpProvider = __booksTypeConvertor().stringToProvider(_tmp_6);
            final String _tmpPublication_date;
            if (_cursor.isNull(_cursorIndexOfPublicationDate)) {
              _tmpPublication_date = null;
            } else {
              _tmpPublication_date = _cursor.getString(_cursorIndexOfPublicationDate);
            }
            final Publisher _tmpPublisher;
            final String _tmp_7;
            if (_cursor.isNull(_cursorIndexOfPublisher)) {
              _tmp_7 = null;
            } else {
              _tmp_7 = _cursor.getString(_cursorIndexOfPublisher);
            }
            _tmpPublisher = __booksTypeConvertor().stringToPublisher(_tmp_7);
            final int _tmpReadingsession;
            _tmpReadingsession = _cursor.getInt(_cursorIndexOfReadingsession);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final int _tmpTotal_pay;
            _tmpTotal_pay = _cursor.getInt(_cursorIndexOfTotalPay);
            final String _tmpUpdateAt;
            if (_cursor.isNull(_cursorIndexOfUpdateAt)) {
              _tmpUpdateAt = null;
            } else {
              _tmpUpdateAt = _cursor.getString(_cursorIndexOfUpdateAt);
            }
            final String _tmpUpdateBy;
            if (_cursor.isNull(_cursorIndexOfUpdateBy)) {
              _tmpUpdateBy = null;
            } else {
              _tmpUpdateBy = _cursor.getString(_cursorIndexOfUpdateBy);
            }
            final Category _tmpCategory;
            final String _tmp_8;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmp_8 = null;
            } else {
              _tmp_8 = _cursor.getString(_cursorIndexOfCategory);
            }
            _tmpCategory = __booksTypeConvertor().toCategory(_tmp_8);
            _item = new Result(_tmpAuthors,_tmpAvailable,_tmpBookQuantity,_tmpCreateAt,_tmpCreateBy,_tmpDescription,_tmpDiscount,_tmpFeedback,_tmpGalleryManage,_tmpHot,_tmpId,_tmpIsebook,_tmpIsvip,_tmpLanguage,_tmpNum_pages,_tmpPrice,_tmpProvider,_tmpPublication_date,_tmpPublisher,_tmpReadingsession,_tmpTitle,_tmpTotal_pay,_tmpUpdateAt,_tmpUpdateBy,_tmpCategory);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getBooks(final int id, final Continuation<? super Result> arg1) {
    final String _sql = "SELECT * FROM Result WHERE id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Result>() {
      @Override
      @Nullable
      public Result call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAuthors = CursorUtil.getColumnIndexOrThrow(_cursor, "authors");
          final int _cursorIndexOfAvailable = CursorUtil.getColumnIndexOrThrow(_cursor, "available");
          final int _cursorIndexOfBookQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "bookQuantity");
          final int _cursorIndexOfCreateAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createAt");
          final int _cursorIndexOfCreateBy = CursorUtil.getColumnIndexOrThrow(_cursor, "createBy");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfDiscount = CursorUtil.getColumnIndexOrThrow(_cursor, "discount");
          final int _cursorIndexOfFeedback = CursorUtil.getColumnIndexOrThrow(_cursor, "feedback");
          final int _cursorIndexOfGalleryManage = CursorUtil.getColumnIndexOrThrow(_cursor, "galleryManage");
          final int _cursorIndexOfHot = CursorUtil.getColumnIndexOrThrow(_cursor, "hot");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfIsebook = CursorUtil.getColumnIndexOrThrow(_cursor, "isebook");
          final int _cursorIndexOfIsvip = CursorUtil.getColumnIndexOrThrow(_cursor, "isvip");
          final int _cursorIndexOfLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "language");
          final int _cursorIndexOfNumPages = CursorUtil.getColumnIndexOrThrow(_cursor, "num_pages");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfProvider = CursorUtil.getColumnIndexOrThrow(_cursor, "provider");
          final int _cursorIndexOfPublicationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "publication_date");
          final int _cursorIndexOfPublisher = CursorUtil.getColumnIndexOrThrow(_cursor, "publisher");
          final int _cursorIndexOfReadingsession = CursorUtil.getColumnIndexOrThrow(_cursor, "readingsession");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfTotalPay = CursorUtil.getColumnIndexOrThrow(_cursor, "total_pay");
          final int _cursorIndexOfUpdateAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updateAt");
          final int _cursorIndexOfUpdateBy = CursorUtil.getColumnIndexOrThrow(_cursor, "updateBy");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final Result _result;
          if (_cursor.moveToFirst()) {
            final List<Author> _tmpAuthors;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfAuthors)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfAuthors);
            }
            _tmpAuthors = __booksTypeConvertor().stringToAuthors(_tmp);
            final int _tmpAvailable;
            _tmpAvailable = _cursor.getInt(_cursorIndexOfAvailable);
            final int _tmpBookQuantity;
            _tmpBookQuantity = _cursor.getInt(_cursorIndexOfBookQuantity);
            final String _tmpCreateAt;
            if (_cursor.isNull(_cursorIndexOfCreateAt)) {
              _tmpCreateAt = null;
            } else {
              _tmpCreateAt = _cursor.getString(_cursorIndexOfCreateAt);
            }
            final String _tmpCreateBy;
            if (_cursor.isNull(_cursorIndexOfCreateBy)) {
              _tmpCreateBy = null;
            } else {
              _tmpCreateBy = _cursor.getString(_cursorIndexOfCreateBy);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final int _tmpDiscount;
            _tmpDiscount = _cursor.getInt(_cursorIndexOfDiscount);
            final List<Feedback> _tmpFeedback;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfFeedback)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfFeedback);
            }
            _tmpFeedback = __booksTypeConvertor().stringToFeedback(_tmp_1);
            final List<GalleryManage> _tmpGalleryManage;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfGalleryManage)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfGalleryManage);
            }
            _tmpGalleryManage = __booksTypeConvertor().stringToGallery(_tmp_2);
            final int _tmpHot;
            _tmpHot = _cursor.getInt(_cursorIndexOfHot);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final boolean _tmpIsebook;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfIsebook);
            _tmpIsebook = _tmp_3 != 0;
            final boolean _tmpIsvip;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfIsvip);
            _tmpIsvip = _tmp_4 != 0;
            final Language _tmpLanguage;
            final String _tmp_5;
            if (_cursor.isNull(_cursorIndexOfLanguage)) {
              _tmp_5 = null;
            } else {
              _tmp_5 = _cursor.getString(_cursorIndexOfLanguage);
            }
            _tmpLanguage = __booksTypeConvertor().toLanguage(_tmp_5);
            final int _tmpNum_pages;
            _tmpNum_pages = _cursor.getInt(_cursorIndexOfNumPages);
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            final Provider _tmpProvider;
            final String _tmp_6;
            if (_cursor.isNull(_cursorIndexOfProvider)) {
              _tmp_6 = null;
            } else {
              _tmp_6 = _cursor.getString(_cursorIndexOfProvider);
            }
            _tmpProvider = __booksTypeConvertor().stringToProvider(_tmp_6);
            final String _tmpPublication_date;
            if (_cursor.isNull(_cursorIndexOfPublicationDate)) {
              _tmpPublication_date = null;
            } else {
              _tmpPublication_date = _cursor.getString(_cursorIndexOfPublicationDate);
            }
            final Publisher _tmpPublisher;
            final String _tmp_7;
            if (_cursor.isNull(_cursorIndexOfPublisher)) {
              _tmp_7 = null;
            } else {
              _tmp_7 = _cursor.getString(_cursorIndexOfPublisher);
            }
            _tmpPublisher = __booksTypeConvertor().stringToPublisher(_tmp_7);
            final int _tmpReadingsession;
            _tmpReadingsession = _cursor.getInt(_cursorIndexOfReadingsession);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final int _tmpTotal_pay;
            _tmpTotal_pay = _cursor.getInt(_cursorIndexOfTotalPay);
            final String _tmpUpdateAt;
            if (_cursor.isNull(_cursorIndexOfUpdateAt)) {
              _tmpUpdateAt = null;
            } else {
              _tmpUpdateAt = _cursor.getString(_cursorIndexOfUpdateAt);
            }
            final String _tmpUpdateBy;
            if (_cursor.isNull(_cursorIndexOfUpdateBy)) {
              _tmpUpdateBy = null;
            } else {
              _tmpUpdateBy = _cursor.getString(_cursorIndexOfUpdateBy);
            }
            final Category _tmpCategory;
            final String _tmp_8;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmp_8 = null;
            } else {
              _tmp_8 = _cursor.getString(_cursorIndexOfCategory);
            }
            _tmpCategory = __booksTypeConvertor().toCategory(_tmp_8);
            _result = new Result(_tmpAuthors,_tmpAvailable,_tmpBookQuantity,_tmpCreateAt,_tmpCreateBy,_tmpDescription,_tmpDiscount,_tmpFeedback,_tmpGalleryManage,_tmpHot,_tmpId,_tmpIsebook,_tmpIsvip,_tmpLanguage,_tmpNum_pages,_tmpPrice,_tmpProvider,_tmpPublication_date,_tmpPublisher,_tmpReadingsession,_tmpTitle,_tmpTotal_pay,_tmpUpdateAt,_tmpUpdateBy,_tmpCategory);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, arg1);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Arrays.asList(BooksTypeConvertor.class);
  }

  private synchronized BooksTypeConvertor __booksTypeConvertor() {
    if (__booksTypeConvertor == null) {
      __booksTypeConvertor = __db.getTypeConverter(BooksTypeConvertor.class);
    }
    return __booksTypeConvertor;
  }
}
