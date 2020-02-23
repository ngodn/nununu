package id.boxee.customlogin;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LoginViewPagerAdapter extends FragmentPagerAdapter {

    public LoginViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new LoginJoinFragment(); //ChildFragment1 at position 0
            case 1:
                return new LoginCreateFragment(); //ChildFragment2 at position 1

        }
        return null; //does not happen
    }

    @Override
    public int getCount() {
        return 2; //three fragments
    }

    @Override
    public CharSequence getPageTitle(int position) {
//        String title = getItem(position).getClass().getName();
//        return title.subSequence(title.lastIndexOf(".") + 1, title.length());

        switch (position)
        {
            case 0:
                return "Join";
            case 1:
                return "Create";
        }
        return null;
    }
}
