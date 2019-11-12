package com.drs.baseadapter.bean;

/**
 * @author: drs
 * @time: 2019/11/12 10:40
 * @des:
 */
public class NavigationBarBean {
    /**
     * navigationBar : {"rightButton":{"actionName":"showShareModel()","iconURL":"http://7xpn56.com1.z0.glb.clouddn.com/699b13de-993f-4553-8f28-79a9d135c220NWM.png","titleText":""},"titleText":"车辆详情"}
     */

   /* private NavigationBarBean navigationBar;

    public NavigationBarBean getNavigationBar() {
        return navigationBar;
    }

    public void setNavigationBar(NavigationBarBean navigationBar) {
        this.navigationBar = navigationBar;
    }*/

//    public static class NavigationBarBean {
        /**
         * rightButton : {"actionName":"showShareModel()","iconURL":"http://7xpn56.com1.z0.glb.clouddn.com/699b13de-993f-4553-8f28-79a9d135c220NWM.png","titleText":""}
         * titleText : 车辆详情
         */

        private RightButtonBean rightButton;
        private String titleText;

        public RightButtonBean getRightButton() {
            return rightButton;
        }

        public void setRightButton(RightButtonBean rightButton) {
            this.rightButton = rightButton;
        }

        public String getTitleText() {
            return titleText;
        }

        public void setTitleText(String titleText) {
            this.titleText = titleText;
        }

        public static class RightButtonBean {
            /**
             * actionName : showShareModel()
             * iconURL : http://7xpn56.com1.z0.glb.clouddn.com/699b13de-993f-4553-8f28-79a9d135c220NWM.png
             * titleText :
             */

            private String actionName;
            private String iconURL;
            private String titleText;

            public String getActionName() {
                return actionName;
            }

            public void setActionName(String actionName) {
                this.actionName = actionName;
            }

            public String getIconURL() {
                return iconURL;
            }

            public void setIconURL(String iconURL) {
                this.iconURL = iconURL;
            }

            public String getTitleText() {
                return titleText;
            }

            public void setTitleText(String titleText) {
                this.titleText = titleText;
            }
        }
}
