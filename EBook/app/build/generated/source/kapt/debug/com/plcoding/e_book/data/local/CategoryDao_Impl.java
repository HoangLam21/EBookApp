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
import com.plcoding.e_book.domain.model.Category.Result;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CategoryDao_Impl implements CategoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Result> __insertionAdapterOfResult;

  private final EntityDeletionOrUpdateAdapter<Result> __deletionAdapterOfResult;

  public CategoryDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfResult = new EntityInsertionAdapter<Result>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `Result` (`avatar`,`createAt`,`createBy`,`hot`,`id`,`name`,`updateAt`,`updateBy`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Result entity) {
        if (entity.getAvatar() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getAvatar());
        }
        if (entity.getCreateAt() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getCreateAt());
        }
        if (entity.getCreateBy() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getCreateBy());
        }
        statement.bindLong(4, entity.getHot());
        statement.bindLong(5, entity.getId());
        if (entity.getName() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getName());
        }
        if (entity.getUpdateAt() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getUpdateAt());
        }
        if (entity.getUpdateBy() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getUpdateBy());
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
        statement.bindLong(1, entity.getId());
      }
    };
  }

  @Override
  public Object upsert(final Result category, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfResult.insert(category);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object delete(final Result category, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfResult.handle(category);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<Result>> getCategories() {
    final String _sql = "SELECT * FROM Result";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"Result"}, new Callable<List<Result>>() {
      @Override
      @NonNull
      public List<Result> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAvatar = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar");
          final int _cursorIndexOfCreateAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createAt");
          final int _cursorIndexOfCreateBy = CursorUtil.getColumnIndexOrThrow(_cursor, "createBy");
          final int _cursorIndexOfHot = CursorUtil.getColumnIndexOrThrow(_cursor, "hot");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfUpdateAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updateAt");
          final int _cursorIndexOfUpdateBy = CursorUtil.getColumnIndexOrThrow(_cursor, "updateBy");
          final List<Result> _result = new ArrayList<Result>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Result _item;
            final String _tmpAvatar;
            if (_cursor.isNull(_cursorIndexOfAvatar)) {
              _tmpAvatar = null;
            } else {
              _tmpAvatar = _cursor.getString(_cursorIndexOfAvatar);
            }
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
            final int _tmpHot;
            _tmpHot = _cursor.getInt(_cursorIndexOfHot);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
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
            _item = new Result(_tmpAvatar,_tmpCreateAt,_tmpCreateBy,_tmpHot,_tmpId,_tmpName,_tmpUpdateAt,_tmpUpdateBy);
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
  public Object getCategory(final int id, final Continuation<? super Result> $completion) {
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
          final int _cursorIndexOfAvatar = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar");
          final int _cursorIndexOfCreateAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createAt");
          final int _cursorIndexOfCreateBy = CursorUtil.getColumnIndexOrThrow(_cursor, "createBy");
          final int _cursorIndexOfHot = CursorUtil.getColumnIndexOrThrow(_cursor, "hot");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfUpdateAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updateAt");
          final int _cursorIndexOfUpdateBy = CursorUtil.getColumnIndexOrThrow(_cursor, "updateBy");
          final Result _result;
          if (_cursor.moveToFirst()) {
            final String _tmpAvatar;
            if (_cursor.isNull(_cursorIndexOfAvatar)) {
              _tmpAvatar = null;
            } else {
              _tmpAvatar = _cursor.getString(_cursorIndexOfAvatar);
            }
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
            final int _tmpHot;
            _tmpHot = _cursor.getInt(_cursorIndexOfHot);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
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
            _result = new Result(_tmpAvatar,_tmpCreateAt,_tmpCreateBy,_tmpHot,_tmpId,_tmpName,_tmpUpdateAt,_tmpUpdateBy);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
