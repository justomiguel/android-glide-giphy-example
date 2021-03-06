package burrows.apps.giphy.example.ui.adapter.model;

import org.junit.Test;
import test.TestBase;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class GiphyImageInfoTest extends TestBase {
  private final GiphyImageInfo sut = new GiphyImageInfo().withUrl(STRING_UNIQUE);

  @Test public void getUrl() {
    assertThat(sut.getUrl()).isEqualTo(STRING_UNIQUE);
  }

  @Test public void withUrl() {
    sut.withUrl(STRING_UNIQUE2);

    assertThat(sut.getUrl()).isEqualTo(STRING_UNIQUE2);
  }
}
