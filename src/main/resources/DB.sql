CREATE TABLE "myrecipe_tbl" (
   "myRe_num"   NUMBER   DEFAULT 1   NOT NULL,
   "user_id"   VARCHAR2(20)      NOT NULL,
   "user_img"   VARCHAR2(300)      NOT NULL,
   "myRe_title"   VARCHAR2(100)      NOT NULL,
   "myRe_content"   VARCHAR2(3000)      NOT NULL,
   "myRe_date"   DATE   DEFAULT SYSDATE   NOT NULL,
   "myRe_up"   NUMBER   DEFAULT 0   NOT NULL,
   "myRe_reply"   NUMBER   DEFAULT 0   NOT NULL
);

CREATE TABLE "qna_reply_tbl" (
   "q_re_num"   NUMBER   DEFAULT 1   NOT NULL,
   "qna_num"   NUMBER   DEFAULT 1   NOT NULL,
   "user_img"   VARCHAR2(300)      NOT NULL,
   "order"   NUMBER   NULL,
   "re_id"   VARCHAR2(20)      NOT NULL,
   "re_content"   VARCHAR2(1000)      NOT NULL,
   "re_up"   NUMBER   DEFAULT 0   NOT NULL,
   "re_date"   DATE   DEFAULT SYSDATE   NOT NULL
);

CREATE TABLE "qna_tbl" (
   "qna_num"   NUMBER   DEFAULT 1   NOT NULL,
   "user_id"   VARCHAR2(20)      NOT NULL,
   "qna_title"   VARCHAR2(300)      NOT NULL,
   "qna_content"   VARCHAR2(3000)      NOT NULL,
   "qna_date"   DATE   DEFAULT SYSDATE   NOT NULL,
   "qna_up"   NUMBER   DEFAULT 0   NOT NULL,
   "qna_re_count"   NUMBER   DEFAULT 0   NOT NULL,
   "user_img"   VARCHAR2(300)      NOT NULL
);

CREATE TABLE "recipe_tbl" (
   "rec_num"   NUMBER      NOT NULL,
   "cate_num"   NUMBER      NOT NULL,
   "rec_date"   DATE   DEFAULT SYSDATE   NOT NULL,
   "rec_view"   NUMBER   DEFAULT 0   NOT NULL,
   "rec_ ten"   NUMBER   NULL,
   "rec_title"   VARCHAR2(100)      NOT NULL,
   "rec_subt"   VARCHAR2(500)      NOT NULL,
   "rec_desc"   VARCHAR2(1000)      NOT NULL,
   "rec_ingre_main"   VARCHAR2(1000)      NOT NULL,
   "rec_ingre_sub"   VARCHAR2(1000)       NULL,
   "rec_tool"   VARCHAR2(500)      NULL
);

CREATE TABLE "category_tbl" (
   "cate_num"   NUMBER      NOT NULL,
   "cate_name"   VARCHAR2(100)      NOT NULL
);

CREATE TABLE "myreceipe_reply_tbl" (
   "m_re_num"   NUMBER   DEFAULT 1   NOT NULL,
   "myRe_num"   NUMBER   DEFAULT 1   NOT NULL,
   "user_img"   VARCHAR2(300)      NOT NULL,
   "post_id"   VARCHAR2(20)      NOT NULL,
   "re_id"   VARCHAR2(20)      NOT NULL,
   "re_content"   VARCHAR2(2000)      NOT NULL,
   "re_up"   NUMBER   DEFAULT 0   NOT NULL,
   "re_date"   DATE   DEFAULT SYSDATE   NOT NULL
);

CREATE TABLE "guide_tbl" (
   "gui_num"   NUMBER      NOT NULL,
   "cate_num"   NUMBER      NOT NULL,
   "gui_date"   DATE   DEFAULT SYSDATE   NOT NULL,
   "gui_view"   NUMBER   DEFAULT 0   NOT NULL,
   "gui_title"   VARCHAR2(100)      NOT NULL,
   "gui_subt"   VARCHAR2(100)      NOT NULL,
   "gui_desc"   VARCHAR2(300)      NOT NULL
);

CREATE TABLE "notice_tbl" (
   "notice_num"   NUMBER      NOT NULL,
   "notice_title"   VARCHAR2(300)      NOT NULL,
   "notice_cont"   VARCHAR2(3000)      NOT NULL,
   "notice_date"   DATE   DEFAULT SYSDATE    NOT NULL,
   "admin_id"   VARCHAR2(20)      NOT NULL
);

CREATE TABLE "admin_tbl" (
   "admin_id"   VARCHAR2(20)      NOT NULL,
   "admin_pwd"   VARCHAR2(20)      NOT NULL,
   "admin_name"   VARCHAR2(20)      NOT NULL
);

CREATE TABLE "user_tbl" (
   "user_id"   VARCHAR2(20)      NOT NULL,
   "user_pwd"   VARCHAR2(20)      NOT NULL,
   "user_name"   VARCHAR2(20)      NOT NULL,
   "user_email"   VARCHAR2(30)      NOT NULL,
   "user_phone"   VARCHAR2(20)      NOT NULL,
   "joinDate"   DATE   DEFAULT SYSDATE   NOT NULL,
   "user_img"   VARCHAR2(300)      NOT NULL
);

CREATE TABLE "recipe_page_img" (
   "rec_img_id"   NUMBER   DEFAULT 1   NOT NULL,
   "recipe_num"   NUMBER   DEFAULT 1   NOT NULL,
   "rec_img_file_name"   VARCHAR2(300)      NOT NULL,
   "rec_img_no"   NUMBER   DEFAULT 1   NOT NULL
);

CREATE TABLE "recipe_page_desc" (
   "rec_text_id"   NUMBER   DEFAULT 1   NOT NULL,
   "recipe_num"   NUMBER   DEFAULT 1   NOT NULL,
   "rec_text"   VARCHAR2(2000)      NULL,
   "rec_text_no"   NUMBER   DEFAULT 1   NULL
);

CREATE TABLE "guide_page_img" (
   "gui_img_id"   NUMBER   DEFAULT 1   NOT NULL,
   "gui_num"   NUMBER   DEFAULT 1   NOT NULL,
   "gui_img_file_name"   VARCHAR2(300)     NOT NULL,
   "gui_img_no"   NUMBER   DEFAULT 1   NOT NULL
);

CREATE TABLE "guide_page_desc" (
   "gui_text_id"   NUMBER   DEFAULT 1   NOT NULL,
   "gui_num"   NUMBER   DEFAULT 1   NOT NULL,
   "gui_text"   VARCHAR2(2000)      NULL,
   "gui_text_no"   NUMBER   DEFAULT 1   NULL
);

CREATE TABLE "gui_pick" (
   "pick_id"   NUMBER      NOT NULL,
   "gui_num"   NUMBER      NOT NULL,
   "user_id"   VARCHAR2(20)      NOT NULL,
   "gui_pick_datetime"   DATE   DEFAULT SYSDATE   NOT NULL
);

CREATE TABLE "rec_pick" (
   "pick_id"   NUMBER      NOT NULL,
   "rec_num"   NUMBER      NOT NULL,
   "user_id"   VARCHAR2(20)      NOT NULL,
   "rec_pick_datetime"   DATE   DEFAULT SYSDATE   NOT NULL
);

CREATE TABLE "qna_page_desc" (
   "qna_img_id"   NUMBER   DEFAULT 1   NOT NULL,
   "qna_num"   NUMBER   DEFAULT 1   NOT NULL,
   "qna_img_file_name"   VARCHAR2(300)      NOT NULL,
   "qna_img_no"   NUMBER   DEFAULT 1   NOT NULL
);

CREATE TABLE "mypost_tbl" (
   "post_num"   NUMBER   DEFAULT 1   NOT NULL,
   "qna_num"   NUMBER   DEFAULT 1   NOT NULL,
   "myRe_num"   NUMBER   DEFAULT 1   NOT NULL,
   "user_img"   VARCHAR2(300)      NOT NULL
);

CREATE TABLE "myreply_tbl" (
   "mp_re_num"   NUMBER   DEFAULT 1   NOT NULL,
   "q_re_num"   NUMBER   DEFAULT 1   NOT NULL,
   "qna_num"   NUMBER   DEFAULT 1   NOT NULL,
   "m_re_num"   NUMBER   DEFAULT 1   NOT NULL,
   "myRe_num"   NUMBER   DEFAULT 1   NOT NULL
);

CREATE TABLE "myrecipe_page_desc" (
   "qna_img_id"   NUMBER   DEFAULT 1   NOT NULL,
   "myRe_num"   NUMBER   DEFAULT 1   NOT NULL,
   "qna_img_file_name"   VARCHAR2(300)      NOT NULL,
   "qna_img_no"   NUMBER   DEFAULT 1   NOT NULL
);