import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class NotepadApplication {

    private static List<Note> notes = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(NotepadApplication.class, args);
    }

    @GetMapping("/notes")
    public List<Note> getNotes() {
        return notes;
    }

    @PostMapping("/notes")
    public void addNote(@RequestBody Note note) {
        notes.add(note);
    }

    static class Note {
        private String text;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
}
