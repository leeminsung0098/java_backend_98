import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private Map<Integer, Post> posts;
    private int postId;

    public Board() {
        this.posts = new HashMap<>();
        this.postId = 1;
    }

    public void createPost(String title, String content, Date time) {
        Post post = new Post(title, content, time);
        posts.put(postId, post);
        postId++;
        System.out.println("게시물이 작성");
    }

    public void viewPost(int postId) {
        if (posts.containsKey(postId)) {
            Post post = posts.get(postId);
            System.out.println("제목: " + post.getTitle());
            System.out.println("내용: " + post.getContent());
            System.out.println("작성 시간: " + post.getTime());
            System.out.println("댓글:");
            List<String> comments = post.getComments();
            if (comments.equals("")) {
                System.out.println("댓글이 없습니다.");
            } else {
                for (String comment : comments) {
                    System.out.println("- " + comment);
                }
            }
        } else {
            System.out.println("해당 게시물을 찾을 수 없습니다.");
        }
    }

    public void addCommentToPost(int postId, String comment) {
        if (posts.containsKey(postId)) {
            Post post = posts.get(postId);
            post.addComment(comment);
            System.out.println("댓글이 추가되었습니다.");
        } else {
            System.out.println("해당 게시물을 찾을 수 없습니다.");
        }
    }

    public void updatePost(int postId, String update_title, String update_content) {
        if (posts.containsKey(postId)) {
            Post post = posts.get(postId);
            post.setTitle(update_title);
            post.setContent(update_content);
            System.out.println("게시물이 수정되었습니다.");
        } else {
            System.out.println("해당 게시물을 찾을 수 없습니다.");
        }
    }
}