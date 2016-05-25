package com.room517.chitchat;

/**
 * Created by ywwynm on 2016/5/14.
 * "侃侃"应用里的定义、常量
 */
public class Def {

    private Def() {}

    public static class Constant {

        public static final String VALID = "valid";

    }

    public static class Meta {

        public static final String APP_NAME = "chitchat";

        public static final String PREFERENCE_META    = "chitchat_meta";
        public static final String PREFERENCE_USER_ME = "user_me";

    }

    public static class Key {

        private static final String K = BuildConfig.APPLICATION_ID + ".key.";

        public static final String USER = K + "user";

        public static class PrefMeta {

        }

        public static class PrefUserMe {

            public static final String ID          = "id";
            public static final String NAME        = "name";
            public static final String SEX         = "sex";
            public static final String AVATAR      = "avatar";
            public static final String TAG         = "tag";
            public static final String LONGITUDE   = "longitude";
            public static final String LATITUDE    = "latitude";
            public static final String CREATE_TIME = "createTime";

        }

    }

    public static class Event {

        public static final String START_CHAT = "start_chat";
        public static final String BACK_FROM_FRAGMENT = "back_from_fragment";

    }

    public static class Network {

        public static final String BASE_URL = "http://chitchat.lichengbo.cn/";

        public static final String SUCCESS = "success";
        public static final String ERROR   = "error";

    }

    public static class DB {

        public static final String NAME = "chitchat.db";
        public static final int VERSION = 1;

        public static class TableUser {

            public static final String TableName = "user";

            public static final String ID          = "id";
            public static final String NAME        = "name";
            public static final String SEX         = "sex";
            public static final String AVATAR      = "avatar";
            public static final String TAG         = "tag";
            public static final String LONGITUDE   = "longitude";
            public static final String LATITUDE    = "latitude";
            public static final String CREATE_TIME = "createTime";

        }

        public static class TableChat {

            public static final String TableName = "chat";

            public static final String ID      = "id";
            public static final String USER_ID = "uid";

        }

        public static class TableChatDetail {

            public static final String ID      = "id";
            public static final String USER_ID = "uid";

        }

    }

    public static class Request {

        public static final int PERMISSION_LOCATION = 0;

    }

}
