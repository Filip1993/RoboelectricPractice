package com.filipkesteli.roboelectricpractice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;

/**
 * Testiranje aplikacije
 */

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21) //Roboelectric sad moze naci gdje su klase s obzirom na drukcije flavoure
public class RoboelectricActivityTest {
    @Test
    public void shouldNotBeNull() {
        RoboelectricActivity roboelectricActivity = Robolectric.setupActivity(RoboelectricActivity.class);
        assertNotNull(roboelectricActivity);
    }
}