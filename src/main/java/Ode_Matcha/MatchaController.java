package Ode_Matcha;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Ode_Matcha.Diary_Items.DiaryEntry;

@RestController
@RequestMapping("matcha")
public class MatchaController {
  @PostMapping
  public void addMatcha(@RequestBody DiaryEntry matcha) throws Exception {
    GoogleSheetsService.appendRow(matcha);
    System.out.println("Added Matcha");
  }

  @GetMapping
  public List<DiaryEntry> getMatchas() throws Exception {
    return GoogleSheetsService.readData();
  }

}
