package seedu.address.model.person;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RemarkTest {

    @Test
    public void equals() {
        Remark remark = new Remark("She likes aardvarks.");

        // same values -> returns true
        assertTrue(remark.equals(new Remark("She likes aardvarks.")));

        // same object -> returns true
        assertTrue(remark.equals(remark));

        // null -> returns false
        assertFalse(remark.equals(null));

        // different types -> returns false
        assertFalse(remark.equals(1));

        // different values -> returns false
        assertFalse(remark.equals(new Remark("He likes aardvarks.")));
    }
}
