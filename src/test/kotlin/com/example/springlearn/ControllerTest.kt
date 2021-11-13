package com.example.springlearn

// Junit 5
import org.hamcrest.Matchers
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers


@ExtendWith(SpringExtension::class)
@WebMvcTest(MVCController::class) // <1>
class ControllerTest {
    @Autowired
    private val mockMvc // <2>
            : MockMvc? = null

    @Test
    fun testHomePage() {
        mockMvc!!.perform(MockMvcRequestBuilders.get("/")) // <3>
            .andExpect(MockMvcResultMatchers.status().isOk) // <4>
            .andExpect(MockMvcResultMatchers.view().name("index")) // <5>
            .andExpect(
                MockMvcResultMatchers.content().string( // <6>
                    Matchers.containsString("Welcome to...")
                )
            )
    }
}