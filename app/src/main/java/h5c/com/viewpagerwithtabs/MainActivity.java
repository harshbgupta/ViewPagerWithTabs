package h5c.com.viewpagerwithtabs;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    CustumViewPagerAdapter adapter;

    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        //Step 1
        adapter = new CustumViewPagerAdapter(getSupportFragmentManager());

        //step 2
        viewPager.setAdapter(adapter);

        //step 3
        tabLayout.setupWithViewPager(viewPager,true);

        //for Manually selecting (2+1) tab
        /*TabLayout.Tab tab = tabLayout.getTabAt(2);
        tab.select();*/

    }
}
