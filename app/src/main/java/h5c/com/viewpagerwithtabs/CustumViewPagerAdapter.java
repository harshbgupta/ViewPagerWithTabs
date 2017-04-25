package h5c.com.viewpagerwithtabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * @author Harsh on 25-04-2017.
 */

public class CustumViewPagerAdapter extends FragmentPagerAdapter {

    public CustumViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Fragment1 fragment1 = new Fragment1();
                return fragment1;
            case 1:
                Fragment2 fragment2 = new Fragment2();
                return fragment2;
            case 2:
                Fragment3 fragment3 = new Fragment3();
                return fragment3;
        }
        return null;
    }

    @Override
    public int getCount() {
        //3 pages
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "Harsh";
            case 1: return "Happie";
            case 2: return "Lucifer";
        }
        return null;
    }
}
