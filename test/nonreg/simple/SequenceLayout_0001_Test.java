package nonreg.simple;

import nonreg.BasicTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/*

Test diagram MUST be put between triple quotes

"""
@startuml
skinparam {
   Maxmessagesize 200
}
group Grouping messages
    Test <- Test    : The group frame [now] does draw a border around the text (located on the left side), [no longer] ignores its presence, and also [no longer] ignores the presence of a line.
end
@enduml
"""

 */
public class SequenceLayout_0001_Test extends BasicTest {

	@Test
	void testIssue1680() throws IOException {
		checkImage("(1 participants)");
	}

}
