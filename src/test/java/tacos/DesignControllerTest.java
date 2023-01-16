package tacos;

import lombok.ToString;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class DesignControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Design View에 Ingredient 객체가 뿌려지는지 확인한다.")
    public void designControllerTest() throws Exception {
        mockMvc.perform(get("/design"))
                .andExpect(status().isOk());
    }
}
