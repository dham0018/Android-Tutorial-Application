package com.hemish.tutorialapplication;

import android.content.Intent;

import java.util.HashMap;
import java.util.List;

/**
 * Created by dhame on 6/14/2019.
 */

public class TabDataProvider {
    private static HashMap<String, TabDetailsPojoClass> mTutorialData;

    public static void setTutorialInfo() {

        mTutorialData = new HashMap<String, TabDetailsPojoClass>();

        mTutorialData.put("Home", new TabDetailsPojoClass("<p><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"tutorial_img.jpg\" width=\"242\" height=\"161\" /></p><p style=\"text-align: justify;\">Android development tutorial covers basic and advanced concepts of android technology. Our Android Studio tutorial is developed for beginners and professionals.</p><p style=\"text-align: justify;\"><strong>Android</strong>&nbsp;is a complete set of software for mobile devices such as tablet computers, notebooks, smartphones, electronic book readers, set-top boxes etc.</p><p style=\"text-align: justify;\">It contains a&nbsp;<strong>linux-based Operating System</strong>,&nbsp;<strong>middleware</strong>&nbsp;and&nbsp;<strong>key mobile applications</strong>.</p><p style=\"text-align: justify;\">It can be thought of as a mobile operating system. But it is not limited to mobile only. It is currently used in various devices such as mobiles, tablets, televisions etc.</p>", "", ""));
        mTutorialData.put("What is Android", new TabDetailsPojoClass("<h1>What is Android?</h1> <p><img style=\"float: right;\" src=\"what_android.png\" width=\"150\" height=\"150/\" /><strong>Android</strong>&nbsp;is a software package and Linux based operating system for mobile devices such as tablet computers and smartphones.</p> <p>It is developed by Google and later the OHA (Open Handset Alliance). Java language is mainly used to write the Android code even though other languages can be used.</p> <p>The goal of the Android project is to create a successful real-world product that improves the mobile experience for end users.</p><hr /><h1>Why Android?</h1><p><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"why_android.jpg\" width=\"300\" height=\"300\" /></p><hr /><h1>Features of Android</h1><p>Android is a powerful operating system competing with Apple 4GS and supports great features. Few of them are listed below &minus;</p><table border=\"1\"><tbody><tr><th>NO.</th> <th>Feature &amp; Description</th></tr><tr><td>1</td><td><p><strong>Beautiful UI</strong></p><p>Android OS basic screen provides a beautiful and intuitive user interface.</p></td></tr><tr><td>2</td><td><p><strong>Connectivity</strong></p><p>GSM/EDGE, IDEN, CDMA, EV-DO, UMTS, Bluetooth, Wi-Fi, LTE, NFC and WiMAX.</p></td></tr><tr> <td>3</td><td><p><strong>Storage</strong></p><p>SQLite, a lightweight relational database, is used for data storage purposes.</p></td></tr><tr> <td>4</td> <td> <p><strong>Media support</strong></p> <p>H.263, H.264, MPEG-4 SP, AMR, AMR-WB, AAC, HE-AAC, AAC 5.1, MP3, MIDI, Ogg Vorbis, WAV, JPEG, PNG, GIF, and BMP.</p> </td> </tr> <tr> <td>5</td> <td> <p><strong>Messaging</strong></p> <p>SMS and MMS</p> </td> </tr> <tr> <td>6</td> <td> <p><strong>Web browser</strong></p> <p>Based on the open-source WebKit layout engine, coupled with Chrome's V8 JavaScript engine supporting HTML5 and CSS3.</p> </td> </tr> <tr> <td>7</td> <td> <p><strong>Multi-touch</strong></p> <p>Android has native support for multi-touch which was initially made available in handsets such as the HTC Hero.</p> </td> </tr> <tr> <td>8</td> <td> <p><strong>Multi-tasking</strong></p> <p>User can jump from one task to another and same time various application can run simultaneously.</p> </td> </tr> <tr> <td>9</td> <td> <p><strong>Resizable widgets</strong></p> <p>Widgets are resizable, so users can expand them to show more content or shrink them to save space.</p> </td> </tr> <tr> <td>10</td> <td> <p><strong>Multi-Language</strong></p> <p>Supports single direction and bi-directional text.</p> </td> </tr> <tr> <td>11</td> <td> <p><strong>GCM</strong></p> <p>Google Cloud Messaging (GCM) is a service that lets developers send short message data to their users on Android devices, without needing a proprietary sync solution.</p> </td> </tr> <tr> <td>12</td> <td> <p><strong>Wi-Fi Direct</strong></p> <p>A technology that lets apps discover and pair directly, over a high-bandwidth peer-to-peer connection.</p> </td> </tr> <tr> <td>13</td> <td> <p><strong>Android Beam</strong></p> <p>A popular NFC-based technology that lets users instantly share, just by touching two NFC-enabled phones together.</p> </td> </tr> </tbody> </table><h1>Categories of Android Application</h1> <p>There are many android applications in the market. The top categories are:</p> <ul> <li>Music</li> <li>News</li> <li>Multimedia</li> <li>Sports</li> <li>Lifestyle</li> <li>Food and Drink</li> <li>Social</li> <li>Weather</li> <li>Travel and Local</li> <li>Finance</li> <li>Navigation</li> <li>Books</li> <li>Reference</li> <li>Business</li> <li>Utilities</li> </ul>", "", ""));
        mTutorialData.put("History of Android Version",new TabDetailsPojoClass("<h1>History of Android</h1> <p>The code names of Android ranges from A to N currently, such as Aestro, Blender, Cupcake, Donut, Eclair, Froyo, Gingerbread, Honeycomb, Ice Cream Sandwich, Jelly Bean, KitKat, Lollipop and Marshmallow. Let's understand the android history in a sequence with API level.</p> <h3>What is API level?</h3> <p>API Level is an integer value that uniquely identifies the framework API revision offered by a version of the Android platform.</p> <p>The Android platform provides a framework API that applications can use to interact with the underlying Android system. The framework API consists of:</p> <ul> <li>A core set of packages and classes</li> <li>A set of XML elements and attributes for declaring a manifest file</li> <li>A set of XML elements and attributes for declaring and accessing resources</li> <li>A set of Intents</li> <li>A set of permissions that applications can request, as well as permission enforcements included in the system</li> </ul> <p>Each successive version of the Android platform can include updates to the Android application framework API that it delivers.</p> <p>Updates to the framework API are designed so that the new API remains compatible with earlier versions of the API. That is, most changes in the API are additive and introduce new or replacement functionality. As parts of the API are upgraded, the older replaced parts are deprecated but are not removed, so that existing applications can still use them. In a very small number of cases, parts of the API may be modified or removed, although typically such changes are only needed to ensure API robustness and application or system security. All other API parts from earlier revisions are carried forward without modification.</p> <p>The framework API that an Android platform delivers is specified using an integer identifier called \"API Level\". Each Android platform version supports exactly one API Level, although support is implicit for all earlier API Levels (down to API Level 1). The initial release of the Android platform provided API Level 1 and subsequent releases have incremented the API Level.</p> <p>The following table specifies the API Level supported by each version of the Android platform.</p> <table style=\"margin-left: auto; margin-right: auto;\" border=1 cellspacing=\"10\"> <tbody> <tr> <th>Code<br />name</th> <th>Version<br />number</th> <th>Initial release<br />date</th> <th>API<br />level</th> </tr> <tr> <td>No Codename</td> <td>1.0</td> <td>September 23, 2008</td> <td>1</td> </tr> <tr> <td>Petit Four</td> <td>1.1</td> <td>February 9, 2009</td> <td>2</td> </tr> <tr> <td>CupCake</td> <td>1.5</td> <td>April 27, 2009</td> <td>3</td> </tr> <tr> <td>Donut</td> <td>1.6</td> <td>September 15, 2009</td> <td>4</td> </tr> <tr> <td>Eclair</td> <td>2.0 &ndash; 2.1</td> <td>October 26, 2009</td> <td>5 &ndash; 7</td> </tr> <tr> <td>Froyo</td> <td>2.2 &ndash; 2.2.3</td> <td>May 20, 2010</td> <td>8</td> </tr> <tr> <td>Gingerbread</td> <td>2.3 &ndash; 2.3.7</td> <td>December 6, 2010</td> <td>9 &ndash; 10</td> </tr> <tr> <td>Honeycomb</td> <td>3.0 &ndash; 3.2.6</td> <td>February 22, 2011</td> <td>11 &ndash; 13</td> </tr> <tr> <td>Ice Cream Sandwich</td> <td>4.0 &ndash; 4.0.4</td> <td>October 18, 2011</td> <td>14 &ndash; 15</td> </tr> <tr> <td>Jelly Bean</td> <td>4.1 &ndash; 4.3.1</td> <td>July 9, 2012</td> <td>16 &ndash; 18</td> </tr> <tr> <td>KitKat</td> <td>4.4 &ndash; 4.4.4</td> <td>October 31, 2013</td> <td>19 &ndash; 20</td> </tr> <tr> <td>Lollipop</td> <td>5.0 &ndash; 5.1.1</td> <td>November 12, 2014</td> <td>21 &ndash; 22</td> </tr> <tr> <td>Marshmallow</td> <td>6.0 &ndash; 6.0.1</td> <td>October 5, 2015</td> <td>23</td> </tr> <tr> <td>Nougat</td> <td>7.0 &ndash; 7.1.2</td> <td>August 22, 2016</td> <td>24 &ndash; 25</td> </tr> <tr> <td>Oreo</td> <td>8.0 &ndash; 8.1</td> <td>August 21, 2017</td> <td>26 &ndash; 27</td> </tr> <tr> <td>Pie</td> <td><strong>9.0</strong></td> <td>August 6, 2018</td> <td>28</td> </tr> <tr> <td>Android Q</td> <td>10.0</td> <td>&nbsp;</td> <td>29</td> </tr> </tbody> </table>","",""));
        mTutorialData.put("Android Architecture", new TabDetailsPojoClass("<h1>Android Architecture</h1> <p style=\"text-align: justify;\"><strong>Android architecture</strong>&nbsp;or&nbsp;<strong>Android software stack</strong>&nbsp;is categorized into five sections and four main layers:</p> <ol style=\"text-align: justify;\"> <li>Linux kernel</li> <li>native libraries (middleware),</li> <li>Android Runtime</li> <li>Application Framework</li> <li>Applications</li> </ol> <p style=\"text-align: justify;\">Let's see the android architecture diagram first.</p> <p><img src=\"architecture_img.png\" width=360 height=400/></p> <h2 class=\"\\&quot;h2\\&quot;\" style=\"text-align: justify;\">1) Linux kernel</h2> <p style=\"text-align: justify;\">It is the heart of android architecture that exists at the root of android architecture.&nbsp;<strong>Linux kernel</strong>&nbsp;is responsible for device drivers, power management, memory management, device management, and resource access.</p> <hr /> <h2 class=\"\\&quot;h2\\&quot;\" style=\"text-align: justify;\">2)Libraries</h2> <p style=\"text-align: justify;\">On top of Linux kernel, there is a set of libraries including open-source Web browser engine WebKit, well-known library libc, SQLite database which is a useful repository for storage and sharing of application data, libraries to play and record audio and video, SSL libraries responsible for Internet security etc.</p> <h2 style=\"text-align: justify;\">Android Libraries</h2> <p style=\"text-align: justify;\">This category encompasses those Java-based libraries that are specific to Android development. Examples of libraries in this category include the application framework libraries in addition to those that facilitate user interface building, graphics drawing, and database access. A summary of some key core Android libraries available to the Android developer is as follows &minus;</p> <ul class=\"\\&quot;list\\&quot;\" style=\"text-align: justify;\"> <li> <p><strong>android.app</strong>&nbsp;&minus; Provides access to the application model and is the cornerstone of all Android applications.</p> </li> <li> <p><strong>android.content</strong>&nbsp;&minus; Facilitates content access, publishing and messaging between applications and application components.</p> </li> <li> <p><strong>android.database</strong>&nbsp;&minus; Used to access data published by content providers and includes SQLite database management classes.</p> </li> <li> <p><strong>android.opengl</strong>&nbsp;&minus; A Java interface to the OpenGL ES 3D graphics rendering API.</p> </li> <li> <p><strong>android.os</strong>&nbsp;&minus; Provides applications with access to standard operating system services including messages, system services and inter-process communication.</p> </li> <li> <p><strong>android.text</strong>&nbsp;&minus; Used to render and manipulate text on a device display.</p> </li> <li> <p><strong>android.view</strong>&nbsp;&minus; The fundamental building blocks of application user interfaces.</p> </li> <li> <p><strong>android.widget</strong>&nbsp;&minus; A rich collection of pre-built user interface components such as buttons, labels, list views, layout managers, radio buttons etc.</p> </li> <li> <p><strong>android.webkit</strong>&nbsp;&minus; A set of classes intended to allow web-browsing capabilities to be built into applications.</p> </li> </ul> <p style=\"text-align: justify;\">Having covered the Java-based core libraries in the Android runtime, it is now time to turn our attention to the C/C++ based libraries contained in this layer of the Android software stack.</p> <hr /> <h2 class=\"\\&quot;h2\\&quot;\" style=\"text-align: justify;\">3) Android Runtime</h2> <p style=\"text-align: justify;\">In android runtime, there are core libraries and DVM (Dalvik Virtual Machine) which is responsible to run android application. DVM is like JVM but it is optimized for mobile devices. It consumes less memory and provides fast performance.</p> <hr /> <h2 class=\"\\&quot;h2\\&quot;\" style=\"text-align: justify;\">4) Android Framework</h2> <p style=\"text-align: justify;\">The Application Framework layer provides many higher-level services to applications in the form of Java classes. Application developers are allowed to make use of these services in their applications.</p> <p style=\"text-align: justify;\">The Android framework includes the following key services &minus;</p> <ul class=\"\\&quot;list\\&quot;\" style=\"text-align: justify;\"> <li> <p><strong>Activity Manager</strong>&nbsp;&minus; Controls all aspects of the application lifecycle and activity stack.</p> </li> <li> <p><strong>Content Providers</strong>&nbsp;&minus; Allows applications to publish and share data with other applications.</p> </li> <li> <p><strong>Resource Manager</strong>&nbsp;&minus; Provides access to non-code embedded resources such as strings, color settings, and user interface layouts.</p> </li> <li> <p><strong>Notifications Manager</strong>&nbsp;&minus; Allows applications to display alerts and notifications to the user.</p> </li> <li> <p><strong>View System</strong>&nbsp;&minus; An extensible set of views used to create application user interfaces.</p> </li> </ul> <hr /> <h2 class=\"\\&quot;h2\\&quot;\" style=\"text-align: justify;\">5) Applications</h2> <p style=\"text-align: justify;\">On top of the Android framework, there are applications. All applications such as home, contact, settings, games, browsers are using an android framework that uses android runtime and libraries. Android runtime and native libraries are using the Linux kernel.</p>", "", ""));
        mTutorialData.put("Android Components",new TabDetailsPojoClass("<h1>Android Application Component</h1> <p style=\"text-align: justify;\">Android components are the essential building blocks of an Android application.</p> <p style=\"text-align: justify;\">The&nbsp;<strong>core building blocks</strong>&nbsp;or&nbsp;<strong>fundamental components</strong>&nbsp;of Android are loosely coupled by the application manifest file&nbsp;<em>AndroidManifest.xml</em>&nbsp;that describes each component of the application and how they interact.</p> <p style=\"text-align: justify;\">There are following four main components that can be used within an Android application:</p> <p style=\"text-align: justify;\"><strong>1) Activity:&nbsp;</strong>An activity represents a single screen with a user interface,in-short Activity performs actions on the screen.</p> <p style=\"text-align: justify;\"><strong>2) Service:&nbsp;</strong>A service is a component that runs in the background to perform long-running operations.</p> <p style=\"text-align: justify;\"><strong>3)&nbsp;Broadcast Receivers:&nbsp;</strong>Broadcast Receivers simply respond to broadcast messages from other applications or from the system.</p> <p style=\"text-align: justify;\"><strong>4) Content Provider:&nbsp;</strong>A content provider component supplies data from one application to others on request.</p> <h3 style=\"text-align: justify;\">Additional Components:</h3> <p style=\"text-align: justify;\">There are additional components which will be used in the construction of above-mentioned entities, their logic, and wiring between them. These components are:&nbsp;</p> <p style=\"text-align: justify;\"><strong>1)&nbsp;Fragment:&nbsp;</strong>Fragments are like parts of the activity. An activity can display one or more fragments on the screen at the same time.</p> <p style=\"text-align: justify;\"><strong>2)&nbsp;View:&nbsp;</strong>A view is the UI elements such as button, label, text field, etc. Anything that you see is a view.</p> <p style=\"text-align: justify;\"><strong>3) Layout:&nbsp;</strong>View hierarchies that control screen format and appearance of the views.</p> <p style=\"text-align: justify;\"><strong>4)&nbsp;&nbsp;Intent:&nbsp;</strong></p> <p style=\"text-align: justify;\">The intent is used to invoke components. It is mainly used to:</p> <ul class=\"points\" style=\"text-align: justify;\"> <li>Start the service</li> <li>Launch an activity</li> <li>Display a web page</li> <li>Display a list of contacts</li> <li>Broadcast a message</li> <li>Dial a phone call etc.</li> </ul> <p style=\"text-align: justify;\"><strong>5)&nbsp;Resource:&nbsp;</strong>In&nbsp;Android, almost everything is a&nbsp;resource. Defining resources&nbsp;that you can then access in your app is an essential part of&nbsp;Android&nbsp;development.&nbsp;Resources&nbsp;are used for anything from defining colors, images, layouts, menus, and string values.</p> <p style=\"text-align: justify;\"><strong>6) AndroidManifest.xml:&nbsp;</strong>It provides the structure and metadata of our application, its components, and its requirements.</p> <p style=\"text-align: justify;\"><strong>7) Android Virtual Device (AVD):&nbsp;</strong>AVD is used to test the android application without the need for mobile or tablet. It can be created in different configurations to emulate different types of real devices.</p>","",""));
        mTutorialData.put("Android Environment Setup", new TabDetailsPojoClass("<h1 style=\"text-align: center;\">Android Development Environment Setup</h1> <hr /> <p id=\"divandenvstp\">Generally to build an application for Android we should have Java Development Kit (JDK), Android SDK, and a development environment.&nbsp;</p> <p>The Android SDK is compatible with Windows, Mac, and Linux operating systems to build android applications based on our requirements.&nbsp;</p> <p>We can setup an Android development environment using the following two ways&nbsp;</p> <ol> <li>Setup Eclipse IDE Manually (<strong>Depreciated</strong>)</li> <li>Android Studio</li> </ol> <p>Initially, Google supported a Manual&nbsp;<strong>Eclipse IDE Setup</strong>&nbsp;for android development environment by downloading required components like Eclipse IDE, Android SDK, Java Development Kit (JDK), etc. from the official site. Afterwards, Google introduced a component called&nbsp;<strong>Android Studio</strong>&nbsp;to make environment setup process simple.&nbsp;</p> <p>By using&nbsp;<strong>Android Studio</strong>&nbsp;bundle we can easily setup an Android development environment in any operating system to implement android applications.&nbsp;</p> <p>Android Studio is a combination of the following components to allow users to implement android applications.&nbsp;</p> <ol> <li>Eclipse IDE</li> <li>Android SDK</li> <li>Android Virtual Device</li> <li>Eclipse Plugin</li> </ol> <p>By downloading&nbsp;<strong>Android Studio</strong>&nbsp;directly from Google website to setup we can easily setup the development environment.</p> <p>&nbsp;</p>","",""));
        mTutorialData.put("Install Android Studio",new TabDetailsPojoClass("<h1 style=\"text-align: center;\">Android Development Environment Setup</h1> <hr /> <p id=\"divanstin\">Initially, to setup an Android development environment in our system, we need to install the following components manually by downloading from different sites.&nbsp;</p> <ol> <li>Eclipse IDE</li> <li>Eclipse Plugin</li> <li>Android SDK</li> </ol> <p>To make an android development environment setup process simple Google introduced a new android IDE called&nbsp;<strong>Android Studio</strong>. The&nbsp;<strong>Android Studio </strong>will&nbsp;contain all the required components like Eclipse IDE, Eclipse Plugin and Android SDK so we don&rsquo;t need to download the components separately.&nbsp;</p> <p><strong>Android Studio</strong>&nbsp;is the official IDE for android development and it&rsquo;s based on&nbsp;<strong>IntelliJ IDEA</strong>&nbsp;software. It&rsquo;s available for Windows, MAC and LINUX operating systems.&nbsp;</p> <p>We can download the latest version of Android Studio from the following URL.&nbsp;</p> <p style=\"text-align: center;\"><strong><a title=\"Download Android Studio SDK\" href=\"https://developer.android.com/studio/index.html\" target=\"_blank\" rel=\"noopener\">Download Android Studio</a></strong>&nbsp;</p> <p>In this tutorial, we are going to explain how to install android studio on a windows machine which is having windows 10 operating system.&nbsp;</p> <p>Download the latest version of Android Studio from above URL and launch&nbsp; <strong>Android Studio.exe</strong>&nbsp;file by double-clicking on it.&nbsp;</p> <p>The initial android studio setup screen will open like as shown below in that click&nbsp;<strong>Next</strong>&nbsp;to continue for further steps of environment setup.</p> <p><img src=\"android_welcome_img.png\" width=\"400\" height=\"400\" /></p> <p>Now we need to select a required component to setup an android environment. Here we selected all three components (<strong>Android Studio</strong>,&nbsp;<strong>Android SDK&nbsp; </strong>and&nbsp;<strong>Android Virtual Device</strong>) and click&nbsp;<strong>Next</strong>&nbsp;like as shown below.</p> <p><img src=\"android_choose_img.png\" width=\"400\" height=\"400\" /></p><p>Now we need to agree on the License agreements to proceed further, click on&nbsp;<strong>I Agree</strong>&nbsp;button like a shown below.</p> <p><img src=\"android_agree_img.png\" width=\"400\" height=\"400\" /></p> <p>Now we need to specify the local machine drive location to install Android Studio and Android SDK. After selecting the location path to install the required components, click&nbsp;<strong>Next</strong>&nbsp;like as shown below.</p> <p><img src=\"android_location_img.png\" width=\"400\" height=\"400\" /></p> <p>Now select the start menu folder to create a shortcut for android studio and click&nbsp;<strong>Install</strong>&nbsp;like as shown below.</p> <p><img src=\"android_shortcut_img.png\" width=\"400\" height=\"400\" /></p><p>Once we click Install button the installation process will start and click&nbsp;<strong>Next&nbsp; </strong>after completion of installation like as shown below.</p> <p><img src=\"android_install_completion_img.png\" width=\"400\" height=\"400\" /></p> <p>After that, it will show installation completion wizard in that click&nbsp;<strong>Finish</strong>&nbsp;to launch android studio like as shown below.</p> <p><img src=\"android_finish_img.png\" width=\"400\" height=\"400\" /></p> <p>While launching&nbsp;<strong>Android Studio</strong>&nbsp;it will give you an option to import settings from the previous version of studio. In case if you don&rsquo;t have any previous version, select the second option and click&nbsp;<strong>OK</strong>&nbsp;like as shown below.</p> <p><img src=\"android_importsetting_img.png\" width=\"400\" height=\"400\" /></p><p>Now android studio will open a welcome wizard window in that click&nbsp;<strong>Next</strong>&nbsp;to validate our current Android SDK and development environment setup like as shown below.</p> <p><img src=\"android_welcome_wizard_img.png\" width=\"400\" height=\"400\" /></p> <p>Now select a&nbsp;<strong>Standard</strong>&nbsp;installation type and click&nbsp;<strong>Next</strong>&nbsp;to install common settings and options like as shown below.</p> <p><img src=\"android_standardsetting_img.png\" width=\"400\" height=\"400\" /></p> <p>Now verify settings and click&nbsp;<strong>Finish</strong>&nbsp;to complete android studio setup process like as shown below.</p> <p><img src=\"android_verifysetting_img.png\" width=\"400\" height=\"400\" /></p><p>After completion of required components installation click on&nbsp;<strong>Finish</strong>&nbsp;like as shown below.</p> <p><img src=\"android_aftercompletion_wizard_img.jpg\" width=\"400\" height=\"400\" /></p> <p>After completion of all required components installation, we will be able to see Android Studio welcome window like as shown below.</p> <p><img src=\"android_welcomemain_img.png\" width=\"400\" height=\"400\" /></p>","",""));
        mTutorialData.put("Setup Eclipse",new TabDetailsPojoClass("<h1 style=\"text-align: center;\">How to setup Android for Eclipse IDE</h1> <hr /> <p>In this page, you will learn what software is required for running an android application on eclipse IDE. Here, you will be able to learn how to install the Android SDK and ADT plugin for Eclipse IDE. Let's see the list of software required to&nbsp;<strong>setup android for eclipse</strong>&nbsp;IDE manually.</p> <ol class=\"points\"> <li>Install the JDK</li> <li>Download and install the Eclipse for developing an android application</li> <li>Download and Install the Android SDK</li> <li>Install the ADT plugin for eclipse</li> <li>Configure the ADT plugin</li> <li>Create the AVD</li> <li>Create the hello android application</li> </ol> <h2 class=\"h2\">1) Install the Java Development Kit (JDK)</h2> <p>For creating an android application, JDK must be installed if you are developing the android application with Java language.&nbsp;<a href=\"http://www.oracle.com/technetwork/java/javase/downloads/index.html\" target=\"_blank\" rel=\"noopener\">download the JDK</a></p> <hr /> <h2 class=\"h2\">2) Download and install the Eclipse IDE</h2> <p>For developing the android application using eclipse IDE, you need to install the Eclipse. you can download it from this location&nbsp;<a href=\"http://www.eclipse.org/downloads/\" target=\"_blank\" rel=\"noopener\">download the Eclipse</a>. Eclipse classic version is recommended but we are using the Eclipse IDE for JavaEE Developers.</p> <hr /> <h2 class=\"h2\">3) Download and install the Android SDK</h2> <p>First of all,&nbsp;<a href=\"http://developer.android.com/sdk/index.html\" target=\"_blank\" rel=\"noopener\">download the Android SDK</a>. In this example, we have installed the Android SDK for Windows (.exe version).</p> <p>Now double click on the .exe file, it will be installed. I am using the android 2.2 version here.</p> <hr /> <h2 class=\"h2\">4) Download the ADT plugin for eclipse</h2> <p>ADT (Android Development Tools) is required for developing the android application in the eclipse IDE. It is the plugin for Eclipse IDE that is designed to provide the integrated environment.</p> <p>For downloading the ADT, you need to follow these steps:</p> <p>1) Start the Eclipse IDE, then select&nbsp;<strong>Help</strong>&nbsp;&gt;&nbsp;<strong>Install new software...</strong></p> <p>2) In the&nbsp;<strong>work with</strong>&nbsp;a combo box, write:</p> <p><strong>https://dl-ssl.google.com/android/eclipse/&nbsp;</strong></p> <p><img src=\"android_adt_img.jpg\" width=\"400\" height=\"400\" /></p> <p>3)&nbsp;<strong>select the checkbox</strong>&nbsp;next to Developer Tools and&nbsp;<strong>click next</strong></p> <p>4) You will see, a list of tools to be downloaded here,&nbsp;<strong>click next</strong></p> <p>5)&nbsp;<strong>click finish</strong></p> <p>6) After completing the installation, restart the Eclipse IDE</p> <hr /> <h2 class=\"h2\">5) Configuring the ADT plugin</h2> <p>After the installing ADT plugin, now tell the eclipse IDE for your Android SDK location. To do so:</p> <ol> <li>Select the&nbsp;<strong>Window menu &gt; preferences</strong></li> <li>Now select the android from the left panel. Here you may see a dialog box asking if you want to send the statistics to the google. Click&nbsp;<strong>proceed</strong>.</li> <li>Click on the browse button and locate your SDK directory e.g. my SDK location is C:\\Program Files\\Android\\android-sdk .</li> <li>Click the Apply button then OK.</li> </ol> <hr /> <h2 class=\"h2\">6) Create an Android Virtual Device (AVD)</h2> <p>For running the android application in the Android Emulator, you need to create an AVD. For creating the AVD:</p> <ol> <li>Select the&nbsp;<strong>Window menu &gt; AVD Manager</strong></li> <li>Click on the&nbsp;<strong>new</strong>&nbsp;button, to create the AVD</li> <li>Now a dialog appears, write the AVD name e.g. myavd. Now choose the target android version e.g. android2.2.</li> <li>Click the&nbsp;<strong>create AVD</strong></li> </ol><hr /> <h2 class=\"h2\">7) Create and Run the simple Android example</h2> <p>Visit the next page to create the first android application.</p>","",""));
        mTutorialData.put("Hello Word Example",new TabDetailsPojoClass("<h1>Build your first&nbsp;\"Hello World\" application</h1> <p style=\"text-align: justify;\">You&rsquo;ll learn how to create a \"Hello World\" project with Android Studio and run it.</p> <p style=\"text-align: justify;\">First, be sure you have installed the latest version of Android Studio.&nbsp;<a href=\"https://developer.android.com/studio/\">Download Android Studio here</a>.</p> <p style=\"text-align: justify;\">1) In the&nbsp;<strong>Welcome to Android Studio</strong>&nbsp;window, click&nbsp;<strong>Start a new Android Studio project</strong>.</p> <p style=\"text-align: justify;\"><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"mainscreen_img.JPG\" width=\"340\" height=\"340/\" /></p> <p style=\"text-align: justify;\">Or if you have a project opened, select&nbsp;<strong>File &gt; New &gt; New Project</strong>.</p> <p style=\"text-align: justify;\">2) In the&nbsp;<strong>Configure your project</strong>&nbsp;window, enter the following values: Application name, Company domain, Project location and Package name of the application and click next.</p> <p style=\"text-align: justify;\"><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"mainscreen2_img.JPG\" width=\"340\" height=\"340/\" /></p> <p style=\"text-align: justify;\">3)&nbsp;Select the <strong>API level</strong> of application and click <strong>Next</strong>.</p> <p style=\"text-align: justify;\"><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"selectapi_img.JPG\" width=\"340\" height=\"340/\" /></p> <p style=\"text-align: justify;\">4)&nbsp;In the&nbsp;<strong>Add an Activity to Mobile</strong>&nbsp;window, select&nbsp;<strong>Empty Activity.</strong></p> <p style=\"text-align: justify;\"><strong><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"selectactivity_img.JPG\" width=\"340\" height=\"340/\" /></strong></p> <p style=\"text-align: justify;\">5)&nbsp;Provide the <strong>Activity Name</strong> and click <strong>Finish</strong>.d<strong><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"activity_img.JPG\" width=\"340\" height=\"340/\" /></strong></p> <p style=\"text-align: justify;\">After some processing, Android Studio opens the IDE. You can explore the android project and see the simple program, it looks like this:</p> <p style=\"text-align: justify;\"><strong><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"main_img.JPG\" width=\"340\" height=\"340/\" /></strong></p> <h2 style=\"text-align: justify;\">Run your application</h2> <p style=\"text-align: justify;\"><strong>1) Run on a real Device:</strong></p> <p style=\"text-align: justify;\">Set up your device as follows:</p> <ol style=\"text-align: justify;\"> <li>Connect your device to your development machine with a USB cable. If you're developing on Windows, you might need to&nbsp;<a href=\"https://developer.android.com/studio/run/oem-usb.html\">install the appropriate USB driver</a>&nbsp;for your device.</li> <li>Enable&nbsp;<strong>USB debugging</strong>&nbsp;in the&nbsp;<strong>Developer options</strong>&nbsp;as follows. <p>First, you must enable the developer options:</p> <ol> <li>Open the&nbsp;<strong>Settings</strong>&nbsp;app.</li> <li>(Only on Android 8.0 or higher) Select&nbsp;<strong>System</strong>.</li> <li>Scroll to the bottom and select&nbsp;<strong>About phone</strong>.</li> <li>Scroll to the bottom and tap&nbsp;<strong>Build number</strong>&nbsp;7 times.</li> <li>Return to the previous screen to find&nbsp;<strong>Developer options</strong>&nbsp;near the bottom.</li> </ol> <p>Open&nbsp;<strong>Developer options</strong>, and then scroll down to find and enable&nbsp;<strong>USB debugging</strong>.</p> </li> </ol> <p style=\"text-align: justify;\">Run the app on your device as follows:</p> <ol style=\"text-align: justify;\"> <li>In Android Studio, click the&nbsp;<strong>app</strong>&nbsp;module in the&nbsp;<strong>Project</strong>&nbsp;window and then select&nbsp;<strong>Run &gt; Run</strong>&nbsp;(or click&nbsp;<strong><img style=\"display: inline;\" src=\"run_img.png\" width=\"17\" height=\"17\" /></strong>&nbsp;<strong>Run</strong>&nbsp;in the toolbar).&nbsp;</li> <li>In the&nbsp;<strong>Select Deployment Target</strong>&nbsp;window, select your device, and click&nbsp;<strong>OK</strong>.</li> </ol> <p style=\"text-align: justify;\"><strong><img src=deploymet_img.png style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"deployment_img.png\" width=\"340\" height=\"200/\" /></strong></p> <p style=\"text-align: justify;\">Android Studio installs the app on your connected device and starts it. You should now see \"Hello World!\" displayed in the app running on your device.</p> <p style=\"text-align: justify;\"><strong>2)&nbsp;Run on an emulator:</strong></p> <p style=\"text-align: justify;\">Run the app on an emulator as follows:</p> <p style=\"text-align: justify;\">1) In Android Studio, click the&nbsp;<strong>app</strong>&nbsp;module in the&nbsp;<strong>Project</strong>&nbsp;window and then select&nbsp;<strong>Run &gt; Run</strong>&nbsp;(or click&nbsp;<strong>Run</strong>&nbsp;in the toolbar).</p> <p style=\"text-align: justify;\">2) In the&nbsp;<strong>Select Deployment Target</strong>&nbsp;window, click&nbsp;<strong>Create New Virtual Device</strong>.</p> <p style=\"text-align: justify;\"></p> <p style=\"text-align: justify;\">3) In the&nbsp;<strong>Select Hardware</strong>&nbsp;screen, select a phone device, such as Pixel, and then click&nbsp;<strong>Next</strong>.</p> <p style=\"text-align: justify;\">4) In the&nbsp;<strong>System Image</strong>&nbsp;screen, select the version with the highest API level. If you don't have that version installed, a&nbsp;<strong>Download</strong>&nbsp;link is shown, so click that and complete the download.</p> <p style=\"text-align: justify;\">5) Click&nbsp;<strong>Next</strong>.</p> <p style=\"text-align: justify;\">6) On the&nbsp;<strong>Android Virtual Device (AVD)</strong>&nbsp;screen, leave all the settings alone and click&nbsp;<strong>Finish</strong>.</p> <p style=\"text-align: justify;\">7) Back in the&nbsp;<strong>Select Deployment Target</strong>&nbsp;dialog, select the device you just created and click&nbsp;<strong>OK</strong>.</p> <p style=\"text-align: justify;\">Android Studio installs the app on the emulator and starts it. You should now see \"Hello World!\" like this:</p> <p><strong><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"helloword_img.jpg\" width=\"340\" height=\"340/\" /></strong></p>","",""));
        mTutorialData.put("Internal Details",new TabDetailsPojoClass("<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1>Internal Details of Hello World Example&nbsp;</h1> <p><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"internal_details_img.JPG\" width=\"340\" height=\"400\" /></p> <p>Now take a moment to review the most important files.</p> <p>First, be sure the&nbsp;<strong>Project</strong>&nbsp;window is open (select&nbsp;<strong>View &gt; Tool Windows &gt; Project</strong>) and the&nbsp;<strong>Android</strong>&nbsp;view is selected from the drop-down list at the top of that window. You can then see the following files:</p> <ol> <li><strong>app &gt; java &gt; com.example.myfirstapp &gt; MainActivity:&nbsp;</strong> <p>The main activity code is a Java file&nbsp;MainActivity.java. This is the actual application file which ultimately gets converted to a Dalvik executable and runs your application. Following is the default code generated by the application wizard for <em>Hello World!</em>&nbsp;application &minus;</p> <pre class=\"prettyprint\">package com.hd.myfirstapp;\n" +
                "\n" +
                "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "    }\n" +
                "}\n</pre> </li> <li><strong>app &gt; res &gt; layout &gt; activity_main.xml:&nbsp;</strong> <p>This XML file defines the layout for the activity's UI. It contains a TextView element with the text \"Hello world!\".</p> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                "&lt;android.support.constraint.ConstraintLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                "    xmlns:app=&quot;http://schemas.android.com/apk/res-auto&quot;\n" +
                "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                "    android:layout_width=&quot;match_parent&quot;\n" +
                "    android:layout_height=&quot;match_parent&quot;\n" +
                "    tools:context=&quot;com.hd.myfirstapp.MainActivity&quot;&gt;\n" +
                "\n" +
                "    &lt;TextView\n" +
                "        android:layout_width=&quot;wrap_content&quot;\n" +
                "        android:layout_height=&quot;wrap_content&quot;\n" +
                "        android:text=&quot;@string/hello_world&quot;\n" +
                "        app:layout_constraintBottom_toBottomOf=&quot;parent&quot;\n" +
                "        app:layout_constraintLeft_toLeftOf=&quot;parent&quot;\n" +
                "        app:layout_constraintRight_toRightOf=&quot;parent&quot;\n" +
                "        app:layout_constraintTop_toTopOf=&quot;parent&quot; /&gt;\n" +
                "\n" +
                "&lt;/android.support.constraint.ConstraintLayout&gt;</pre> </li> <li><strong>app &gt; res &gt; values&gt;strings.xml:&nbsp;</strong> <p>The&nbsp;<strong>strings.xml</strong>&nbsp;file is located in the&nbsp;<em>res/values</em>&nbsp;folder and it contains all the text that your application uses. For example, the names of buttons, labels, default text, and similar types of strings go into this file. This file is responsible for their textual content. For example, a default strings file will look like as following file &minus;</p> <pre class=\"prettyprint\">" +
                "&lt;resources&gt;\n&lt;string name=&quot;app_name&quot;&gt;MyFirstApp&lt;/string&gt;\n&lt;string name=&quot;hello_world&quot;&gt;Hello World!&lt;/string&gt;\n" +
                "&lt;/resources&gt;</pre> </li> <li><strong>app &gt; manifests &gt; AndroidManifest.xml:&nbsp;</strong> <p>The&nbsp;manifest file&nbsp;describes the fundamental characteristics of the app and defines each of its components such as activities, services, broadcast receivers, content providers etc. This file works as an interface between Android OS and your application, so if you do not declare your component in this file, then it will not be considered by the OS. For example, a default manifest file will look like as the following file &minus;</p> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                "&lt;manifest xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                "    package=&quot;com.hd.myfirstapp&quot;&gt;\n" +
                "\n" +
                "    &lt;application\n" +
                "        android:allowBackup=&quot;true&quot;\n" +
                "        android:icon=&quot;@mipmap/ic_launcher&quot;\n" +
                "        android:label=&quot;@string/app_name&quot;\n" +
                "        android:roundIcon=&quot;@mipmap/ic_launcher_round&quot;\n" +
                "        android:supportsRtl=&quot;true&quot;\n" +
                "        android:theme=&quot;@style/AppTheme&quot;&gt;\n" +
                "        &lt;activity android:name=&quot;.MainActivity&quot;&gt;\n" +
                "            &lt;intent-filter&gt;\n" +
                "                &lt;action android:name=&quot;android.intent.action.MAIN&quot; /&gt;\n" +
                "\n" +
                "                &lt;category android:name=&quot;android.intent.category.LAUNCHER&quot; /&gt;\n" +
                "            &lt;/intent-filter&gt;\n" +
                "        &lt;/activity&gt;\n" +
                "    &lt;/application&gt;\n" +
                "&lt;/manifest&gt;</pre> <p>It performs some other tasks also:</p> <ul> <li>It is&nbsp;<strong>responsible to protect the application</strong>&nbsp;to access any protected parts by providing the permissions.</li> <li>It also&nbsp;<strong>declares the Android API</strong>&nbsp;that the application is going to use.</li> <li>It&nbsp;<strong>lists the instrumentation classes</strong>. The instrumentation classes provide profiling and other information. This information is removed just before the application is published etc.</li> </ul> <h2><span style=\"text-decoration: underline;\">Elements of the AndroidManifest.xml file</span></h2> <p>The elements used in the above XML file are described below.</p> <h4>&lt;manifest&gt;</h4> <p><strong>manifest</strong>&nbsp;is the root element of the AndroidManifest.xml file. It has a&nbsp;<strong>package</strong>&nbsp;attribute that describes the package name of the activity class.</p> <h4>&lt;application&gt;</h4> <p><strong>application</strong>&nbsp;is the subelement of the manifest. It includes the namespace declaration. This element contains several subelements that declares the application component such as activity etc.</p> <p>The commonly used attributes are of this element are&nbsp;<strong>icon</strong>,&nbsp;<strong>label</strong>,&nbsp;<strong>theme</strong>&nbsp;etc.</p> <p><strong>android:icon</strong>&nbsp;represents the icon for all the android application components.</p> <p><strong>android:label</strong>&nbsp;works as the default label for all the application components.</p> <p><strong>android:theme</strong>&nbsp;represents a common theme for all the android activities.</p> <h4>&lt;activity&gt;</h4> <p><strong>activity</strong>&nbsp;is the subelement of application and represents an activity that must be defined in the AndroidManifest.xml file. It has many attributes such as label, name, theme, launchMode etc.</p> <p><strong>android:label</strong>&nbsp;represents a label i.e. displayed on the screen.</p> <p><strong>android:name</strong>&nbsp;represents a name for the activity class. It is required attribute.</p> <h4>&lt;intent-filter&gt;</h4> <p><strong>intent-filter</strong>&nbsp;is the sub-element of activity that describes the type of intent to which activity, service or broadcast receiver can respond to.</p> <h4>&lt;action&gt;</h4> <p>It adds an action for the intent-filter. The intent-filter must have at least one action element.</p> <h4>&lt;category&gt;</h4> <p>It adds a category name to an intent-filter.</p> </li> <li><strong>Gradle Scripts &gt; build.gradle:&nbsp;</strong>This is an auto generated file which contains compileSdkVersion, buildToolsVersion, applicationId, minSdkVersion, targetSdkVersion, versionCode and versionName.</li> </ol>","",""));
             mTutorialData.put("Dalvik VM",new TabDetailsPojoClass("<h1>Dalvik Virtual Machine(DVM)</h1> <p>As we know the modern JVM is high performance and provides excellent memory management. But it needs to be optimized for low-powered handheld devices as well.</p> <p>The&nbsp;<strong>Dalvik Virtual Machine (DVM)</strong>&nbsp;is an android virtual machine optimized for mobile devices. It optimizes the virtual machine for&nbsp;<em>memory</em>,&nbsp;<em>battery life</em>&nbsp;and&nbsp;<em>performance</em>.</p> <p>Dalvik is the name of a town in Iceland. The Dalvik VM was written by Dan Bornstein.</p> <p>The Dex compiler converts the class files into the .dex file that run on the Dalvik VM. Multiple class files are converted into one dex file.</p> <p>Let's see the compiling and packaging process from the source file:</p> <p><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"dalvik_img.png\" width=\"340/\" height=\"340\" /></p> <p>The&nbsp;<strong>javac tool</strong>&nbsp;compiles the java source file into the class file.</p> <p>The&nbsp;<strong>dx tool</strong>&nbsp;takes all the class files of your application and generates a single .dex file. It is a platform-specific tool.</p> <p>The&nbsp;<strong>Android Assets Packaging Tool (AAPT)</strong>&nbsp;handles the packaging process.</p>","",""));
             mTutorialData.put("Android Activity",new TabDetailsPojoClass("<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">Android Activity</h1><pre class=prettyprint>java.lang.Object<br />&nbsp; ↳ android.content.Context<br />&nbsp; &nbsp; &nbsp; ↳ android.content.ContextWrapper<br />&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ↳android.view.ContextThemeWrapper<br />&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;↳ android.app.Activity</pre><p>An activity represents a single screen in your application with which your user can perform a single, focussed task such as dial the phone, take a photo, send an email, or view a map. Activities are usually presented to the user as full-screen windows. The Android Activity is the subclass of ContextThemeWrapper class.</p> <p>An activity is implemented as a subclass of&nbsp;<strong>Activity</strong>&nbsp;class as follows &minus;</p> <pre class=\"prettyprint\">public class MainActivity extends Activity {\n" +
                     "}</pre> <p>An application usually consists of multiple activities that are loosely bound to each other. Typically, one activity in an application is specified as the \"main\" activity, which is presented to the user when the app is launched. Each activity can then start other activities in order to perform different actions.</p> <p>There is a sequence of callback methods that start up an activity and a sequence of callback methods that tear down activity as shown in the below Activity life cycle diagram:</p> <p>&nbsp;<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"activity_lifecycle_img.png\" width=\"400\" height=\"600\" /></p> <p><span style=\"text-decoration: underline;\"><strong>Activity Life Cycle Methods:</strong></span></p> <table border=\"1\" align=\"center\"> <tbody> <tr> <th>Method</th> <th>Description</th> </tr> <tr> <td><strong>onCreate</strong></td> <td>called when activity is first created.</td> </tr> <tr> <td><strong>onStart</strong></td> <td>called when activity is becoming visible to the user.</td> </tr> <tr> <td><strong>onResume</strong></td> <td>called when activity will start interacting with the user.</td> </tr> <tr> <td><strong>onPause</strong></td> <td>called when activity is not visible to the user.</td> </tr> <tr> <td><strong>onStop</strong></td> <td>called when activity is no longer visible to the user.</td> </tr> <tr> <td><strong>onRestart</strong></td> <td>called after your activity is stopped, prior to start.</td> </tr> <tr> <td><strong>onDestroy</strong></td> <td>called before the activity is destroyed.</td> </tr> </tbody> </table> <p>Here is an example&nbsp;<code>Activity&nbsp;subclass called&nbsp;<code>MyActivity&nbsp;which overrides all of the above life cycle methods. In this example, we are displaying the content on the logcat:</p> <p><strong>activity_main.xml</strong></p> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                     "&lt;android.support.constraint.ConstraintLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                     "    xmlns:app=&quot;http://schemas.android.com/apk/res-auto&quot;\n" +
                     "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                     "    android:layout_width=&quot;match_parent&quot;\n" +
                     "    android:layout_height=&quot;match_parent&quot;\n" +
                     "    tools:context=&quot;com.hd.myfirstapp.MainActivity&quot;&gt;\n" +
                     "\n" +
                     "    &lt;TextView\n" +
                     "        android:layout_width=&quot;wrap_content&quot;\n" +
                     "        android:layout_height=&quot;wrap_content&quot;\n" +
                     "        android:text=&quot;@string/hello_world&quot;\n" +
                     "        app:layout_constraintBottom_toBottomOf=&quot;parent&quot;\n" +
                     "        app:layout_constraintLeft_toLeftOf=&quot;parent&quot;\n" +
                     "        app:layout_constraintRight_toRightOf=&quot;parent&quot;\n" +
                     "        app:layout_constraintTop_toTopOf=&quot;parent&quot; /&gt;\n" +
                     "\n" +
                     "&lt;/android.support.constraint.ConstraintLayout&gt;</pre> <p><strong>MainActivity.java</strong></p> <pre class=\"prettyprint\">package com.hd.myfirstapp;\n" +
                     "\n" +
                     "import android.support.v7.app.AppCompatActivity;\n" +
                     "import android.os.Bundle;\n" +
                     "import android.util.Log;\n" +
                     "\n" +
                     "public class MainActivity extends AppCompatActivity {\n" +
                     "    String activityMessage=\"Activity Lifecycle: \";\n" +
                     "    @Override\n" +
                     "    protected void onCreate(Bundle savedInstanceState) {\n" +
                     "        super.onCreate(savedInstanceState);\n" +
                     "        setContentView(R.layout.activity_main);\n" +
                     "        Log.d(activityMessage,\"onCreate invoked\");\n" +
                     "    }\n" +
                     "    @Override\n" +
                     "    protected void onStart() {\n" +
                     "        super.onStart();\n" +
                     "        Log.d(activityMessage,\"onStart invoked\");\n" +
                     "    }\n" +
                     "    @Override\n" +
                     "    protected void onResume() {\n" +
                     "        super.onResume();\n" +
                     "        Log.d(activityMessage,\"onResume invoked\");\n" +
                     "    }\n" +
                     "    @Override\n" +
                     "    protected void onPause() {\n" +
                     "        super.onPause();\n" +
                     "        Log.d(activityMessage,\"onPause invoked\");\n" +
                     "    }\n" +
                     "    @Override\n" +
                     "    protected void onStop() {\n" +
                     "        super.onStop();\n" +
                     "        Log.d(activityMessage,\"onStop invoked\");\n" +
                     "    }\n" +
                     "    @Override\n" +
                     "    protected void onRestart() {\n" +
                     "        super.onRestart();\n" +
                     "        Log.d(activityMessage,\"onRestart invoked\");\n" +
                     "    }\n" +
                     "    @Override\n" +
                     "    protected void onDestroy() {\n" +
                     "        super.onDestroy();\n" +
                     "        Log.d(activityMessage,\"onDestroy invoked\");\n" +
                     "    }\n" +
                     "}\n</pre> <p><strong><span style=\"text-decoration: underline;\">Output:</span></strong></p> <p>click&nbsp;<strong>Run&nbsp;</strong>in the toolbar.&nbsp;You will not see any output on the emulator or device. You need to open <strong>Logcat</strong>.</p> <p>Now see on the <strong>Logcat</strong>: onCreate, onStart and onResume methods are invoked.</p> <p><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"methods_img.JPG\" width=\"400\" height=\"200/\" /></p> <pre class=\"prettyprint\">06-25 10:33:49.696 4798-4798/com.hd.myfirstapp D/Activity Lifecycle:: onCreate invoked\n" +
                     "06-25 10:33:49.706 4798-4798/com.hd.myfirstapp D/Activity Lifecycle:: onStart invoked\n" +
                     "06-25 10:33:49.711 4798-4798/com.hd.myfirstapp D/Activity Lifecycle:: onResume invoked</pre> <p>Now click on the Home Button. You will see onPause and onStop methods are invoked in&nbsp;<strong>LogCat</strong>&nbsp;window in the android studio:</p> <pre class=\"prettyprint\">06-25 10:35:00.988 4798-4798/com.hd.myfirstapp D/Activity Lifecycle:: onPause invoked\n" +
                     "06-25 10:35:01.273 4798-4798/com.hd.myfirstapp D/Activity Lifecycle:: onStop invoked</pre> <p>Now click on the Recent App Button. You will see onRestart, onStart and onResume methods are invoked in&nbsp;<strong>Logcat&nbsp;</strong>window in the android studio:</p> <pre class=\"prettyprint\">06-25 10:36:16.568 4798-4798/com.hd.myfirstapp D/Activity Lifecycle:: onRestart invoked\n" +
                     "06-25 10:36:16.628 4798-4798/com.hd.myfirstapp D/Activity Lifecycle:: onStart invoked\n" +
                     "06-25 10:36:16.630 4798-4798/com.hd.myfirstapp D/Activity Lifecycle:: onResume invoked</pre> <p>Next, click on the Back Button. You will see onPause, onStop and onDestroy methods are invoked in&nbsp;<strong>Logcat&nbsp;</strong>window in the android studio:</p> <pre class=\"prettyprint\">06-25 10:36:36.571 4798-4798/com.hd.myfirstapp D/Activity Lifecycle:: onPause invoked\n" +
                     "06-25 10:36:37.864 4798-4798/com.hd.myfirstapp D/Activity Lifecycle:: onStop invoked\n" +
                     "06-25 10:36:37.866 4798-4798/com.hd.myfirstapp D/Activity Lifecycle:: onDestroy invoked\n</pre>","",""));

        mTutorialData.put("Android Service",new TabDetailsPojoClass("<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">Android Service</h1> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; ↳ android.content.Context<br />&nbsp; &nbsp; &nbsp; ↳ android.content.ContextWrapper<br />&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ↳ android.app.Service</pre> <p>Android service is an application component that can perform long-running operations in the background such as playing music, handle network transactions, interacting content providers. It doesn't have any UI (user interface).</p><p>A service is implemented as a subclass of&nbsp;<strong>Service</strong>&nbsp;class as follows &minus;</p>\n" +
                "<pre class=\"prettyprint\">public class MyService extends Service {\n" +
                "}</pre> <p>The service runs in the background indefinitely even if the application is destroyed.</p> <p>Moreover, service can be bounded by a component to perform interactivity and inter-process communication (IPC). The android.app.Service is a subclass of ContextWrapper class.</p> <pre class=\"prettyprint\">Note: Android service is not a thread or separate process.</pre> <h2 class=\"h2\"><span style=\"text-decoration: underline;\">Life Cycle of Android Service</span></h2> <p>There can be two forms of service. The lifecycle of service can follow two different paths: started or bound.</p> <ol> <li>Started</li> <li>Bound</li> </ol> <h4 class=\"h4\">1) Started Service</h4> <p>A service is started when the component (like activity) calls&nbsp;<strong>startService()</strong>&nbsp;method, now it runs in the background indefinitely. It is stopped by&nbsp;<strong>stopService()</strong>&nbsp;method. The service can stop itself by calling the&nbsp;<strong>stopSelf()</strong>&nbsp;method.</p> <h4 class=\"h4\">2) Bound Service</h4> <p>A service is bound when another component (e.g. client) calls&nbsp;<strong>bindService()</strong>&nbsp;method. The client can unbind the service by calling the&nbsp;<strong>unbindService()</strong>&nbsp;method.</p> <p>The service cannot be stopped until all clients unbind the service. The following diagram on the left shows the life cycle when the service is created with startService() and the diagram on the right shows the life cycle when the service is created with bindService():</p> <p><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"service_lifecycle_img.png\" width=\"400\" height=\"600\" /></p> <p>To create a service, you create a Java class that extends the Service base class or one of its existing subclasses. The&nbsp;<strong>Service</strong>&nbsp;base class defines various callback methods and the most important are given below. You don't need to implement all the callbacks methods. However, it's important that you understand each one and implement those that ensure your app behaves the way users expect.</p> <ol> <li> <p><strong>onStartCommand()</strong></p> <p>The system calls this method when another component, such as an activity, requests that the service be started, by calling&nbsp;<em>startService()</em>. If you implement this method, it is your responsibility to stop the service when its work is done, by calling&nbsp;<em>stopSelf()</em>&nbsp;or&nbsp;<em>stopService()</em>&nbsp;methods.</p> </li> <li> <p><strong>onBind()</strong></p> <p>The system calls this method when another component wants to bind with the service by calling&nbsp;<em>bindService()</em>. If you implement this method, you must provide an interface that clients use to communicate with the service, by returning an&nbsp;<em>IBinder</em>&nbsp;object. You must always implement this method, but if you don't want to allow binding, then you should return&nbsp;<em>null</em>.</p> </li> <li> <p><strong>onUnbind()</strong></p> <p>The system calls this method when all clients have disconnected from a particular interface published by the service.</p> </li> <li> <p><strong>onRebind()</strong></p> <p>The system calls this method when new clients have connected to the service after it had previously been notified that all had disconnected in its&nbsp;<em>onUnbind(Intent)</em>.</p> </li> <li> <p><strong>onCreate()</strong></p> <p>The system calls this method when the service is first created using&nbsp;<em>onStartCommand()</em>&nbsp;or&nbsp;<em>onBind()</em>. This call is required to perform a one-time set-up.</p> </li> <li> <p><strong>onDestroy()</strong></p> <p>The system calls this method when the service is no longer used and is being destroyed. Your service should implement this to clean up any resources such as threads, registered listeners, receivers, etc.</p> </li> </ol> <h2><span style=\"text-decoration: underline;\">Android Service Example</span></h2> <p>Let's see the example of service in android that plays audio in the background. Audio will not be stopped even if you switch to another activity. To stop the audio, you need to stop the service.</p> <p><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"main_service_img.JPG\" width=\"300\" height=\"600\" /></p> <h4><em>activity_main.xml</em></h4> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                "&lt;RelativeLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                "    xmlns:app=&quot;http://schemas.android.com/apk/res-auto&quot;\n" +
                "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                "    android:layout_width=&quot;match_parent&quot;\n" +
                "    android:layout_height=&quot;match_parent&quot;\n" +
                "    tools:context=&quot;com.hd.androidserviceexample.MainActivity&quot;&gt;\n" +
                "\n" +
                "    &lt;Button\n" +
                "        android:id=&quot;@+id/buttonStart&quot;\n" +
                "        android:layout_width=&quot;wrap_content&quot;\n" +
                "        android:layout_height=&quot;wrap_content&quot;\n" +
                "        android:layout_alignParentTop=&quot;true&quot;\n" +
                "        android:layout_centerHorizontal=&quot;true&quot;\n" +
                "        android:layout_marginTop=&quot;74dp&quot;\n" +
                "        android:text=&quot;Start Service&quot; /&gt;\n" +
                "\n" +
                "    &lt;Button\n" +
                "        android:id=&quot;@+id/buttonStop&quot;\n" +
                "        android:layout_width=&quot;wrap_content&quot;\n" +
                "        android:layout_height=&quot;wrap_content&quot;\n" +
                "        android:layout_centerHorizontal=&quot;true&quot;\n" +
                "        android:layout_centerVertical=&quot;true&quot;\n" +
                "        android:text=&quot;Stop Service&quot; /&gt;\n" +
                "\n" +
                "    &lt;Button\n" +
                "        android:id=&quot;@+id/buttonNext&quot;\n" +
                "        android:layout_width=&quot;wrap_content&quot;\n" +
                "        android:layout_height=&quot;wrap_content&quot;\n" +
                "        android:layout_alignParentBottom=&quot;true&quot;\n" +
                "        android:layout_centerHorizontal=&quot;true&quot;\n" +
                "        android:layout_marginBottom=&quot;63dp&quot;\n" +
                "        android:text=&quot;Next Page&quot; /&gt;\n" +
                "\n" +
                "&lt;/RelativeLayout&gt;</pre> <h4><em>activity_next_page.xml</em></h4> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                "&lt;android.support.constraint.ConstraintLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                "    xmlns:app=&quot;http://schemas.android.com/apk/res-auto&quot;\n" +
                "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                "    android:layout_width=&quot;match_parent&quot;\n" +
                "    android:layout_height=&quot;match_parent&quot;\n" +
                "    tools:context=&quot;com.hd.androidserviceexample.NextPage&quot;&gt;\n" +
                "\n" +
                "    &lt;TextView\n" +
                "        android:id=&quot;@+id/textView&quot;\n" +
                "        android:layout_width=&quot;wrap_content&quot;\n" +
                "        android:layout_height=&quot;wrap_content&quot;\n" +
                "        android:layout_marginEnd=&quot;8dp&quot;\n" +
                "        android:layout_marginStart=&quot;8dp&quot;\n" +
                "        android:layout_marginTop=&quot;200dp&quot;\n" +
                "        android:text=&quot;Next Page&quot;\n" +
                "        app:layout_constraintEnd_toEndOf=&quot;parent&quot;\n" +
                "        app:layout_constraintStart_toStartOf=&quot;parent&quot;\n" +
                "        app:layout_constraintTop_toTopOf=&quot;parent&quot; /&gt;\n" +
                "\n" +
                "&lt;/android.support.constraint.ConstraintLayout&gt;</pre> <p>Now create the service implementation class by inheriting the Service class and overriding its callback methods.</p> <div><em><strong>MyService.java</strong></em></div> <pre class=\"prettyprint\">package com.hd.androidserviceexample;\n" +
                "\n" +
                "import android.app.Service;\n" +
                "import android.content.Intent;\n" +
                "import android.media.MediaPlayer;\n" +
                "import android.os.IBinder;\n" +
                "import android.support.annotation.Nullable;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "public class MyService extends Service {\n" +
                "    MediaPlayer myPlayer;\n" +
                "    @Nullable\n" +
                "    @Override\n" +
                "    public IBinder onBind(Intent intent) {\n" +
                "        return null;\n" +
                "    }\n" +
                "    @Override\n" +
                "    public void onCreate() {\n" +
                "        Toast.makeText(this, \"Service Created\", Toast.LENGTH_LONG).show();\n" +
                "\n" +
                "        myPlayer = MediaPlayer.create(this, R.raw.music);\n" +
                "        myPlayer.setLooping(false); // Set looping\n" +
                "    }\n" +
                "    @Override\n" +
                "    public void onStart(Intent intent, int startid) {\n" +
                "        Toast.makeText(this, \"Service Started\", Toast.LENGTH_LONG).show();\n" +
                "        myPlayer.start();\n" +
                "    }\n" +
                "    @Override\n" +
                "    public void onDestroy() {\n" +
                "        Toast.makeText(this, \"Service Stopped\", Toast.LENGTH_LONG).show();\n" +
                "        myPlayer.stop();\n" +
                "    }\n" +
                "}</pre> <p>Now create the MainActivity class to perform event handling. Here, we are writing the code to start and stop service. Additionally, calling the second activity on buttonNext.</p> <div><em><strong>MainActivity.java</strong></em></div> <pre class=\"prettyprint\">package com.hd.androidserviceexample;\n" +
                "\n" +
                "import android.content.Intent;\n" +
                "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity implements View.OnClickListener {\n" +
                "    private Button buttonStart, buttonStop, buttonNext;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        buttonStart = findViewById(R.id.buttonStart);\n" +
                "        buttonStop = findViewById(R.id.buttonStop);\n" +
                "        buttonNext = findViewById(R.id.buttonNext);\n" +
                "\n" +
                "        buttonStart.setOnClickListener(this);\n" +
                "        buttonStop.setOnClickListener(this);\n" +
                "        buttonNext.setOnClickListener(this);\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void onClick(View v) {\n" +
                "        switch (v.getId()) {\n" +
                "            case R.id.buttonStart:\n" +
                "\n" +
                "                startService(new Intent(this, MyService.class));\n" +
                "                break;\n" +
                "            case R.id.buttonStop:\n" +
                "                stopService(new Intent(this, MyService.class));\n" +
                "                break;\n" +
                "            case R.id.buttonNext:\n" +
                "                Intent intent = new Intent(this, NextPage.class);\n" +
                "                startActivity(intent);\n" +
                "                break;\n" +
                "        }\n" +
                "    }\n" +
                "}</pre> <p>Now, create another activity.</p> <div><strong><em>NextPage.java</em></strong></div> <pre class=\"prettyprint\">package com.hd.androidserviceexample;\n" +
                "\n" +
                "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "\n" +
                "public class NextPage extends AppCompatActivity {\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_next_page);\n" +
                "    }\n" +
                "}\n</pre> <h4><strong>Declare the Service in the AndroidManifest.xml file</strong></h4> <p>Finally, declare the service in the manifest file.</p> <div><strong><em>AndroidManifest.xml</em></strong></div> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                "&lt;manifest xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                "    package=&quot;com.hd.androidserviceexample&quot;&gt;\n" +
                "\n" +
                "    &lt;application\n" +
                "        android:allowBackup=&quot;true&quot;\n" +
                "        android:icon=&quot;@mipmap/ic_launcher&quot;\n" +
                "        android:label=&quot;@string/app_name&quot;\n" +
                "        android:roundIcon=&quot;@mipmap/ic_launcher_round&quot;\n" +
                "        android:supportsRtl=&quot;true&quot;\n" +
                "        android:theme=&quot;@style/AppTheme&quot;&gt;\n" +
                "        &lt;activity android:name=&quot;.MainActivity&quot;&gt;\n" +
                "            &lt;intent-filter&gt;\n" +
                "                &lt;action android:name=&quot;android.intent.action.MAIN&quot; /&gt;\n" +
                "\n" +
                "                &lt;category android:name=&quot;android.intent.category.LAUNCHER&quot; /&gt;\n" +
                "            &lt;/intent-filter&gt;\n" +
                "        &lt;/activity&gt;\n" +
                "        &lt;activity android:name=&quot;.NextPage&quot;&gt;&lt;/activity&gt;\n" +
                "        &lt;service android:name=&quot;.MyService&quot;\n" +
                "            android:enabled=&quot;true&quot;/&gt;\n" +
                "    &lt;/application&gt;\n" +
                "&lt;/manifest&gt;</pre> <p><span style=\"text-decoration: underline;\"><strong>Output:</strong></span></p> <p><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"main_service_output_img.png\" width=\"300\" height=\"400\" /></p> <p><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"start_service_img.png\" width=\"300\" height=\"400\" /></p> <p><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"stop_service_img.png\" width=\"300\" height=\"400\" /></p> <p><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"next_page_img.png\" width=\"300\" height=\"400\" /></p>","",""));
        mTutorialData.put("Android Fragments",new TabDetailsPojoClass("<h1 style=\"text-align: center;\">Fragments</h1> <hr /> <p>In Android,&nbsp;<strong>Fragment&nbsp;</strong>is a piece of an activity which enable more modular activity design. It will not be wrong if we say, a fragment is a kind of&nbsp;<strong>sub-activity</strong>.</p> <p>Following are important points about the fragment:</p> <ul class=\"list\"> <li> <p>A fragment has its own layout and its own behaviour with its own life cycle callbacks.</p> </li> <li> <p>You can add or remove fragments in an activity while the activity is running.</p> </li> <li> <p>You can combine multiple fragments in a single activity to build a multi-pane UI.</p> </li> <li> <p>A fragment can be used in multiple activities.</p> </li> <li> <p>The fragment life cycle is closely related to the life cycle of its host activity which means when the activity is paused, all the fragments available in the activity will also be stopped.</p> </li> <li> <p>A fragment can implement behavior that has no user interface component.</p> </li> <li> <p>Fragments were added to the Android API in Honeycomb version of Android which API version 11.</p> </li> </ul> <p>You create can fragments by extending&nbsp;<strong>Fragment</strong>&nbsp;class and You can insert a fragment into your activity layout by declaring the fragment in the activity's layout file, as a&nbsp;<strong>&lt;fragment&gt;</strong>&nbsp;element.</p> <p>Prior to fragment introduction, we had a limitation because we can show only a single activity on the screen at one given point in time. So we were not able to divide the device screen and control different parts separately. But with the introduction of a fragment, we got more flexibility and removed the limitation of having a single activity on the screen at a time. Now we can have a single activity but each activity can comprise of multiple fragments which will have their own layout, events and complete life cycle.</p> <p>Following is the example of defining multiple fragments in a single activity for the tablet design to display the details of an item which we selected in app, but separated for mobile design.</p> <p><img src=\"fragments_img.png\" height=300 width=400/></p> <p><strong>Android Fragment Life Cycle:</strong></p> <p>Following is a pictorial representation of an android fragment life cycle while its activity is running.</p> <p><img src=\"fragments_lifecycle_img.png\" height=700 width=400/></p><p id=\"divanfgmd\">Following are the list of methods which will perform during the lifecycle of a fragment in android applications.&nbsp;</p> <table border=1> <thead> <tr > <th>Method</th> <th>Description</th> </tr> </thead> <tbody> <tr> <td>onAttach()</td> <td>It is called when the fragment has been associated with an activity.</td> </tr> <tr> <td>onCreate()</td> <td>It is used to initialize the fragment.</td> </tr> <tr> <td>onCreteView()</td> <td>It is used to create a view hierarchy associated with the fragment.</td> </tr> <tr> <td>onActivityCreated()</td> <td>It is called when the fragment activity has been created and the fragment view hierarchy instantiated.</td> </tr> <tr> <td>onStart()</td> <td>It is used to make the fragment visible.</td> </tr> <tr> <td>onResume()</td> <td>It is used to make the fragment visible in an activity.</td> </tr> <tr> <td>onPause()</td> <td>It is called when fragment is no longer visible and it indicates that the user is leaving the fragment.</td> </tr> <tr> <td>onStop()</td> <td>It is called to stop the fragment using onStop() method.</td> </tr> <tr> <td>onDestoryView()</td> <td>The view hierarcy which associated with the fragment is being removed after executing this method.</td> </tr> <tr> <td>onDestroy()</td> <td>It is called to perform a final clean up of the fragments state.</td> </tr> <tr> <td>onDetach()</td> <td>It is called immediately after the fragment disassociated from the activity.</td> </tr> </tbody> </table>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><p>Following is the example of creating two fragments, two buttons and showing the respective fragment when click on a button in the android application.</p> <p>Now we need to create our own custom fragment layout files (<strong>listitems_info.xml</strong>,&nbsp;<strong>details_info.xml</strong>) in&nbsp;<strong>\\res\\layout</strong>&nbsp;path to display those fragments in the main layout for that right-click on your layout folder&nbsp;&agrave;&nbsp;Go to&nbsp;<strong>New</strong>&nbsp;&agrave;&nbsp;select&nbsp;<strong>Layout resource file</strong>&nbsp;and give name as&nbsp;<strong>listitems_info.xml</strong>.</p> <h2><em>listitems_info.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;LinearLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    android:orientation=&quot;vertical&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;&gt;\n" +
                        "    &lt;ListView\n" +
                        "        android:layout_width=&quot;match_parent&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:id=&quot;@android:id/list&quot; /&gt;\n" +
                        "&lt;/LinearLayout&gt;</pre> <p>Same way to create another file&nbsp;<strong>details_info.xml.</strong>&nbsp;</p> <h2><em>details_info.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;LinearLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    android:orientation=&quot;vertical&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;\n" +
                        "    android:background=&quot;#005dd6&quot;&gt;\n" +
                        "    &lt;TextView\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:textColor=&quot;#ffffff&quot;\n" +
                        "        android:layout_marginTop=&quot;200px&quot;\n" +
                        "        android:layout_marginLeft=&quot;200px&quot;\n" +
                        "        android:id=&quot;@+id/Name&quot;/&gt;\n" +
                        "    &lt;TextView\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_marginLeft=&quot;200px&quot;\n" +
                        "        android:textColor=&quot;#ffffff&quot;\n" +
                        "        android:id=&quot;@+id/Location&quot;/&gt;\n" +
                        "&lt;/LinearLayout&gt;</pre> <p>Now we need to create our own custom fragment class files (<strong>ListMenuFragment.java</strong>,&nbsp;<strong>DetailsFragment.java</strong>) in&nbsp;<strong>\\java\\com.hd.fragmentsexample</strong>&nbsp;path to bind and display data in fragments for that right-click on your application folder and Go to <strong>New</strong> and select&nbsp;<strong>Java Class</strong>&nbsp;and give name as&nbsp;<strong>DetailsFragment.java</strong>.&nbsp;</p> <h2><em>DetailsFragment.java</em></h2> <pre class=\"prettyprint\">package com.hd.fragmentsexample;\n" +
                        "import android.app.Fragment;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.LayoutInflater;\n" +
                        "import android.view.View;\n" +
                        "import android.view.ViewGroup;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "public class DetailsFragment extends Fragment {\n" +
                        "    TextView name,location;\n" +
                        "    @Override\n" +
                        "    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {\n" +
                        "        View view = inflater.inflate(R.layout.details_info, container, false);\n" +
                        "        name = (TextView)view.findViewById(R.id.Name);\n" +
                        "        location = (TextView)view.findViewById(R.id.Location);\n" +
                        "        return view;\n" +
                        "    }\n" +
                        "    public void change(String uname, String ulocation){\n" +
                        "        name.setText(uname);\n" +
                        "        location.setText(ulocation);\n" +
                        "    }\n" +
                        "}</pre> <p>Same way to create another file&nbsp;<strong>ListMenuFragment.java</strong>.&nbsp;</p> <h2><em>ListMenuFragment.java</em></h2> <pre class=\"prettyprint\">package com.hd.fragmentsexample;\n" +
                        "import android.app.ListFragment;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.LayoutInflater;\n" +
                        "import android.view.View;\n" +
                        "import android.view.ViewGroup;\n" +
                        "import android.widget.ArrayAdapter;\n" +
                        "import android.widget.ListView;\n" +
                        "\n" +
                        "public class ListMenuFragment extends ListFragment {\n" +
                        "    String[] users = new String[] { \"Jainam\",\"Jignesh\",\"Hemish\",\"Nikul\",\"Piyush\",\"Rohit\" };\n" +
                        "    String[] location = new String[]{\"Surat\",\"Vadodara\",\"Surat\",\"Navsari\",\"Mumbai\",\"Surat\"};\n" +
                        "    @Override\n" +
                        "    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {\n" +
                        "        View view =inflater.inflate(R.layout.listitems_info, container, false);\n" +
                        "        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),\n" +
                        "                android.R.layout.simple_list_item_1, users);\n" +
                        "        setListAdapter(adapter);\n" +
                        "        return view;\n" +
                        "    }\n" +
                        "    @Override\n" +
                        "    public void onListItemClick(ListView l, View v, int position, long id) {\n" +
                        "        DetailsFragment txt = (DetailsFragment)getFragmentManager().findFragmentById(R.id.fragment2);\n" +
                        "        txt.change(\"Name: \"+ users[position],\"Location : \"+ location[position]);\n" +
                        "        getListView().setSelector(android.R.color.holo_blue_dark);\n" +
                        "    }\n" +
                        "}</pre> <p>Now we need to display our fragments horizontally side by side in the main layout for that open&nbsp;<strong>activity_main.xml</strong>&nbsp;file.&nbsp;</p> <h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;LinearLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;\n" +
                        "    android:orientation=&quot;horizontal&quot;\n" +
                        "    tools:context=&quot;.MainActivity&quot;&gt;\n" +
                        "\n" +
                        "    &lt;fragment\n" +
                        "        android:layout_height=&quot;match_parent&quot;\n" +
                        "        android:layout_width=&quot;350px&quot;\n" +
                        "        class=&quot;com.hd.intentexample.ListMenuFragment&quot;\n" +
                        "        android:id=&quot;@+id/fragment&quot;/&gt;\n" +
                        "    &lt;fragment\n" +
                        "        android:layout_width=&quot;match_parent&quot;\n" +
                        "        android:layout_height=&quot;match_parent&quot;\n" +
                        "        class=&quot;com.hd.intentexample.DetailsFragment&quot;\n" +
                        "        android:id=&quot;@+id/fragment2&quot;/&gt;\n" +
                        "&lt;/LinearLayout&gt;</pre> <p>We are not going to make any modifications for our main activity file (<strong>MainActivity.java</strong>) and manifest file (<strong>AndroidMainfest.xml</strong>).&nbsp;</p>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=android_fragment_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=android_fragment_img2.png height=500 width=300/>"));

        mTutorialData.put("Intent",new TabDetailsPojoClass("<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">Android Intent</h1> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; ↳ android.content.Intent</pre> <p><strong>Android Intent</strong>&nbsp;is the&nbsp;<em>message</em>&nbsp;that is passed between components such as activities, content providers, broadcast receivers, services.</p> <p>It is generally used with startActivity() method to invoke activity, broadcast receivers.</p> <p>The&nbsp;<strong>dictionary meaning</strong>&nbsp;of intent is&nbsp;<em>intention or purpose</em>. So, it can be described as the intention to do an action.</p> <p><strong>The intent itself, an Intent object, is a passive data structure holding an abstract description of an operation to be performed.</strong></p> <p>Android intents are mainly used to:</p> <ul> <li>Start the service</li> <li>Launch an activity</li> <li>Display a web page</li> <li>Display a list of contacts</li> <li>Broadcast a message</li> <li>Dial a phone call etc.</li> </ul> <h2><span style=\"text-decoration: underline;\">Types of Android Intents:</span></h2> <p>There are two types of intents in android: implicit and explicit.</p> <h3>1) Implicit Intent</h3> <p><strong>Implicit Intent</strong>&nbsp;doesn't specify the component. In such a case, intent provides information about available components provided by the system that is to be invoked.</p> <p>For example, you may write the following code to view the webpage.</p> <pre class=\"prettyprint\">Intent intent=new Intent(Intent.ACTION_VIEW);  \n" +
                "intent.setData(Uri.parse(\"https://www.google.ca/\"));\n" +
                "startActivity(intent);</pre> <h3>2) Explicit Intent</h3> <p><strong>Explicit Intent</strong>&nbsp;specifies the component. In such a case, intent provides the external class to be invoked.</p><pre class=\"prettyprint\">Intent i = new Intent(getApplicationContext(), ActivityTwo.class);\n"+
                "startActivity(i);</pre>","",""));
        mTutorialData.put("Implicit Intent Example",new TabDetailsPojoClass("<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">Implicit Intent Example</h1> <p>Let's see the simple example of implicit intent that displays a web page.</p> <h4><em>activity_main.xml</em></h4> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                "&lt;android.support.constraint.ConstraintLayout\nxmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                "    xmlns:app=&quot;http://schemas.android.com/apk/res-auto&quot;\n" +
                "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                "    android:layout_width=&quot;match_parent&quot;\n" +
                "    android:layout_height=&quot;match_parent&quot;\n" +
                "    tools:context=&quot;com.hd.intentexample.MainActivity&quot;&gt;\n" +
                "\n" +
                "    &lt;EditText\n" +
                "        android:id=&quot;@+id/editText&quot;\n" +
                "        android:layout_width=&quot;wrap_content&quot;\n" +
                "        android:layout_height=&quot;wrap_content&quot;\n" +
                "        android:layout_marginEnd=&quot;8dp&quot;\n" +
                "        android:layout_marginStart=&quot;8dp&quot;\n" +
                "        android:layout_marginTop=&quot;60dp&quot;\n" +
                "        android:ems=&quot;10&quot;\n" +
                "        app:layout_constraintEnd_toEndOf=&quot;parent&quot;\n" +
                "        app:layout_constraintHorizontal_bias=&quot;0.575&quot;\n" +
                "        app:layout_constraintStart_toStartOf=&quot;parent&quot;\n" +
                "        app:layout_constraintTop_toTopOf=&quot;parent&quot; /&gt;\n" +
                "\n" +
                "    &lt;Button\n" +
                "        android:id=&quot;@+id/button&quot;\n" +
                "        android:layout_width=&quot;wrap_content&quot;\n" +
                "        android:layout_height=&quot;wrap_content&quot;\n" +
                "        android:layout_marginRight=&quot;8dp&quot;\n" +
                "        android:layout_marginLeft=&quot;156dp&quot;\n" +
                "        android:layout_marginTop=&quot;172dp&quot;\n" +
                "        android:text=&quot;Visit&quot;\n" +
                "        app:layout_constraintEnd_toEndOf=&quot;parent&quot;\n" +
                "        app:layout_constraintHorizontal_bias=&quot;0.0&quot;\n" +
                "        app:layout_constraintStart_toStartOf=&quot;parent&quot;\n" +
                "        app:layout_constraintTop_toBottomOf=&quot;@+id/editText&quot; /&gt;\n" +
                "\n" +
                "&lt;/android.support.constraint.ConstraintLayout&gt;</pre> <h4><em>MainActivity.java</em></h4> <pre class=\"prettyprint\">package com.hd.intentexample;\n" +
                "\n" +
                "import android.content.Intent;\n" +
                "import android.net.Uri;\n" +
                "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.EditText;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    private Button button;\n" +
                "    private EditText editText;\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        button = findViewById(R.id.button);\n" +
                "        editText =  findViewById(R.id.editText);\n" +
                "\n" +
                "        button.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                String url=editText.getText().toString();\n" +
                "                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));\n" +
                "                startActivity(intent);\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "}</pre> <h4><span style=\"text-decoration: underline;\">Output:</span></h4> <p><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"implicit_intent_output_main_img.png\" width=\"300\" height=\"400\" /></p> <p><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"implicit_intent_output_url_img.png\" width=\"300\" height=\"400\" /></p> <p><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"implicit_intent_output_main_urldisplay_img.png\" width=\"300\" height=\"400\" /></p>","",""));
            mTutorialData.put("Explicit Intent Example",new TabDetailsPojoClass("<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">Explicit Intent Example</h1> <p><strong>Android Explicit intent</strong>&nbsp;specifies the component to be invoked from activity. In other words, we can call another activity in android by explicit intent.</p> <p>We can also pass the information from one activity to another using explicit intent.</p> <p>Here, we are going to see an example to call one activity from another and vice-versa.</p> <h4><em>activity_main.xml</em></h4> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                    "&lt;android.support.constraint.ConstraintLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                    "    xmlns:app=&quot;http://schemas.android.com/apk/res-auto&quot;\n" +
                    "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                    "    android:layout_width=&quot;match_parent&quot;\n" +
                    "    android:layout_height=&quot;match_parent&quot;\n" +
                    "    tools:context=&quot;com.hd.intentexample.MainActivity&quot;&gt;\n" +
                    "\n" +
                    "    &lt;TextView\n" +
                    "        android:layout_width=&quot;wrap_content&quot;\n" +
                    "        android:layout_height=&quot;wrap_content&quot;\n" +
                    "        android:layout_marginEnd=&quot;8dp&quot;\n" +
                    "        android:layout_marginStart=&quot;8dp&quot;\n" +
                    "        android:layout_marginTop=&quot;8dp&quot;\n" +
                    "        android:text=&quot;Main Activity&quot;\n" +
                    "        app:layout_constraintBottom_toBottomOf=&quot;parent&quot;\n" +
                    "        app:layout_constraintEnd_toEndOf=&quot;parent&quot;\n" +
                    "        app:layout_constraintHorizontal_bias=&quot;0.454&quot;\n" +
                    "        app:layout_constraintLeft_toLeftOf=&quot;parent&quot;\n" +
                    "        app:layout_constraintRight_toRightOf=&quot;parent&quot;\n" +
                    "        app:layout_constraintStart_toStartOf=&quot;parent&quot;\n" +
                    "        app:layout_constraintTop_toTopOf=&quot;parent&quot;\n" +
                    "        app:layout_constraintVertical_bias=&quot;0.06&quot; /&gt;\n" +
                    "\n" +
                    "    &lt;Button\n" +
                    "        android:id=&quot;@+id/button&quot;\n" +
                    "        android:layout_width=&quot;wrap_content&quot;\n" +
                    "        android:layout_height=&quot;wrap_content&quot;\n" +
                    "        android:layout_marginEnd=&quot;8dp&quot;\n" +
                    "        android:layout_marginStart=&quot;8dp&quot;\n" +
                    "        android:layout_marginTop=&quot;392dp&quot;\n" +
                    "        android:onClick=&quot;callSecondActivity&quot;\n" +
                    "        android:text=&quot;Call second activity&quot;\n" +
                    "        app:layout_constraintEnd_toEndOf=&quot;parent&quot;\n" +
                    "        app:layout_constraintStart_toStartOf=&quot;parent&quot;\n" +
                    "        app:layout_constraintTop_toTopOf=&quot;parent&quot; /&gt;\n" +
                    "\n" +
                    "&lt;/android.support.constraint.ConstraintLayout&gt;</pre> <h4><em>MainActivity.java</em></h4> <pre class=\"prettyprint\">package com.hd.intentexample;\n" +
                    "\n" +
                    "import android.content.Intent;\n" +
                    "import android.support.v7.app.AppCompatActivity;\n" +
                    "import android.os.Bundle;\n" +
                    "import android.view.View;\n" +
                    "\n" +
                    "public class MainActivity extends AppCompatActivity {\n" +
                    "    @Override\n" +
                    "    protected void onCreate(Bundle savedInstanceState) {\n" +
                    "        super.onCreate(savedInstanceState);\n" +
                    "        setContentView(R.layout.activity_main);\n" +
                    "    }\n" +
                    "    public void callSecondActivity(View view){\n" +
                    "        Intent i = new Intent(getApplicationContext(), SecondActivity.class);\n" +
                    "        i.putExtra(\"Value1\", \"Android Explicit Example\");\n" +
                    "        i.putExtra(\"Value2\", \"Simple Android Tutorial\");\n" +
                    "        // Set the request code to any code you like, you can identify the\n" +
                    "        // callback via this code\n" +
                    "        startActivity(i);\n" +
                    "    }\n" +
                    "}</pre> <h4><em>activity_second.xml</em></h4> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                    "&lt;android.support.constraint.ConstraintLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                    "    xmlns:app=&quot;http://schemas.android.com/apk/res-auto&quot;\n" +
                    "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                    "    android:layout_width=&quot;match_parent&quot;\n" +
                    "    android:layout_height=&quot;match_parent&quot;\n" +
                    "    tools:context=&quot;com.hd.intentexample.SecondActivity&quot;&gt;\n" +
                    "    &lt;TextView\n" +
                    "        android:layout_width=&quot;wrap_content&quot;\n" +
                    "        android:layout_height=&quot;wrap_content&quot;\n" +
                    "        android:layout_marginEnd=&quot;8dp&quot;\n" +
                    "        android:layout_marginStart=&quot;8dp&quot;\n" +
                    "        android:layout_marginTop=&quot;8dp&quot;\n" +
                    "        android:text=&quot;Second Activity&quot;\n" +
                    "        app:layout_constraintBottom_toBottomOf=&quot;parent&quot;\n" +
                    "        app:layout_constraintEnd_toEndOf=&quot;parent&quot;\n" +
                    "        app:layout_constraintHorizontal_bias=&quot;0.454&quot;\n" +
                    "        app:layout_constraintLeft_toLeftOf=&quot;parent&quot;\n" +
                    "        app:layout_constraintRight_toRightOf=&quot;parent&quot;\n" +
                    "        app:layout_constraintStart_toStartOf=&quot;parent&quot;\n" +
                    "        app:layout_constraintTop_toTopOf=&quot;parent&quot;\n" +
                    "        app:layout_constraintVertical_bias=&quot;0.06&quot; /&gt;\n" +
                    "\n" +
                    "    &lt;Button\n" +
                    "        android:id=&quot;@+id/button&quot;\n" +
                    "        android:layout_width=&quot;wrap_content&quot;\n" +
                    "        android:layout_height=&quot;wrap_content&quot;\n" +
                    "        android:layout_marginEnd=&quot;8dp&quot;\n" +
                    "        android:layout_marginStart=&quot;8dp&quot;\n" +
                    "        android:layout_marginTop=&quot;392dp&quot;\n" +
                    "        android:onClick=&quot;callFirstActivity&quot;\n" +
                    "        android:text=&quot;Call main activity&quot;\n" +
                    "        app:layout_constraintEnd_toEndOf=&quot;parent&quot;\n" +
                    "        app:layout_constraintStart_toStartOf=&quot;parent&quot;\n" +
                    "        app:layout_constraintTop_toTopOf=&quot;parent&quot; /&gt;\n" +
                    "&lt;/android.support.constraint.ConstraintLayout&gt;</pre> <h4><em>SecondActivity.java</em></h4> <pre class=\"prettyprint\">package com.hd.intentexample;\n" +
                    "\n" +
                    "import android.content.Intent;\n" +
                    "import android.support.v7.app.AppCompatActivity;\n" +
                    "import android.os.Bundle;\n" +
                    "import android.view.View;\n" +
                    "import android.widget.Toast;\n" +
                    "\n" +
                    "public class SecondActivity extends AppCompatActivity {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void onCreate(Bundle savedInstanceState) {\n" +
                    "        super.onCreate(savedInstanceState);\n" +
                    "        setContentView(R.layout.activity_second);\n" +
                    "        Bundle extras = getIntent().getExtras();\n" +
                    "        String value1 = extras.getString(\"Value1\");\n" +
                    "        String value2 = extras.getString(\"Value2\");\n" +
                    "        Toast.makeText(getApplicationContext(),\"Values are:\\n First value: \"+value1+\n" +
                    "                \"\\n Second Value: \"+value2, Toast.LENGTH_LONG).show();\n" +
                    "    }\n" +
                    "    public void callFirstActivity(View view){\n" +
                    "        Intent i = new Intent(getApplicationContext(), MainActivity.class);\n" +
                    "        startActivity(i);\n" +
                    "    }\n" +
                    "}</pre> <h4><span style=\"text-decoration: underline;\">Output:</span></h4> <p><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"explicit_img1.png\" width=\"300\" height=\"400\" /></p> <p><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"explicit_img2.png\" width=\"300\" height=\"400\" /></p> <p><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"explicit_img1.png\" width=\"300\" height=\"400\" /></p>","",""));
            mTutorialData.put("Share App Data",new TabDetailsPojoClass("<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1>Android Share App Data</h1> <p>Android uses the&nbsp;<strong>ACTION_SEND</strong>&nbsp;event of&nbsp;<strong>android.content.Intent</strong>&nbsp;class to send data from one activity to another and from current activity to outside the application. Intent class needs to specify the data and its type which is to be share.</p> <p>Most commonly, ACTION_SEND action sends URL of build-in Browser app. While sharing the data, Intent call&nbsp;<em>createChooser()</em>&nbsp;method which takes the Intent object and specifies the title of the chooser dialog.&nbsp;<strong>Intent.createChooser()</strong>&nbsp;method allows to display the chooser.</p> <h3>Example of ACTION_SEND</h3> <p>Here, we are going to share plain text which is a URL of browser.</p> <h4><em>activity_main.xml</em></h4> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                    "&lt;RelativeLayout\n" +
                    "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                    "    xmlns:app=&quot;http://schemas.android.com/apk/res-auto&quot;\n" +
                    "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                    "    android:layout_width=&quot;match_parent&quot;\n" +
                    "    android:layout_height=&quot;match_parent&quot;\n" +
                    "    tools:context=&quot;com.hd.shareappexample.MainActivity&quot;&gt;\n" +
                    "\n" +
                    "    &lt;TextView\n" +
                    "        android:layout_width=&quot;wrap_content&quot;\n" +
                    "        android:layout_height=&quot;wrap_content&quot;\n" +
                    "        android:text=&quot;Share App Example&quot;\n" +
                    "        android:id=&quot;@+id/textView&quot; /&gt;\n" +
                    "\n" +
                    "    &lt;Button\n" +
                    "        android:layout_width=&quot;wrap_content&quot;\n" +
                    "        android:layout_height=&quot;wrap_content&quot;\n" +
                    "        android:text=&quot;Share App&quot;\n" +
                    "        android:id=&quot;@+id/button&quot;\n" +
                    "        android:layout_marginBottom=&quot;95dp&quot;\n" +
                    "        android:layout_alignParentBottom=&quot;true&quot;\n" +
                    "        android:layout_centerHorizontal=&quot;true&quot; /&gt;\n" +
                    "&lt;/RelativeLayout&gt;</pre> <h4><em>MainActivity.java</em></h4> <pre class=\"prettyprint\">package com.hd.shareappexample;\n" +
                    "\n" +
                    "import android.content.Intent;\n" +
                    "import android.support.v7.app.AppCompatActivity;\n" +
                    "import android.os.Bundle;\n" +
                    "import android.view.View;\n" +
                    "import android.widget.Button;\n" +
                    "\n" +
                    "public class MainActivity extends AppCompatActivity {\n" +
                    "    private Button sharebutton;\n" +
                    "    @Override\n" +
                    "    protected void onCreate(Bundle savedInstanceState) {\n" +
                    "        super.onCreate(savedInstanceState);\n" +
                    "        setContentView(R.layout.activity_main);\n" +
                    "        sharebutton=(Button)findViewById(R.id.button);\n" +
                    "        sharebutton.setOnClickListener(new View.OnClickListener() {\n" +
                    "            @Override\n" +
                    "            public void onClick(View v) {\n" +
                    "                Intent shareIntent =   new Intent(android.content.Intent.ACTION_SEND);\n" +
                    "                shareIntent.setType(\"text/plain\");\n" +
                    "                shareIntent.putExtra(Intent.EXTRA_SUBJECT,\"Insert Subject here\");\n" +
                    "                String msg= \"Android share app\";\n" +
                    "                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,msg);\n" +
                    "                startActivity(Intent.createChooser(shareIntent, \"Share via\"));\n" +
                    "            }\n" +
                    "        });\n" +
                    "    }</pre><h4><span style=\"text-decoration: underline;\">Output:</span></h4> <p><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"shareapp_img1.png\" width=\"300\" height=\"400\" /></p> <p><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"shareapp_img2.png\" width=\"300\" height=\"400\" /></p>","",""));
            mTutorialData.put("Android View and View Group",new TabDetailsPojoClass("<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2 style=\"text-align: center;\">Android View</h2> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; &nbsp;↳ android.view.View</pre> <p>The View is a base class for all UI components in android. For example, the EditText class is used to accept the input from users in android apps, which is a subclass of <strong>View</strong>.</p> <p>Following are some of the common&nbsp;View&nbsp;subclasses which will be used in Android applications.&nbsp;</p> <ul> <li>TextView</li> <li>EditText</li> <li>Button</li> <li>CheckBox</li> <li>RadioButton</li> <li>ImageButton</li> <li>ProgressBar</li> <li>Spinner</li> </ul> <h2 style=\"text-align: center;\">Android ViewGroup</h2> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; &nbsp;↳ android.view.View<br />&nbsp; &nbsp;&nbsp; &nbsp;↳ android.view.ViewGroup</pre> <p>The&nbsp;ViewGroup&nbsp;is a subclass of&nbsp;View&nbsp;and it will act as a base class for&nbsp;<strong>layouts</strong>&nbsp;and&nbsp;<strong>layouts parameters</strong>. The&nbsp;ViewGroup&nbsp;will provide an invisible container to hold other&nbsp;<strong>Views</strong>&nbsp;or&nbsp;<strong>ViewGroups</strong>&nbsp;and to define the layout properties.&nbsp;</p> <p>For example, Linear Layout&nbsp;is the ViewGroup that&nbsp;contains UI controls like Button, TextView, etc. and other layouts also.&nbsp;</p> <p>Following are the commonly used&nbsp;ViewGroup&nbsp;subclasses in android applications.</p> <ul> <li>Linear Layout</li> <li>Relative Layout</li> <li>Table Layout</li> <li>Frame Layout</li> <li>Web View</li> <li>List View</li> <li>Grid View</li> </ul> <p>Both&nbsp;View&nbsp;and&nbsp;ViewGroup&nbsp;subclasses together will play a key role to create layouts in android applications.</p>","",""));
            mTutorialData.put("Constraint Layout",new TabDetailsPojoClass(
                    "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2 style=\"text-align: center;\">Constraint Layout</h2> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; &nbsp;↳ android.view.ViewGroup<br />&nbsp; &nbsp;&nbsp; &nbsp;↳ android.support.constraint.ConstraintLayout</pre> <p>Constraint Layout is a ViewGroup (i.e. a view that holds other views) which allows you to create large and complex layouts with a flat view hierarchy, and also allows you to position and size widgets in a very flexible way. It was created to help reduce the nesting of views and also improve the performance of layout files.</p> <img style=\"display: block; margin-left: auto; margin-right: auto;\" src=constraint_img1.jpg height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=constraint_img2.jpg height=500 width=300/> <p>Constraint Layout is very similar to Relative Layout&nbsp;in such a way because views are laid out according to relationships between sibling views and the parent layout yet it&rsquo;s a lot more flexible and works better with the Layout Editor of the Android Studio.</p> <p><strong>Advantages Of Constraint Layout Over Other Layouts:</strong></p> <p>1. One great advantage of the ConstraintLayout is that you can perform animations on your ConstraintLayout views with very little code.<br />2. You can build your complete layout with simple drag-and-drop on the&nbsp;Android Studio&nbsp;design editor.<br />3. You can control what happens to a group of widgets through a single line of code.<br />4. Constraint Layout improves performance over other layouts.</p>",
                    "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                            "&lt;android.support.constraint.ConstraintLayout\n" +
                            "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                            "    xmlns:app=&quot;http://schemas.android.com/apk/res-auto&quot;\n" +
                            "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                            "    android:layout_width=&quot;match_parent&quot;\n" +
                            "    android:layout_height=&quot;match_parent&quot;\n" +
                            "    tools:context=&quot;.MainActivity&quot;&gt;\n" +
                            "    &lt;ImageView\n" +
                            "        android:id=&quot;@+id/imageView&quot;\n" +
                            "        android:layout_width=&quot;wrap_content&quot;\n" +
                            "        android:layout_height=&quot;wrap_content&quot;\n" +
                            "        android:layout_marginEnd=&quot;8dp&quot;\n" +
                            "        android:layout_marginStart=&quot;8dp&quot;\n" +
                            "        android:layout_marginTop=&quot;72dp&quot;\n" +
                            "        app:layout_constraintEnd_toEndOf=&quot;parent&quot;\n" +
                            "        app:layout_constraintStart_toStartOf=&quot;parent&quot;\n" +
                            "        app:layout_constraintTop_toTopOf=&quot;parent&quot;\n" +
                            "        app:srcCompat=&quot;@mipmap/ic_launcher_round&quot; /&gt;\n" +
                            "    &lt;TextView\n" +
                            "        android:id=&quot;@+id/textView&quot;\n" +
                            "        android:layout_width=&quot;172dp&quot;\n" +
                            "        android:layout_height=&quot;28dp&quot;\n" +
                            "        android:layout_marginEnd=&quot;8dp&quot;\n" +
                            "        android:layout_marginStart=&quot;8dp&quot;\n" +
                            "        android:layout_marginTop=&quot;28dp&quot;\n" +
                            "        android:text=&quot;Email Address&quot;\n" +
                            "        app:layout_constraintEnd_toEndOf=&quot;parent&quot;\n" +
                            "        app:layout_constraintStart_toStartOf=&quot;parent&quot;\n" +
                            "        app:layout_constraintTop_toBottomOf=&quot;@+id/imageView&quot; /&gt;\n" +
                            "    &lt;TextView\n" +
                            "        android:id=&quot;@+id/textView1&quot;\n" +
                            "        android:layout_width=&quot;172dp&quot;\n" +
                            "        android:layout_height=&quot;28dp&quot;\n" +
                            "        android:layout_marginEnd=&quot;8dp&quot;\n" +
                            "        android:layout_marginStart=&quot;8dp&quot;\n" +
                            "        android:layout_marginTop=&quot;28dp&quot;\n" +
                            "        android:text=&quot;Password&quot;\n" +
                            "        app:layout_constraintEnd_toEndOf=&quot;parent&quot;\n" +
                            "        app:layout_constraintStart_toStartOf=&quot;parent&quot;\n" +
                            "        app:layout_constraintTop_toBottomOf=&quot;@+id/textView&quot; /&gt;\n" +
                            "    &lt;Button\n" +
                            "        android:id=&quot;@+id/button2&quot;\n" +
                            "        android:layout_width=&quot;wrap_content&quot;\n" +
                            "        android:layout_height=&quot;wrap_content&quot;\n" +
                            "        android:layout_marginEnd=&quot;8dp&quot;\n" +
                            "        android:layout_marginStart=&quot;8dp&quot;\n" +
                            "        android:layout_marginTop=&quot;40dp&quot;\n" +
                            "        android:text=&quot;Login&quot;\n" +
                            "        app:layout_constraintEnd_toEndOf=&quot;parent&quot;\n" +
                            "        app:layout_constraintStart_toStartOf=&quot;parent&quot;\n" +
                            "        app:layout_constraintTop_toBottomOf=&quot;@+id/textView1&quot; /&gt;\n" +
                            "&lt;/android.support.constraint.ConstraintLayout&gt;</pre> <p><strong>Relative Positioning In Constraint Layout:</strong></p> <p>To define a view&rsquo;s position in ConstraintLayout, you must add at least one horizontal and one vertical constraint to the view. Each constraint defines the view&rsquo;s position along either the vertical or horizontal axis; so each view must have a minimum of one constraint for each axis but often more are necessary. There are several types of restrictions. In particular, the following are some of the restrictions that can be used to set a position relative to another item:</p> <p><strong>layout_constraintLeft_toLeftOf:</strong>&nbsp;the left border of the element is positioned relative to the left border of another element</p> <p><strong>layout_constraintLeft_toRightOf:</strong>&nbsp;the left border of the element is positioned relative to the right border of another element</p> <p><strong>layout_constraintRight_toLeftOf:</strong>&nbsp;the right border of the element is positioned relative to the left border of another element</p> <p><strong>layout_constraintRight_toRightOf:</strong>&nbsp;the right border of the element is positioned relative to the right border of another element.</p> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.constraintlaysoutexample;\n" +
                            "\n" +
                            "import android.support.v7.app.AppCompatActivity;\n" +
                            "import android.os.Bundle;\n" +
                            "\n" +
                            "public class MainActivity extends AppCompatActivity {\n" +
                            "    @Override\n" +
                            "    protected void onCreate(Bundle savedInstanceState) {\n" +
                            "        super.onCreate(savedInstanceState);\n" +
                            "        setContentView(R.layout.activity_main);\n" +
                            "    }\n" +
                            "}</pre>",
                    "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=constraint_img3.png height=500 width=300/>"));
            mTutorialData.put("Linear Layout",new TabDetailsPojoClass("<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2 style=\"text-align: center;\">Linear Layout</h2> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; &nbsp;↳ android.view.View<br />&nbsp; &nbsp;&nbsp; &nbsp;↳ android.view.ViewGroup<br />&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;↳ android.widget.LinearLayout</pre> <p><strong>LinearLayout</strong>&nbsp;is a&nbsp;ViewGroup&nbsp;subclass which is used to render all child View instances one by one either in&nbsp;Horizontaldirection or&nbsp;Vertical&nbsp;direction based on the&nbsp;orientation&nbsp;property.</p> <p>In Android, we can specify the LinearLayout orientation using android:orientation attribute.</p> <p><strong>LinearLayout Declaration:</strong></p> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                    "&lt;LinearLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                    "    android:layout_width=&quot;match_parent&quot;\n" +
                    "    android:layout_height=&quot;match_parent&quot;\n" +
                    "    android:orientation=&quot;vertical&quot; &gt;\n" +
                    "    &lt;!-- Add Child Views Here --&gt;\n" +
                    "&lt;/LinearLayout&gt;</pre> <h3><span style=\"text-decoration: underline;\">LinearLayout Attributes</span></h3> <table border=1> <tbody> <tr> <th>Attribute &amp; Description</th> </tr> <tr> <td> <p><strong>android:id</strong></p> <p>This is the ID which uniquely identifies the layout.</p> </td> </tr> <tr> <td> <p><strong>android:baselineAligned</strong></p> <p>This must be a boolean value, either \"true\" or \"false\" and prevents the layout from aligning its children's baselines.</p> </td> </tr> <tr> <td> <p><strong>android:baselineAlignedChildIndex</strong></p> <p>When a linear layout is part of another layout that is baseline aligned, it can specify which of its children to baseline align.</p> </td> </tr> <tr> <td> <p><strong>android:divider</strong></p> <p>This is drawable to use as a vertical divider between buttons. You use a color value, in the form of \"#rgb\", \"#argb\", \"#rrggbb\", or \"#aarrggbb\".</p> </td> </tr> <tr> <td> <p><strong>android:gravity</strong></p> <p>This specifies how an object should position its content, on both the X and Y axes. Possible values are top, bottom, left, right, center, center_vertical, center_horizontal etc.</p> </td> </tr> <tr> <td> <p><strong>android:orientation</strong></p> <p>This specifies the direction of arrangement and you will use \"horizontal\" for a row, \"vertical\" for a column. The default is horizontal.</p> </td> </tr> <tr> <td> <p><strong>android:weightSum</strong></p> <p>Sum up of child weight</p> </td> </tr> </tbody> </table>",
                    "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                            "&lt;LinearLayout\n" +
                            "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                            "    android:layout_width=&quot;match_parent&quot;\n" +
                            "    android:layout_height=&quot;match_parent&quot;\n" +
                            "    android:paddingLeft=&quot;20dp&quot;\n" +
                            "    android:paddingRight=&quot;20dp&quot;\n" +
                            "    android:orientation=&quot;vertical&quot; &gt;\n" +
                            "    &lt;EditText\n" +
                            "        android:id=&quot;@+id/txtTo&quot;\n" +
                            "        android:layout_width=&quot;match_parent&quot;\n" +
                            "        android:layout_height=&quot;wrap_content&quot;\n" +
                            "        android:hint=&quot;To&quot;/&gt;\n" +
                            "    &lt;EditText\n" +
                            "        android:id=&quot;@+id/txtSub&quot;\n" +
                            "        android:layout_width=&quot;match_parent&quot;\n" +
                            "        android:layout_height=&quot;wrap_content&quot;\n" +
                            "        android:hint=&quot;Subject&quot;/&gt;\n" +
                            "    &lt;EditText\n" +
                            "        android:id=&quot;@+id/txtMsg&quot;\n" +
                            "        android:layout_width=&quot;match_parent&quot;\n" +
                            "        android:layout_height=&quot;0dp&quot;\n" +
                            "        android:layout_weight=&quot;1&quot;\n" +
                            "        android:gravity=&quot;top&quot;\n" +
                            "        android:hint=&quot;Message&quot;/&gt;\n" +
                            "    &lt;Button\n" +
                            "        android:layout_width=&quot;100dp&quot;\n" +
                            "        android:layout_height=&quot;wrap_content&quot;\n" +
                            "        android:layout_gravity=&quot;right&quot;\n" +
                            "        android:text=&quot;Send&quot;/&gt;\n" +
                            "&lt;/LinearLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.linearlayoutexample;\n" +
                            "\n" +
                            "import android.support.v7.app.AppCompatActivity;\n" +
                            "import android.os.Bundle;\n" +
                            "\n" +
                            "public class MainActivity extends AppCompatActivity {\n" +
                            "    @Override\n" +
                            "    protected void onCreate(Bundle savedInstanceState) {\n" +
                            "        super.onCreate(savedInstanceState);\n" +
                            "        setContentView(R.layout.activity_main);\n" +
                            "    }\n" +
                            "}</pre>"
                    ,"<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=linear_img.png height=500 width=300/>"));
            mTutorialData.put("Relative Layout",new TabDetailsPojoClass(
                    "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2 style=\"text-align: center;\">Relative Layout</h2> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; &nbsp;↳ android.view.View<br />&nbsp; &nbsp;&nbsp; &nbsp;↳ android.view.ViewGroup<br />&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;↳ android.widget.RelativeLayout</pre> <p>Android <strong>RelativeLayout</strong> enables you to specify how child views are positioned relative to each other. The position of each view can be specified as relative to sibling elements or relative to the parent.</p><h3><span style=\"text-decoration: underline;\">RelativeLayout Attributes</span></h3> <table border=1> <tbody> <tr> <th>Attribute &amp; Description</th> </tr> <tr> <td> <p><strong>android:id</strong></p> <p>This is the ID which uniquely identifies the layout.</p> </td> </tr> <tr> <td> <p><strong>android:gravity</strong></p> <p>This specifies how an object should position its content, on both the X and Y axes. Possible values are top, bottom, left, right, center, center_vertical, center_horizontal etc.</p> </td> </tr> <tr> <td> <p><strong>android:ignoreGravity</strong></p> <p>This indicates what view should not be affected by gravity.</p> </td> </tr> <tr> <td> <p><strong>android:layout_above</strong></p> <p>Positions the bottom edge of this view above the given anchor view ID and must be a reference to another resource, in the form \"@[+][package:]type:name\"</p> </td> </tr> <tr> <td> <p><strong>android:layout_alignBottom</strong></p> <p>Makes the bottom edge of this view match the bottom edge of the given anchor view ID and must be a reference to another resource, in the form \"@[+][package:]type:name\".</p> </td> </tr> <tr> <td> <p><strong>android:layout_alignLeft</strong></p> <p>Makes the left edge of this view match the left edge of the given anchor view ID and must be a reference to another resource, in the form \"@[+][package:]type:name\".</p> </td> </tr> <tr> <td> <p><strong>android:layout_alignParentBottom</strong></p> <p>If true, makes the bottom edge of this view match the bottom edge of the parent. Must be a boolean value, either \"true\" or \"false\".</p> </td> </tr> <tr> <td> <p><strong>android:layout_alignParentEnd</strong></p> <p>If true, makes the end edge of this view match the end edge of the parent. Must be a boolean value, either \"true\" or \"false\".</p> </td> </tr> <tr> <td> <p><strong>android:layout_alignParentLeft</strong></p> <p>If true, makes the left edge of this view match the left edge of the parent. Must be a boolean value, either \"true\" or \"false\".</p> </td> </tr> <tr> <td> <p><strong>android:layout_alignParentRight</strong></p> <p>If true, makes the right edge of this view match the right edge of the parent. Must be a boolean value, either \"true\" or \"false\".</p> </td> </tr> <tr> <td> <p><strong>android:layout_alignParentStart</strong></p> <p>If true, makes the start edge of this view match the start edge of the parent. Must be a boolean value, either \"true\" or \"false\".</p> </td> </tr> <tr> <td> <p><strong>android:layout_alignParentTop</strong></p> <p>If true, makes the top edge of this view match the top edge of the parent. Must be a boolean value, either \"true\" or \"false\".</p> </td> </tr> <tr> <td> <p><strong>android:layout_alignRight</strong></p> <p>Makes the right edge of this view match the right edge of the given anchor view ID and must be a reference to another resource, in the form \"@[+][package:]type:name\".</p> </td> </tr> <tr> <td> <p><strong>android:layout_alignStart</strong></p> <p>Makes the start edge of this view match the start edge of the given anchor view ID and must be a reference to another resource, in the form \"@[+][package:]type:name\".</p> </td> </tr> <tr> <td> <p><strong>android:layout_alignTop</strong></p> <p>Makes the top edge of this view match the top edge of the given anchor view ID and must be a reference to another resource, in the form \"@[+][package:]type:name\".</p> </td> </tr> <tr> <td> <p><strong>android:layout_below</strong></p> <p>Positions the top edge of this view below the given anchor view ID and must be a reference to another resource, in the form \"@[+][package:]type:name\".</p> </td> </tr> <tr> <td> <p><strong>android:layout_centerHorizontal</strong></p> <p>If true, centers this child horizontally within its parent. Must be a boolean value, either \"true\" or \"false\".</p> </td> </tr> <tr> <td> <p><strong>android:layout_centerInParent</strong></p> <p>If true, centers this child horizontally and vertically within its parent. Must be a boolean value, either \"true\" or \"false\".</p> </td> </tr> <tr> <td> <p><strong>android:layout_centerVertical</strong></p> <p>If true, centers this child vertically within its parent. Must be a boolean value, either \"true\" or \"false\".</p> </td> </tr> <tr> <td> <p><strong>android:layout_toEndOf</strong></p> <p>Positions the start edge of this view to the end of the given anchor view ID and must be a reference to another resource, in the form \"@[+][package:]type:name\".</p> </td> </tr> <tr> <td> <p><strong>android:layout_toLeftOf</strong></p> <p>Positions the right edge of this view to the left of the given anchor view ID and must be a reference to another resource, in the form \"@[+][package:]type:name\".</p> </td> </tr> <tr> <td> <p><strong>android:layout_toRightOf</strong></p> <p>Positions the left edge of this view to the right of the given anchor view ID and must be a reference to another resource, in the form \"@[+][package:]type:name\".</p> </td> </tr> <tr> <td> <p><strong>android:layout_toStartOf</strong></p> <p>Positions the end edge of this view to the start of the given anchor view ID and must be a reference to another resource, in the form \"@[+][package:]type:name\".</p> </td> </tr> </tbody> </table>",
                    "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                            "&lt;RelativeLayout\n" +
                            "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                            "    android:layout_width=&quot;match_parent&quot;\n" +
                            "    android:layout_height=&quot;match_parent&quot;\n" +
                            "    android:paddingLeft=&quot;10dp&quot;\n" +
                            "    android:paddingRight=&quot;10dp&quot;&gt;\n" +
                            "    &lt;Button\n" +
                            "        android:id=&quot;@+id/btn1&quot;\n" +
                            "        android:layout_width=&quot;wrap_content&quot;\n" +
                            "        android:layout_height=&quot;wrap_content&quot;\n" +
                            "        android:layout_alignParentLeft=&quot;true&quot;\n" +
                            "        android:text=&quot;Button1&quot; /&gt;\n" +
                            "    &lt;Button\n" +
                            "        android:id=&quot;@+id/btn2&quot;\n" +
                            "        android:layout_width=&quot;wrap_content&quot;\n" +
                            "        android:layout_height=&quot;wrap_content&quot;\n" +
                            "        android:layout_alignParentRight=&quot;true&quot;\n" +
                            "        android:layout_centerVertical=&quot;true&quot;\n" +
                            "        android:text=&quot;Button2&quot; /&gt;\n" +
                            "    &lt;Button\n" +
                            "        android:id=&quot;@+id/btn3&quot;\n" +
                            "        android:layout_width=&quot;wrap_content&quot;\n" +
                            "        android:layout_height=&quot;wrap_content&quot;\n" +
                            "        android:layout_alignParentLeft=&quot;true&quot;\n" +
                            "        android:layout_centerVertical=&quot;true&quot;\n" +
                            "        android:text=&quot;Button3&quot; /&gt;\n" +
                            "\n" +
                            "    &lt;Button\n" +
                            "        android:id=&quot;@+id/btn4&quot;\n" +
                            "        android:layout_width=&quot;match_parent&quot;\n" +
                            "        android:layout_height=&quot;wrap_content&quot;\n" +
                            "        android:layout_alignParentBottom=&quot;true&quot;\n" +
                            "        android:text=&quot;Button4&quot; /&gt;\n" +
                            "    &lt;Button\n" +
                            "        android:id=&quot;@+id/btn5&quot;\n" +
                            "        android:layout_width=&quot;wrap_content&quot;\n" +
                            "        android:layout_height=&quot;wrap_content&quot;\n" +
                            "        android:layout_alignBottom=&quot;@+id/btn2&quot;\n" +
                            "        android:layout_centerHorizontal=&quot;true&quot;\n" +
                            "        android:text=&quot;Button5&quot; /&gt;\n" +
                            "    &lt;Button\n" +
                            "        android:id=&quot;@+id/btn6&quot;\n" +
                            "        android:layout_width=&quot;wrap_content&quot;\n" +
                            "        android:layout_height=&quot;wrap_content&quot;\n" +
                            "        android:layout_above=&quot;@+id/btn4&quot;\n" +
                            "        android:layout_centerHorizontal=&quot;true&quot;\n" +
                            "        android:text=&quot;Button6&quot; /&gt;\n" +
                            "    &lt;Button\n" +
                            "        android:id=&quot;@+id/btn7&quot;\n" +
                            "        android:layout_width=&quot;wrap_content&quot;\n" +
                            "        android:layout_height=&quot;wrap_content&quot;\n" +
                            "        android:layout_toEndOf=&quot;@+id/btn1&quot;\n" +
                            "        android:layout_toRightOf=&quot;@+id/btn1&quot;\n" +
                            "        android:layout_alignParentRight=&quot;true&quot;\n" +
                            "        android:text=&quot;Button7&quot; /&gt;\n" +
                            "&lt;/RelativeLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.relativelayoutexample;\n" +
                            "\n" +
                            "import android.support.v7.app.AppCompatActivity;\n" +
                            "import android.os.Bundle;\n" +
                            "\n" +
                            "public class MainActivity extends AppCompatActivity {\n" +
                            "    @Override\n" +
                            "    protected void onCreate(Bundle savedInstanceState) {\n" +
                            "        super.onCreate(savedInstanceState);\n" +
                            "        setContentView(R.layout.activity_main);\n" +
                            "    }\n" +
                            "}</pre>",
                    "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=relative_img.png height=500 width=300/>"));
            mTutorialData.put("Table Layout",new TabDetailsPojoClass(
                    "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">Table Layout</h1> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; &nbsp;↳ android.view.View<br />&nbsp; &nbsp; &nbsp;&nbsp;↳ android.view.ViewGroup<br />&nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.LinearLayout<br />&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.TableLayout</pre> <p>In Android,&nbsp;<strong>TableLayout </strong>is used to arrange the group of views into rows and columns. TableLayout&nbsp;containers do not display a borderline for their columns, rows or cells. A Table will have as many columns as the row with the most cells.</p> <p>The TableLayout in android will work the same as an HTML table and table will have as many columns as the row with the most cells. The TableLayout can be explained as&nbsp;<strong>&lt;table&gt;</strong>&nbsp;and TableRow is like&nbsp;<strong>&lt;tr&gt;</strong>&nbsp;element.</p> <p><strong>Important Points About Table Layout In Android:</strong></p> <ul> <li>For building a row in a table we will use the&nbsp;<code class=\" prettyprinted\"><span class=\"tag\">&lt;TableRow&gt;</span></code>&nbsp;element. Table row objects are the child views of a table layout.</li> <li>Each row of the table has zero or more cells and each cell can hold only one view object like ImageView, TextView&nbsp;or any other view.</li> <li>Total width of a table is defined by its parent container</li> <li>A column can be both stretchable and shrinkable. If shrinkable then the width of the column can be shrunk to fit the table into its parent object and if stretchable then it can expand in width to fit any extra space available.</li> <li>We cannot specify the width of the children&rsquo;s of the TableLayout. Here, width always match_parent width. However, the height attribute can be defined by a child; the default value of height attribute is wrap content.</li> </ul> <h2><span style=\"text-decoration: underline;\">TableLayout Attributes</span></h2> <table border=1> <tbody> <tr> <th>Attribute &amp; Description</th> </tr> <tr> <td> <p><strong>android:id</strong></p> <p>This is the ID which uniquely identifies the layout.</p> </td> </tr> <tr> <td> <p><strong>android:collapseColumns</strong></p> <p>This specifies the zero-based index of the columns to collapse. The column indices must be separated by a comma: 1, 2, 5.</p> </td> </tr> <tr> <td> <p><strong>android:shrinkColumns</strong></p> <p>The zero-based index of the columns to shrink. The column indices must be separated by a comma: 1, 2, 5.</p> </td> </tr> <tr> <td> <p><strong>android:stretchColumns</strong></p> <p>The zero-based index of the columns to stretch. The column indices must be separated by a comma: 1, 2, 5.</p> </td> </tr> </tbody> </table>",
                    "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                            "&lt;TableLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                            "    android:layout_width=&quot;match_parent&quot;\n" +
                            "    android:layout_height=&quot;match_parent&quot;\n" +
                            "    android:layout_marginTop=&quot;100dp&quot;\n" +
                            "    android:paddingLeft=&quot;10dp&quot;\n" +
                            "    android:paddingRight=&quot;10dp&quot; &gt;\n" +
                            "    &lt;TableRow android:background=&quot;#0079D6&quot; android:padding=&quot;5dp&quot;&gt;\n" +
                            "        &lt;TextView\n" +
                            "            android:layout_width=&quot;wrap_content&quot;\n" +
                            "            android:layout_height=&quot;wrap_content&quot;\n" +
                            "            android:layout_weight=&quot;1&quot;\n" +
                            "            android:text=&quot;Employee No&quot; /&gt;\n" +
                            "        &lt;TextView\n" +
                            "            android:layout_width=&quot;wrap_content&quot;\n" +
                            "            android:layout_height=&quot;wrap_content&quot;\n" +
                            "            android:layout_weight=&quot;1&quot;\n" +
                            "            android:text=&quot;User Name&quot; /&gt;\n" +
                            "        &lt;TextView\n" +
                            "            android:layout_width=&quot;wrap_content&quot;\n" +
                            "            android:layout_height=&quot;wrap_content&quot;\n" +
                            "            android:layout_weight=&quot;1&quot;\n" +
                            "            android:text=&quot;Location&quot; /&gt;\n" +
                            "    &lt;/TableRow&gt;\n" +
                            "    &lt;TableRow android:background=&quot;#DAE8FC&quot; android:padding=&quot;5dp&quot;&gt;\n" +
                            "        &lt;TextView\n" +
                            "            android:layout_width=&quot;wrap_content&quot;\n" +
                            "            android:layout_height=&quot;wrap_content&quot;\n" +
                            "            android:layout_weight=&quot;1&quot;\n" +
                            "            android:text=&quot;1&quot; /&gt;\n" +
                            "        &lt;TextView\n" +
                            "            android:layout_width=&quot;wrap_content&quot;\n" +
                            "            android:layout_height=&quot;wrap_content&quot;\n" +
                            "            android:layout_weight=&quot;1&quot;\n" +
                            "            android:text=&quot;James&quot; /&gt;\n" +
                            "        &lt;TextView\n" +
                            "            android:layout_width=&quot;wrap_content&quot;\n" +
                            "            android:layout_height=&quot;wrap_content&quot;\n" +
                            "            android:layout_weight=&quot;1&quot;\n" +
                            "            android:text=&quot;Ottawa&quot; /&gt;\n" +
                            "    &lt;/TableRow&gt;\n" +
                            "    &lt;TableRow android:background=&quot;#DAE8FC&quot; android:padding=&quot;5dp&quot;&gt;\n" +
                            "        &lt;TextView\n" +
                            "            android:layout_width=&quot;wrap_content&quot;\n" +
                            "            android:layout_height=&quot;wrap_content&quot;\n" +
                            "            android:layout_weight=&quot;1&quot;\n" +
                            "            android:text=&quot;2&quot; /&gt;\n" +
                            "        &lt;TextView\n" +
                            "            android:layout_width=&quot;wrap_content&quot;\n" +
                            "            android:layout_height=&quot;wrap_content&quot;\n" +
                            "            android:layout_weight=&quot;1&quot;\n" +
                            "            android:text=&quot;William&quot; /&gt;\n" +
                            "        &lt;TextView\n" +
                            "            android:layout_width=&quot;wrap_content&quot;\n" +
                            "            android:layout_height=&quot;wrap_content&quot;\n" +
                            "            android:layout_weight=&quot;1&quot;\n" +
                            "            android:text=&quot;Toronto&quot; /&gt;\n" +
                            "    &lt;/TableRow&gt;\n" +
                            "    &lt;TableRow android:background=&quot;#DAE8FC&quot; android:padding=&quot;5dp&quot;&gt;\n" +
                            "        &lt;TextView\n" +
                            "            android:layout_width=&quot;wrap_content&quot;\n" +
                            "            android:layout_height=&quot;wrap_content&quot;\n" +
                            "            android:layout_weight=&quot;1&quot;\n" +
                            "            android:text=&quot;3&quot; /&gt;\n" +
                            "        &lt;TextView\n" +
                            "            android:layout_width=&quot;wrap_content&quot;\n" +
                            "            android:layout_height=&quot;wrap_content&quot;\n" +
                            "            android:layout_weight=&quot;1&quot;\n" +
                            "            android:text=&quot;Jenny&quot; /&gt;\n" +
                            "        &lt;TextView\n" +
                            "            android:layout_width=&quot;wrap_content&quot;\n" +
                            "            android:layout_height=&quot;wrap_content&quot;\n" +
                            "            android:layout_weight=&quot;1&quot;\n" +
                            "            android:text=&quot;Kitchner&quot; /&gt;\n" +
                            "    &lt;/TableRow&gt;\n" +
                            "&lt;/TableLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.tablelayoutexample;\n" +
                            "\n" +
                            "import android.support.v7.app.AppCompatActivity;\n" +
                            "import android.os.Bundle;\n" +
                            "\n" +
                            "public class MainActivity extends AppCompatActivity {\n" +
                            "    @Override\n" +
                            "    protected void onCreate(Bundle savedInstanceState) {\n" +
                            "        super.onCreate(savedInstanceState);\n" +
                            "        setContentView(R.layout.activity_main);\n" +
                            "    }\n" +
                            "}</pre>",
                    "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=tablelayout_img.png height=500 width=300/><br/>\n"));
        mTutorialData.put("Frame Layout",new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">Frame Layout</h1> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; &nbsp;↳ android.view.View<br />&nbsp; &nbsp; &nbsp;&nbsp;↳ android.view.ViewGroup<br />&nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.FrameLayout</pre> <p>In Android, <strong>FrameLayout</strong> is designed to block out an area on the screen to display a single item. Generally, FrameLayout should be used to hold a single child view, because it can be difficult to organize child views in a way that's scalable to different screen sizes without the children overlapping each other.</p> <p>You can, however, add multiple children to a FrameLayout and control their position within the FrameLayout by assigning gravity to each child, using the android:layout_gravity attribute.</p> <h2><span style=\"text-decoration: underline;\">FrameLayout Attributes</span></h2> <table border=1> <tbody> <tr> <th>Attribute &amp; Description</th> </tr> <tr> <td> <p><strong>android:id</strong></p> <p>This is the ID which uniquely identifies the layout.</p> </td> </tr> <tr> <td> <p><strong>android:foreground</strong></p> <p>This defines the drawable to draw over the content and possible values may be a color value, in the form of \"#rgb\", \"#argb\", \"#rrggbb\", or \"#aarrggbb\".</p> </td> </tr> <tr> <td> <p><strong>android:foregroundGravity</strong></p> <p>Defines the gravity to apply to the foreground drawable. The gravity defaults to fill. Possible values are top, bottom, left, right, center, center_vertical, center_horizontal etc.</p> </td> </tr> <tr> <td> <p><strong>android:measureAllChildren</strong></p> <p>Determines whether to measure all children or just those in the VISIBLE or INVISIBLE state when measuring. Defaults to false.</p> </td> </tr> </tbody> </table>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;FrameLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    xmlns:app=&quot;http://schemas.android.com/apk/res-auto&quot;\n" +
                        "    android:layout_width=&quot;fill_parent&quot;\n" +
                        "    android:layout_height=&quot;fill_parent&quot;&gt;\n" +
                        "    &lt;ImageView\n" +
                        "        android:id=&quot;@+id/imageView&quot;\n" +
                        "        android:layout_width=&quot;match_parent&quot;\n" +
                        "        android:layout_height=&quot;match_parent&quot;\n" +
                        "        android:scaleType=&quot;fitCenter&quot;\n" +
                        "        app:srcCompat=&quot;@mipmap/ic_launcher&quot; /&gt;\n" +
                        "    &lt;TextView\n" +
                        "        android:layout_width=&quot;fill_parent&quot;\n" +
                        "        android:layout_height=&quot;fill_parent&quot;\n" +
                        "        android:gravity=&quot;center&quot;\n" +
                        "        android:text=&quot;Frame Layout&quot;\n" +
                        "        android:textSize=&quot;30px&quot;\n" +
                        "        android:textColor=&quot;#FFFFFF&quot;\n" +
                        "        android:textStyle=&quot;bold&quot; /&gt;\n" +
                        "&lt;/FrameLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.framelayoutexample;\n" +
                        "\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "    }\n" +
                        "}</pre>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=frame_img.png height=500 width=300/>"));
        mTutorialData.put("Absolute Layout",new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">Absolute Layout</h1> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; &nbsp;↳ android.view.View<br />&nbsp; &nbsp; &nbsp;&nbsp;↳ android.view.ViewGroup<br />&nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.AbsoluteLayout</pre> <p>In Android,&nbsp;<strong>AbsoluteLayout</strong> lets you specify exact locations (x/y coordinates) of its children. Absolute layouts are less flexible and harder to maintain than other types of layouts without absolute positioning.</p> <p><strong>Public Constructors:</strong></p> <table border=\"1\"> <tbody> <tr> <td>AbsoluteLayout(Context context)</td> </tr> <tr> <td>AbsoluteLayout(Context context, AttributeSet attrs)</td> </tr> <tr> <td>AbsoluteLayout(Context context, AttributeSet attrs, int defStyleAttr)</td> </tr> <tr> <td>AbsoluteLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes)</td> </tr> </tbody> </table> <h2><span style=\"text-decoration: underline;\">AbsoluteLayout Attributes</span></h2> <table border=\"1\"> <tbody> <tr> <th>Attribute &amp; Description</th> </tr> <tr> <td> <p><strong>android:id</strong></p> <p>This is the ID which uniquely identifies the layout.</p> </td> </tr> <tr> <td> <p><strong>android:layout_x</strong></p> <p>This specifies the x-coordinate of the view.</p> </td> </tr> <tr> <td> <p><strong>android:layout_y</strong></p> <p>This specifies the y-coordinate of the view.</p> </td> </tr> </tbody> </table>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;AbsoluteLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    android:layout_width=&quot;fill_parent&quot;\n" +
                        "    android:layout_height=&quot;fill_parent&quot;&gt;\n" +
                        "    &lt;Button\n" +
                        "        android:layout_width=&quot;100dp&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_x=&quot;53dp&quot;\n" +
                        "        android:layout_y=&quot;188dp&quot;\n" +
                        "        android:text=&quot;Login&quot; /&gt;\n" +
                        "    &lt;Button\n" +
                        "        android:layout_width=&quot;100dp&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_x=&quot;180dp&quot;\n" +
                        "        android:layout_y=&quot;191dp&quot;\n" +
                        "        android:text=&quot;SignUp&quot; /&gt;\n" +
                        "&lt;/AbsoluteLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.absolutelayoutexample;\n" +
                        "\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "    }\n" +
                        "}</pre>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=absolute_img.png height=500 width=300/>"));
        mTutorialData.put("Android ListView",new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">ListView</h1> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; &nbsp;↳ android.view.View<br />&nbsp; &nbsp; &nbsp;&nbsp;↳ android.view.ViewGroup<br />&nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.AdapterView&lt;android.widget.ListAdapter&gt;<br />&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.AbsListView<br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.ListView</pre> <p>In Android, <strong>ListView</strong>&nbsp;is a view which groups several items and display them in vertical scrollable list. The list items are automatically inserted to the list using an&nbsp;<strong>Adapter</strong>&nbsp;that pulls content from a source such as an array or database.</p> <p>An adapter actually bridges between UI components and the data source that fill data into UI Component. Adapter holds the data and send the data to adapter view, the view can take the data from adapter view and shows the data on different views like as spinner, list view, grid view, etc.</p> <p>The&nbsp;<strong>ListView</strong>&nbsp;and&nbsp;<strong>GridView</strong>&nbsp;are subclasses of&nbsp;<strong>AdapterView</strong>&nbsp;and they can be populated by binding them to an&nbsp;<strong>Adapter</strong>, which retrieves data from an external source and creates a View that represents each data entry.</p> <p>Android provides several subclasses of Adapter that are useful for retrieving different kinds of data and building views for an AdapterView ( i.e. ListView or GridView). The common adapters are:</p> <table border=\"1\"> <thead> <tr> <th>Adapter</th> <th>Description</th> </tr> </thead> <tbody> <tr> <td>ArrayAdapter</td> <td>It will expect an Array or List as input.</td> </tr> <tr> <td>CurosrAdapter</td> <td>It will accept an instance of a cursor as an input.</td> </tr> <tr> <td>SimpleAdapter</td> <td>It will accept a static data defined in the resources.</td> </tr> <tr> <td>BaseAdapter</td> <td>It is a generic implementation for all three adapter types and it can be used for&nbsp;ListView,&nbsp;Gridview&nbsp;or Spinners based on our requirements</td> </tr> </tbody> </table> <p><strong>ListView code in XML:</strong></p> <pre class=\"prettyprint\">&lt;!-- List Selector Code in ListView --&gt;\n" +
                        "&lt;ListView\n" +
                        "android:id=&quot;@+id/simpleListView&quot;\n" +
                        "android:layout_width=&quot;fill_parent&quot;\n" +
                        "android:layout_height=&quot;wrap_content&quot;\n" +
                        "android:divider=&quot;#f00&quot;\n" +
                        "android:dividerHeight=&quot;1dp&quot; \n" +
                        "android:listSelector=&quot;#0f0&quot;/&gt; &lt;!--list selector in green color--&gt;</pre> <h2><span style=\"text-decoration: underline;\">ListView Attributes</span></h2> <table border=\"1\"> <tbody> <tr> <th>Attribute &amp; Description</th> </tr> <tr> <td> <p><strong>android:id</strong></p> <p>This is the ID which uniquely identifies the layout.</p> </td> </tr> <tr> <td> <p><strong>android:divider</strong></p> <p>This is drawable or color to draw between list items.</p> </td> </tr> <tr> <td> <p><strong>android:dividerHeight</strong></p> <p>This specifies height of the divider. This could be in px, dp, sp, in, or mm.</p> </td> </tr> <tr> <td> <p><strong>android:entries</strong></p> <p>Specifies the reference to an array resource that will populate the ListView.</p> </td> </tr> <tr> <td> <p><strong>android:footerDividersEnabled</strong></p> <p>When set to false, the ListView will not draw the divider before each footer view. The default value is true.</p> </td> </tr> <tr> <td> <p><strong>android:headerDividersEnabled</strong></p> <p>When set to false, the ListView will not draw the divider after each header view. The default value is true.</p> </td> </tr> </tbody> </table>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;android.support.constraint.ConstraintLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;\n" +
                        "    tools:context=&quot;.MainActivity&quot;&gt;\n" +
                        "    &lt;ListView\n" +
                        "        android:id=&quot;@+id/listView&quot;\n" +
                        "        android:layout_width=&quot;match_parent&quot;\n" +
                        "        android:layout_height=&quot;fill_parent&quot;/&gt;\n" +
                        "&lt;/android.support.constraint.ConstraintLayout&gt;</pre> <h2><em>mylist.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;TextView xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    android:id=&quot;@+id/textView&quot;\n" +
                        "    android:layout_width=&quot;wrap_content&quot;\n" +
                        "    android:layout_height=&quot;wrap_content&quot;\n" +
                        "    android:text=&quot;Medium Text&quot;\n" +
                        "    android:textStyle=&quot;bold&quot;\n" +
                        "    android:textAppearance=&quot;?android:attr/textAppearanceMedium&quot;\n" +
                        "    android:layout_marginLeft=&quot;10dp&quot;\n" +
                        "    android:layout_marginTop=&quot;5dp&quot;\n" +
                        "    android:padding=&quot;2dp&quot;\n" +
                        "    android:textColor=&quot;#4d4d4d&quot;/&gt;</pre> <h2><em>strings.xml</em></h2> <pre class=\"prettyprint\">&lt;resources&gt;\n" +
                        "    &lt;string name=&quot;app_name&quot;&gt;ListView Example&lt;/string&gt;\n" +
                        "    &lt;string-array name=&quot;array_technology&quot;&gt;\n" +
                        "        &lt;item&gt;Android&lt;/item&gt;\n" +
                        "        &lt;item&gt;Java&lt;/item&gt;\n" +
                        "        &lt;item&gt;Php&lt;/item&gt;\n" +
                        "        &lt;item&gt;Hadoop&lt;/item&gt;\n" +
                        "        &lt;item&gt;Sap&lt;/item&gt;\n" +
                        "        &lt;item&gt;Python&lt;/item&gt;\n" +
                        "        &lt;item&gt;Ajax&lt;/item&gt;\n" +
                        "        &lt;item&gt;C++&lt;/item&gt;\n" +
                        "        &lt;item&gt;Ruby&lt;/item&gt;\n" +
                        "        &lt;item&gt;Rails&lt;/item&gt;\n" +
                        "        &lt;item&gt;.Net&lt;/item&gt;\n" +
                        "        &lt;item&gt;Perl&lt;/item&gt;\n" +
                        "    &lt;/string-array&gt;\n" +
                        "&lt;/resources&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.listviewexample;\n" +
                        "\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.AdapterView;\n" +
                        "import android.widget.ArrayAdapter;\n" +
                        "import android.widget.ListView;\n" +
                        "import android.widget.TextView;\n" +
                        "import android.widget.Toast;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    ListView listView;\n" +
                        "    TextView textView;\n" +
                        "    String[] listItem;\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        listView=(ListView)findViewById(R.id.listView);\n" +
                        "        textView=(TextView)findViewById(R.id.textView);\n" +
                        "        listItem = getResources().getStringArray(R.array.array_technology);\n" +
                        "        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,\n" +
                        "                android.R.layout.simple_list_item_1, android.R.id.text1, listItem);\n" +
                        "        listView.setAdapter(adapter);\n" +
                        "\n" +
                        "        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {\n" +
                        "                // TODO Auto-generated method stub\n" +
                        "                String value=adapter.getItem(position);\n" +
                        "                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}</pre>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=listview_img.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=listview_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=listview_img2.png height=500 width=300/>"));
        mTutorialData.put("Android GridView",new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">GridView</h1> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; &nbsp;↳ android.view.View<br />&nbsp; &nbsp; &nbsp;&nbsp;↳ android.view.ViewGroup<br />&nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.AdapterView&lt;android.widget.ListAdapter&gt;<br />&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.AbsListView<br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.GridView</pre> <p>In Android, <strong>GridView</strong>&nbsp;shows items in two-dimensional scrolling grid (rows &amp; columns) and the grid items are not necessarily predetermined but they automatically inserted to the layout using a&nbsp;<strong>ListAdapter</strong>.</p> <p>An adapter actually bridges between UI components and the data source that fill data into UI Component. Adapter can be used to supply the data to like a spinner, list view, grid view, etc.</p> <p>The&nbsp;<strong>ListView</strong>&nbsp;and&nbsp;<strong>GridView</strong>&nbsp;are subclasses of&nbsp;<strong>AdapterView</strong>&nbsp;and they can be populated by binding them to an&nbsp;<strong>Adapter</strong>, which retrieves data from an external source and creates a View that represents each data entry.</p> <p><strong>GridView code in XML:</strong></p> <pre class=\"prettyprint\">&lt;GridView\n" +
                        "android:id=&quot;@+id/simpleGridView&quot;\n" +
                        "android:layout_width=&quot;fill_parent&quot;\n" +
                        "android:layout_height=&quot;wrap_content&quot;\n" +
                        "android:numColumns=&quot;3&quot;/&gt;</pre> <h2><span style=\"text-decoration: underline;\">GridView Attributes</span></h2> <table border=1> <tbody> <tr> <th>Attribute &amp; Description</th> </tr> <tr> <td> <p><strong>android:id</strong></p> <p>This is the ID which uniquely identifies the layout.</p> </td> </tr> <tr> <td> <p><strong>android:columnWidth</strong></p> <p>This specifies the fixed width for each column. This could be in px, dp, sp, in, or mm.</p> </td> </tr> <tr> <td> <p><strong>android:gravity</strong></p> <p>Specifies the gravity within each cell. Possible values are top, bottom, left, right, center, center_vertical, center_horizontal etc.</p> </td> </tr> <tr> <td> <p><strong>android:horizontalSpacing</strong></p> <p>Defines the default horizontal spacing between columns. This could be in px, dp, sp, in, or mm.</p> </td> </tr> <tr> <td> <p><strong>android:numColumns</strong></p> <p>Defines how many columns to show. May be an integer value, such as \"100\" or auto_fit which means display as many columns as possible to fill the available space.</p> </td> </tr> <tr> <td> <p><strong>android:stretchMode</strong></p> <p>Defines how columns should stretch to fill the available empty space, if any. This must be either of the values &minus;</p> <ul class=\"list\"> <li> <p>none &minus; Stretching is disabled.</p> </li> <li> <p>spacingWidth &minus; The spacing between each column is stretched.</p> </li> <li> <p>columnWidth &minus; Each column is stretched equally.</p> </li> <li> <p>spacingWidthUniform &minus; The spacing between each column is uniformly stretched..</p> </li> </ul> </td> </tr> <tr> <td> <p><strong>android:verticalSpacing</strong></p> <p>Defines the default vertical spacing between rows. This could be in px, dp, sp, in, or mm.</p> </td> </tr> </tbody> </table>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><p>Following is the simple example showing user details using&nbsp;<strong>GridView</strong>&nbsp;and showing the position of particular image when clicking on it in android applications.</p> <p>Once we create an application, add some sample images to project&nbsp; <strong>/res/drawable&nbsp;</strong>directory to show the images in GridView.</p> <h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;GridView xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    android:id=&quot;@+id/gridview&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;\n" +
                        "    android:columnWidth=&quot;110dp&quot;\n" +
                        "    android:numColumns=&quot;auto_fit&quot;\n" +
                        "    android:verticalSpacing=&quot;10dp&quot;\n" +
                        "    android:horizontalSpacing=&quot;10dp&quot;\n" +
                        "    android:stretchMode=&quot;columnWidth&quot;\n" +
                        "    android:gravity=&quot;center&quot; /&gt;</pre> <h2><em>ImageAdapter.java</em></h2> <pre class=\"prettyprint\">package com.hd.gridviewexample;\n" +
                        "import android.content.Context;\n" +
                        "import android.view.View;\n" +
                        "import android.view.ViewGroup;\n" +
                        "import android.widget.BaseAdapter;\n" +
                        "import android.widget.GridView;\n" +
                        "import android.widget.ImageView;\n" +
                        "\n" +
                        "public class ImageAdapter extends BaseAdapter {\n" +
                        "    private Context mContext;\n" +
                        "    public ImageAdapter(Context c) {\n" +
                        "        mContext = c;\n" +
                        "    }\n" +
                        "    public int getCount() {\n" +
                        "        return thumbImages.length;\n" +
                        "    }\n" +
                        "    public Object getItem(int position) {\n" +
                        "        return null;\n" +
                        "    }\n" +
                        "    public long getItemId(int position) {\n" +
                        "        return 0;\n" +
                        "    }\n" +
                        "    // create a new ImageView for each item referenced by the Adapter\n" +
                        "    public View getView(int position, View convertView, ViewGroup parent) {\n" +
                        "        ImageView imageView = new ImageView(mContext);\n" +
                        "        imageView.setLayoutParams(new GridView.LayoutParams(200, 200));\n" +
                        "        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);\n" +
                        "        imageView.setPadding(8, 8, 8, 8);\n" +
                        "        imageView.setImageResource(thumbImages[position]);\n" +
                        "        return imageView;\n" +
                        "    }\n" +
                        "    // Add all our images to arraylist\n" +
                        "    public Integer[] thumbImages = {\n" +
                        "            R.drawable.img1, R.drawable.img2,\n" +
                        "            R.drawable.img3, R.drawable.img4,\n" +
                        "            R.drawable.img5, R.drawable.img6,\n" +
                        "            R.drawable.img7, R.drawable.img8,\n" +
                        "            R.drawable.img1, R.drawable.img2,\n" +
                        "            R.drawable.img3, R.drawable.img4,\n" +
                        "            R.drawable.img5, R.drawable.img6,\n" +
                        "            R.drawable.img7, R.drawable.img8,\n" +
                        "            R.drawable.img1, R.drawable.img2,\n" +
                        "            R.drawable.img3, R.drawable.img4,\n" +
                        "            R.drawable.img5\n" +
                        "    };\n" +
                        "}</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.intentexample;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.AdapterView;\n" +
                        "import android.widget.GridView;\n" +
                        "import android.widget.Toast;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        GridView gv = (GridView) findViewById(R.id.gridview);\n" +
                        "        gv.setAdapter(new ImageAdapter(this));\n" +
                        "        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {\n" +
                        "            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {\n" +
                        "                Toast.makeText(MainActivity.this, \"Image Position: \" + position, Toast.LENGTH_SHORT).show();\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}</pre><h2>Android GridView Details Activity Example:</h2> <p>In the above example, we implemented an image gallery using GridView in the android application. Now we will extend the functionality of the above example to show the selected grid image in full screen.&nbsp;</p> <p>Now we need to create a new layout (<strong>image_details.xml</strong>) file in project&nbsp; <strong>/res/layout</strong>&nbsp;directory to show the image details, for that right click on layouts folder&nbsp;&agrave;&nbsp;select New&nbsp;&agrave;&nbsp;Layout resource file&nbsp;&agrave;&nbsp;Give name as&nbsp;<strong>image_details.xml&nbsp; </strong>and click&nbsp;<strong>OK</strong>. Now open newly created file (<strong>image_details.xml</strong>) and write the code like as shown below.</p> <h2><em>image_details.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;LinearLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    android:orientation=&quot;vertical&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;&gt;\n" +
                        "    &lt;ImageView\n" +
                        "        android:id=&quot;@+id/full_image_view&quot;\n" +
                        "        android:layout_width=&quot;match_parent&quot;\n" +
                        "        android:layout_height=&quot;match_parent&quot;/&gt;\n" +
                        "&lt;/LinearLayout&gt;</pre> <h2><em>FullImageActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.gridviewexample;\n" +
                        "import android.app.Activity;\n" +
                        "import android.content.Intent;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.widget.ImageView;\n" +
                        "\n" +
                        "public class FullImageActivity extends Activity {\n" +
                        "    @Override\n" +
                        "    public void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.image_details);\n" +
                        "        // Get intent data\n" +
                        "        Intent i = getIntent();\n" +
                        "        // Get Selected Image Id\n" +
                        "        int position = i.getExtras().getInt(\"id\");\n" +
                        "        ImageAdapter imageAdapter = new ImageAdapter(this);\n" +
                        "        ImageView imageView = (ImageView) findViewById(R.id.full_image_view);\n" +
                        "        imageView.setImageResource(imageAdapter.thumbImages[position]);\n" +
                        "    }\n" +
                        "}</pre> <p>Now we need to include our newly created activity file (<strong>FullImageActivity.java</strong>) in&nbsp;<strong>AndroidManifest.xml</strong>&nbsp;file like as shown below. For that, open&nbsp; <strong>AndroidManifest.xml</strong>&nbsp;file and write the code like as shown below</p> <h2><em>AndroidManifest.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;manifest xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    package=&quot;com.hd.gridviewexample&quot;&gt;\n" +
                        "    &lt;application\n" +
                        "        android:allowBackup=&quot;true&quot;\n" +
                        "        android:icon=&quot;@mipmap/ic_launcher&quot;\n" +
                        "        android:label=&quot;@string/app_name&quot;\n" +
                        "        android:roundIcon=&quot;@mipmap/ic_launcher_round&quot;\n" +
                        "        android:supportsRtl=&quot;true&quot;\n" +
                        "        android:theme=&quot;@style/AppTheme&quot;&gt;\n" +
                        "        &lt;activity android:name=&quot;.MainActivity&quot;&gt;\n" +
                        "            &lt;intent-filter&gt;\n" +
                        "                &lt;action android:name=&quot;android.intent.action.MAIN&quot; /&gt;\n" +
                        "                &lt;category android:name=&quot;android.intent.category.LAUNCHER&quot; /&gt;\n" +
                        "            &lt;/intent-filter&gt;\n" +
                        "        &lt;/activity&gt;\n" +
                        "        &lt;!-- FullImageActivity --&gt;\n" +
                        "        &lt;activity android:name=&quot;.FullImageActivity&quot;&gt;&lt;/activity&gt;\n" +
                        "    &lt;/application&gt;\n" +
                        "&lt;/manifest&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.gridviewexample;\n" +
                        "import android.content.Intent;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.AdapterView;\n" +
                        "import android.widget.GridView;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        GridView gv = (GridView) findViewById(R.id.gridview);\n" +
                        "        gv.setAdapter(new ImageAdapter(this));\n" +
                        "        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {\n" +
                        "            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {\n" +
                        "                // Sending image id to FullScreenActivity\n" +
                        "                Intent i = new Intent(getApplicationContext(), FullImageActivity.class);\n" +
                        "                // passing array index\n" +
                        "                i.putExtra(\"id\", position);\n" +
                        "                startActivity(i);\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}</pre>",
                "<h2 style=\"text-align: center;\">Simple GridView Output</h2> <hr /> <p style=\"text-align: center;\"><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"gridview_img1.png\" width=\"300/\" height=\"500\" /></p> <p style=\"text-align: center;\"><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"gridview_img2.png\" width=\"300/\" height=\"500\" /></p> <h2 style=\"text-align: center;\">GridView Details Activity Output</h2> <hr /> <p style=\"text-align: center;\"><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"gridview_img3.png\" width=\"300/\" height=\"500\" /></p> <p style=\"text-align: center;\"><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"gridview_img4.png\" width=\"300/\" height=\"500\" /></p>"));
        mTutorialData.put("Android WebView",new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">WebView</h1> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; &nbsp;↳ android.view.View<br />&nbsp; &nbsp; &nbsp;&nbsp;↳ android.view.ViewGroup<br />&nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.AbsoluteLayout<br />&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.webkit.WebView</pre> <p>In Android, <strong>WebView</strong> is a view that display web pages inside your application. You can also specify HTML string and can show it inside your application using WebView. WebView makes turns your application to a web application.</p> <p>Android WebView uses WebKit engine to display a web page.</p> <p>The&nbsp;<strong>loadUrl()</strong>&nbsp;and&nbsp;<strong>loadData()</strong>&nbsp;methods of Android WebView class are used to load and display a web page.</p> <p><strong>WebView code in XML:</strong></p> <pre class=\"prettyprint\">&lt;WebView  \n" +
                        "   xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "   android:id=&quot;@+id/webview&quot;\n" +
                        "   android:layout_width=&quot;fill_parent&quot;\n" +
                        "   android:layout_height=&quot;fill_parent&quot;\n" +
                        "/&gt;</pre> <p>In order for Activity to access the Internet and load the web pages in a WebView, we&nbsp;must add the internet permissions to our <strong>AndroidManifest.xml</strong> file.&nbsp;</p> <pre class=\"prettyprint\">&lt;!--Add this before application tag in AndroidManifest.xml--&gt;\n" +
                        "&lt;uses-permission android:name=&quot;android.permission.INTERNET&quot; /&gt;</pre> <p>Let's see the simple code to&nbsp;display&nbsp;<strong>google.com </strong>web page&nbsp;using web view.&nbsp;</p> <pre class=\"prettyprint\">WebView mywebview = (WebView) findViewById(R.id.webView1);  \n" +
                        "mywebview.loadUrl(\"https://www.google.com/\");</pre> <p>Let's see the simple code to&nbsp;display an<strong> HTML </strong>web page&nbsp;using web view. In this case, the HTML file must be located inside the asset directory.</p> <pre class=\"prettyprint\">WebView mywebview = (WebView) findViewById(R.id.webView1);  \n" +
                        "mywebview.loadUrl(\"file:///android_asset/myresource.html\");</pre> <p>Let's see another code to display&nbsp;<strong>HTML code of a string</strong>.</p> <pre class=\"prettyprint\">String data = &quot;&lt;html&gt;&lt;body&gt;&lt;h1&gt;Hello, World!&lt;/h1&gt;&lt;/body&gt;&lt;/html&gt;&quot;;\n" +
                        "mywebview.loadData(data, \"text/html\", \"UTF-8\");</pre> <p>If you click on any link inside the webpage of the WebView, that page will not be loaded inside your WebView. In order to do that you need to extend your class from&nbsp;<strong>WebViewClient</strong>&nbsp;and override its method.&nbsp;Its syntax is:</p> <pre class=\"prettyprint\">private class MyBrowser extends WebViewClient {\n" +
                        "   @Override\n" +
                        "   public boolean shouldOverrideUrlLoading(WebView view, String url) {\n" +
                        "      view.loadUrl(url);\n" +
                        "      return true;\n" +
                        "   }\n" +
                        "}</pre> <h2>WebView Methods:</h2> <table border=\"1\"> <tbody> <tr> <th>Method &amp; Description</th> </tr> <tr> <td> <p><strong>canGoBack()</strong></p> <p>This method specifies the WebView has a back history item.</p> </td> </tr> <tr> <td> <p><strong>canGoForward()</strong></p> <p>This method specifies the WebView has a forward history item.</p> </td> </tr> <tr> <td> <p><strong>clearHistory()</strong></p> <p>This method will clear the WebView forward and backward history.</p> </td> </tr> <tr> <td> <p><strong>destroy()</strong></p> <p>This method destroy the internal state of WebView.</p> </td> </tr> <tr> <td> <p><strong>findAllAsync(String find)</strong></p> <p>This method find all instances of string and highlight them.</p> </td> </tr> <tr> <td> <p><strong>getProgress()</strong></p> <p>This method gets the progress of the current page.</p> </td> </tr> <tr> <td> <p><strong>getTitle()</strong></p> <p>This method return the title of the current page.</p> </td> </tr> <tr> <td> <p><strong>getUrl()</strong></p> <p>This method returns the URL of the current page.</p> </td> </tr> </tbody> </table>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><p>Following is the example of showing a static HTML content in WebView in android applications.</p> <h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;WebView\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    android:id=&quot;@+id/webview&quot;\n" +
                        "    android:layout_width=&quot;fill_parent&quot;\n" +
                        "    android:layout_height=&quot;fill_parent&quot;/&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.webviewexample;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.webkit.WebView;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        WebView wv = (WebView) findViewById(R.id.webview);\n" +
                        "        String customHtml = &quot;&lt;html&gt;&lt;body&gt;&lt;h1&gt;Hello World!&lt;/h1&gt;&quot; +\n" +
                        "                &quot;&lt;h2&gt;Webview Layout&lt;/h2&gt;&lt;h3&gt;Webview Example&lt;/h3&gt;&quot; +\n" +
                        "                &quot;&lt;p&gt;It's a Static Web HTML Content.&lt;/p&gt;&quot; +\n" +
                        "                &quot;&lt;/body&gt;&lt;/html&gt;&quot;;\n" +
                        "        wv.loadData(customHtml, \"text/html\", \"UTF-8\");\n" +
                        "    }\n" +
                        "}</pre> <h2 id=\"divanwvrmtex\">Web URL Content in WebView Example:</h2> <p>Generally, in android&nbsp;<strong>WebView</strong>&nbsp;will act as an embedded browser to show the static or remote web page content in our Android applications.</p> <p>To load the remote web URL content, our application must have access to the internet. We need to set internet access permissions like as shown below.</p><pre class=\"prettyprint\">&lt;manifest &hellip;&hellip;&gt;\n" +
                        "&hellip;&hellip;\n" +
                        "    &lt;uses-permission android:name=&quot;android.permission.INTERNET&quot; /&gt;\n" +
                        "\n" +
                        "&hellip;&hellip;\n" +
                        "&lt;/manifest&gt;</pre><h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;WebView\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    android:id=&quot;@+id/webview&quot;\n" +
                        "    android:layout_width=&quot;fill_parent&quot;\n" +
                        "    android:layout_height=&quot;fill_parent&quot;/&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.webviewexample;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.webkit.WebView;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        WebView webView = (WebView) findViewById(R.id.webview);\n" +
                        "        webView.getSettings().setJavaScriptEnabled(true);\n" +
                        "        webView.loadUrl(\"https://www.google.com/\");\n" +
                        "    }\n" +
                        "}</pre>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=webview_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=webview_img2.png height=500 width=300/>"));
            mTutorialData.put("Options Menu", new TabDetailsPojoClass(
                    "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">Options Menu</h1><hr /><p>In Android,<strong>&nbsp;Options Menu</strong>&nbsp;is the primary menu of android. It can be used for settings, search, delete an item, etc.</p> <p>We can define items for the options menu from either our Activity or Fragment class.</p> <p><strong>Option Menu code in XML:</strong></p> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                            "&lt;menu xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;&gt;\n" +
                            "    &lt;item android:id=&quot;@+id/mail&quot;\n" +
                            "        android:icon=&quot;@drawable/ic_mail&quot;\n" +
                            "        android:title=&quot;@string/mail&quot; /&gt;\n" +
                            "    &lt;item android:id=&quot;@+id/upload&quot;\n" +
                            "        android:icon=&quot;@drawable/ic_upload&quot;\n" +
                            "        android:title=&quot;@string/upload&quot;\n" +
                            "        android:showAsAction=&quot;ifRoom&quot; /&gt;\n" +
                            "    &lt;item android:id=&quot;@+id/share&quot;\n" +
                            "        android:icon=&quot;@drawable/ic_share&quot;\n" +
                            "        android:title=&quot;@string/share&quot; /&gt;\n" +
                            "&lt;/menu&gt;</pre> <p><strong>Load Option Menu in Activity File:</strong></p> <pre class=\"prettyprint\">@Override\n" +
                            "public void onCreateOptionsMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {\n" +
                            "    super.onCreateContextMenu(menu, v, menuInfo);\n" +
                            "    MenuInflater inflater = getMenuInflater();\n" +
                            "    inflater.inflate(R.menu.menu_example, menu);\n" +
                            "}</pre><p>In the above code, we are calling our menu using <strong>MenuInflater.inflate()</strong> method in the form of <strong>R.menu.menu_file_name</strong>. Here our XML file name is <strong>menu_example.xml</strong> so we used file name menu_example.</p> <p><strong>Handle Option Menu click event:</strong></p><p>In android, we can handle a options menu item click events using <strong>onOptionsItemSelected()</strong> event method.</p></p> <pre class=\"prettyprint\">@Override\n" +
                            "public boolean onOptionsItemSelected(MenuItem item) {\n" +
                            "    switch (item.getItemId()) {\n" +
                            "        case R.id.mail:\n" +
                            "            // do something\n" +
                            "            return true;\n" +
                            "        case R.id.share:\n" +
                            "            // do something\n" +
                            "            return true;\n" +
                            "        default:\n" +
                            "            return super.onContextItemSelected(item);\n" +
                            "    }\n" +
                            "}</pre> <h2><span style=\"text-decoration: underline;\">Option Menu Attributes</span></h2> <table border=\"1\"> <thead> <tr> <th>Attribute</th> <th>Description</th> </tr> </thead> <tbody> <tr> <td>android:id</td> <td>It is used to uniquely identify an element in the application.</td> </tr> <tr> <td>android:icon</td> <td>It is used to set the item's icon from the drawable folder.</td> </tr> <tr> <td>android:title</td> <td>It is used to set the item's title</td> </tr> <tr> <td>android:showAsAction</td> <td>It is used to specify how the item should appear as an action item in the app bar.</td> </tr> </tbody> </table> <p><strong>Note</strong>: If you are using Android 3.0 +, the Options Menu won&rsquo;t support any item shortcuts and item icons in the menu.</p>",
                    "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><p>In android, to define <strong>Options Menu</strong>, we need to create a new folder <strong>menu</strong> inside of our project resource directory <strong>(res/menu/)</strong> and add a new XML <strong>(options_menu.xml)</strong> file to build the menu.</p><p>In this example, we are inflating the menu by calling the <strong>inflate()</strong> method of <strong>MenuInflater class</strong>. To perform event handling on <strong>menu items</strong>, you need to override <strong>onOptionsItemSelected()</strong> method of Activity class.</p> <h2><em>options_menu.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                            "&lt;menu xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot; &gt;\n" +
                            "    &lt;item android:id=&quot;@+id/search_item&quot;\n" +
                            "        android:title=&quot;Search&quot; /&gt;\n" +
                            "    &lt;item android:id=&quot;@+id/upload_item&quot;\n" +
                            "        android:title=&quot;Upload&quot; /&gt;\n" +
                            "    &lt;item android:id=&quot;@+id/copy_item&quot;\n" +
                            "        android:title=&quot;Copy&quot; /&gt;\n" +
                            "    &lt;item android:id=&quot;@+id/print_item&quot;\n" +
                            "        android:title=&quot;Print&quot; /&gt;\n" +
                            "    &lt;item android:id=&quot;@+id/share_item&quot;\n" +
                            "        android:title=&quot;Share&quot; /&gt;\n" +
                            "    &lt;item android:id=&quot;@+id/bookmark_item&quot;\n" +
                            "        android:title=&quot;BookMark&quot; /&gt;\n" +
                            "&lt;/menu&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.optionsmenuexample;\n" +
                            "import android.support.v7.app.AppCompatActivity;\n" +
                            "import android.os.Bundle;\n" +
                            "import android.view.Menu;\n" +
                            "import android.view.MenuItem;\n" +
                            "import android.widget.Toast;\n" +
                            "\n" +
                            "public class MainActivity extends AppCompatActivity {\n" +
                            "    @Override\n" +
                            "    protected void onCreate(Bundle savedInstanceState) {\n" +
                            "        super.onCreate(savedInstanceState);\n" +
                            "        setContentView(R.layout.activity_main);\n" +
                            "    }\n" +
                            "    @Override\n" +
                            "    public boolean onCreateOptionsMenu(Menu menu) {\n" +
                            "        getMenuInflater().inflate(R.menu.options_menu, menu);\n" +
                            "        return true;\n" +
                            "    }\n" +
                            "    @Override\n" +
                            "    public boolean onOptionsItemSelected(MenuItem item) {\n" +
                            "        Toast.makeText(this, \"Selected Item: \" +item.getTitle(), Toast.LENGTH_SHORT).show();\n" +
                            "        switch (item.getItemId()) {\n" +
                            "            case R.id.search_item:\n" +
                            "                // do your code\n" +
                            "                return true;\n" +
                            "            case R.id.upload_item:\n" +
                            "                // do your code\n" +
                            "                return true;\n" +
                            "            case R.id.copy_item:\n" +
                            "                // do your code\n" +
                            "                return true;\n" +
                            "            case R.id.print_item:\n" +
                            "                // do your code\n" +
                            "                return true;\n" +
                            "            case R.id.share_item:\n" +
                            "                // do your code\n" +
                            "                return true;\n" +
                            "            case R.id.bookmark_item:\n" +
                            "                // do your code\n" +
                            "                return true;\n" +
                            "            default:\n" +
                            "                return super.onOptionsItemSelected(item);\n" +
                            "        }\n" +
                            "    }\n" +
                            "}</pre>",
                    "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=options_menu_img.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=options_menu_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=options_menu_img2.png height=500 width=300/>\n"));
        mTutorialData.put("Context Menu", new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">Context Menu</h1> <hr /> <p>In Android,&nbsp;<strong>Context Menu</strong>&nbsp;is like a floating menu and that appears when the user performs a long press or click on an element and it is useful to implement actions that affect the selected content or context frame. It doesn't support item shortcuts and icons.&nbsp;</p> <p>The android Context Menu is more like the menu which displayed on right-click in Windows or Linux.</p> <p><strong>Create Context Menu in Activity File:</strong></p> <pre class=\"prettyprint\">@Override\n" +
                        "protected void onCreate(Bundle savedInstanceState) {\n" +
                        "    super.onCreate(savedInstanceState);\n" +
                        "    setContentView(R.layout.activity_main);\n" +
                        "    Button btn = (Button) findViewById(R.id.btnShow);\n" +
                        "    registerForContextMenu(btn);\n" +
                        "}\n" +
                        "@Override\n" +
                        "public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {\n" +
                        "    super.onCreateContextMenu(menu, v, menuInfo);\n" +
                        "    menu.setHeaderTitle(\"Context Menu\");\n" +
                        "    menu.add(0, v.getId(), 0, \"Upload\");\n" +
                        "    menu.add(0, v.getId(), 0, \"Search\");   \n" +
                        "}</pre> <p><strong>Handle Context Menu click event:</strong></p> <pre class=\"prettyprint\">@Override\n" +
                        "public boolean onContextItemSelected(MenuItem item) {\n" +
                        "    if (item.getTitle() == \"Save\") {\n" +
                        "        // do your coding\n" +
                        "    }\n" +
                        "    else {\n" +
                        "        return  false;\n" +
                        "    }\n" +
                        "    return true;\n" +
                        "}</pre><p><strong>Note</strong>: If you are using Android 3.0 +, the Context Menu won&rsquo;t support any item shortcuts and item icons in the menu.&nbsp;</p>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;LinearLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;\n" +
                        "    android:orientation=&quot;vertical&quot; &gt;\n" +
                        "    &lt;Button\n" +
                        "        android:id=&quot;@+id/btnShow&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:text=&quot;Long press me&quot;\n" +
                        "        android:layout_marginTop=&quot;200dp&quot;\n" +
                        "        android:layout_marginLeft=&quot;100dp&quot;/&gt;\n" +
                        "&lt;/LinearLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.contextmenuexample;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.ContextMenu;\n" +
                        "import android.view.MenuItem;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.Toast;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        Button btn = (Button) findViewById(R.id.btnShow);\n" +
                        "\n" +
                        "        //Registered view for the context menu\n" +
                        "        registerForContextMenu(btn);\n" +
                        "    }\n" +
                        "    @Override\n" +
                        "    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {\n" +
                        "        super.onCreateContextMenu(menu, v, menuInfo);\n" +
                        "        menu.setHeaderTitle(\"Context Menu\");\n" +
                        "        menu.add(0, v.getId(), 0, \"Upload\");\n" +
                        "        menu.add(0, v.getId(), 0, \"Search\");\n" +
                        "        menu.add(0, v.getId(), 0, \"Share\");\n" +
                        "        menu.add(0, v.getId(), 0, \"Bookmark\");\n" +
                        "    }\n" +
                        "    @Override\n" +
                        "    public boolean onContextItemSelected(MenuItem item) {\n" +
                        "        Toast.makeText(this, \"Selected Item: \" +item.getTitle(), Toast.LENGTH_SHORT).show();\n" +
                        "        return true;\n" +
                        "    }\n" +
                        "}</pre>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=context_menu_img.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=context_menu_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=context_menu_img2.png height=500 width=300/><br/>\n"));
        mTutorialData.put("Popup Menu", new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">Popup Menu</h1> <hr /> <p>In Android,&nbsp;<strong>Popup Menu</strong>&nbsp;displays a list of items in a modal popup window that is anchored to the view. The popup menu will appear below the view&nbsp;if there is a room or above the view in case if there is no space and it will be closed automatically when we touch outside of the popup.&nbsp;</p> <p>The android Popup Menu provides an overflow style menu for actions that are related to specific content.</p> <p>In android, the Popup Menu provides an overflow of actions that are related to specific content and the actions in popup menu won&rsquo;t affect the corresponding content. &nbsp;The popup menu won&rsquo;t support any item shortcuts and item icons.&nbsp;</p> <p>In android, Popup menu is available with API level 11 (Android 3.0) and higher versions. If you are using Android 3.0 +, the Popup Menu won&rsquo;t support any item shortcuts and item icons in the menu.</p> <p><strong>Popup Menu code in XML:</strong></p> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;menu xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;&gt;\n" +
                        "    &lt;item android:id=&quot;@+id/mail&quot;\n" +
                        "        android:icon=&quot;@drawable/ic_mail&quot;\n" +
                        "        android:title=&quot;@string/mail&quot; /&gt;\n" +
                        "    &lt;item android:id=&quot;@+id/upload&quot;\n" +
                        "        android:icon=&quot;@drawable/ic_upload&quot;\n" +
                        "        android:title=&quot;@string/upload&quot;\n" +
                        "        android:showAsAction=&quot;ifRoom&quot; /&gt;\n" +
                        "    &lt;item android:id=&quot;@+id/share&quot;\n" +
                        "        android:icon=&quot;@drawable/ic_share&quot;\n" +
                        "        android:title=&quot;@string/share&quot; /&gt;\n" +
                        "&lt;/menu&gt;</pre> <p><strong>Load Popup Menu in Activity File:</strong></p> <pre class=\"prettyprint\">public void showPopup(View v) {\n" +
                        "    PopupMenu popup = new PopupMenu(this, v);\n" +
                        "    MenuInflater inflater = popup.getMenuInflater();\n" +
                        "    inflater.inflate(R.menu.menu_example, popup.getMenu());\n" +
                        "    popup.show();\n" +
                        "}</pre> <p><strong>Handle Popup Menu click event:</strong></p> <p>To perform an action when the user selects a menu item, we need to implement the&nbsp;<strong>PopupMenu.OnMenuItemClickListener</strong>&nbsp;interface and register it with our&nbsp;<strong>PopupMenu</strong>&nbsp;by calling&nbsp;<strong>setOnMenuItemclickListener()</strong>. When the user selects an item, the system calls the&nbsp;<strong>onMenuItemClick()</strong> callback in your interface.</p> <pre class=\"prettyprint\">public void showMenu(View v) {\n" +
                        "    PopupMenu popup = new PopupMenu(this, v);\n" +
                        "    popup.setOnMenuItemClickListener(this);\n" +
                        "    popup.inflate(R.menu.actions);\n" +
                        "    popup.show();\n" +
                        "}\n" +
                        "\n" +
                        "@Override\n" +
                        "public boolean onMenuItemClick(MenuItem item) {\n" +
                        "    switch (item.getItemId()) {\n" +
                        "        case R.id.archive:\n" +
                        "            archive(item);\n" +
                        "            return true;\n" +
                        "        case R.id.delete:\n" +
                        "            delete(item);\n" +
                        "            return true;\n" +
                        "        default:\n" +
                        "            return false;\n" +
                        "    }\n" +
                        "}</pre>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;android.support.constraint.ConstraintLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    xmlns:app=&quot;http://schemas.android.com/apk/res-auto&quot;\n" +
                        "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;\n" +
                        "    tools:context=&quot;.MainActivity&quot;&gt;\n" +
                        "    &lt;Button\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:id=&quot;@+id/button&quot;\n" +
                        "        android:text=&quot;Click&quot;\n" +
                        "        app:layout_constraintBottom_toBottomOf=&quot;parent&quot;\n" +
                        "        app:layout_constraintLeft_toLeftOf=&quot;parent&quot;\n" +
                        "        app:layout_constraintRight_toRightOf=&quot;parent&quot;\n" +
                        "        app:layout_constraintTop_toTopOf=&quot;parent&quot; /&gt;\n" +
                        "&lt;/android.support.constraint.ConstraintLayout&gt;</pre> <h2><em>popup_menu.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;menu xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;&gt;\n" +
                        "    &lt;item\n" +
                        "        android:id=&quot;@+id/one&quot;\n" +
                        "        android:title=&quot;Account&quot; /&gt;\n" +
                        "    &lt;item\n" +
                        "        android:id=&quot;@+id/two&quot;\n" +
                        "        android:title=&quot;Privacy&quot;/&gt;\n" +
                        "    &lt;item\n" +
                        "        android:id=&quot;@+id/three&quot;\n" +
                        "        android:title=&quot;Setting&quot;/&gt;\n" +
                        "&lt;/menu&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.popupmenuexample;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.MenuItem;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.PopupMenu;\n" +
                        "import android.widget.Toast;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    Button button;\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        button = (Button) findViewById(R.id.button);\n" +
                        "\n" +
                        "        button.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                //Creating the instance of PopupMenu\n" +
                        "                PopupMenu popup = new PopupMenu(MainActivity.this, button);\n" +
                        "\n" +
                        "                //Inflating the Popup using xml file\n" +
                        "                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());\n" +
                        "\n" +
                        "                //registering popup with OnMenuItemClickListener\n" +
                        "                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {\n" +
                        "                    public boolean onMenuItemClick(MenuItem item) {\n" +
                        "                        Toast.makeText(MainActivity.this,\"You Clicked : \" + item.getTitle(), Toast.LENGTH_SHORT).show();\n" +
                        "                        return true;\n" +
                        "                    }\n" +
                        "                });\n" +
                        "                popup.show();//showing popup menu\n" +
                        "            }\n" +
                        "        });//closing the setOnClickListener method\n" +
                        "    }\n" +
                        "}</pre>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=popup_menu_img.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=popup_menu_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=popup_menu_img2.png height=500 width=300/>"));
            mTutorialData.put("Android Toast",new TabDetailsPojoClass(
                    "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">Toast</h1> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; ↳ android.widget.Toast</pre> <p>In Android, <strong>Toast</strong>&nbsp;is a small popup notification which is used to display information about the operation which we performed in our app. The Toast will show the message for a small period of time and it will disappear automatically after a timeout.</p> <p>The size of Toast will be adjusted based on the space required for the message and it will be displayed on the top of the main content of Activity&nbsp;for a short period of time.</p> <p><strong>Syntax of Toast:</strong></p> <pre class=\"prettyprint\">Toast.makeText(context,&nbsp;\"message\",&nbsp;duration).show();</pre> <table border=\"1\"> <thead> <tr> <th>Parameter</th> <th>Description</th> </tr> </thead> <tbody> <tr> <td>context</td> <td>It&rsquo;s our application context.</td> </tr> <tr> <td>message</td> <td>It&rsquo;s our custom message which we want to show in Toast notification.</td> </tr> <tr> <td>duration</td> <td>It is used to define the duration for notification to display on the screen.</td> </tr> </tbody> </table> <p>We have two ways to define the Toast duration, either in <strong>LENGTH_SHORT</strong> or <strong>LENGTH_LONG</strong> to display the toast notification for short or longer period of time.</p> <p>We can set the margin of the Toast by using the&nbsp;<strong>setMargin (float horizontalMargin, float verticalMargin) </strong>method. The following code is below:</p> <pre class=\"prettyprint\">Toast toast=Toast.makeText(getApplicationContext(),\"You Clicked on Button!\",Toast.LENGTH_SHORT);  \n" +
                            "toast.setMargin(50,50);  \n" +
                            "toast.show();</pre> <p>In case if we want to change the position of Toast notification, we can do it by using the&nbsp;<strong>setGravity(int, int, int)</strong>&nbsp;method. The&nbsp;<strong>setGravity()</strong>method will accept three parameters: a&nbsp;<strong>Gravity</strong>&nbsp;constant, an&nbsp;<strong>x-position</strong>&nbsp;offset, and a&nbsp;<strong>y-position</strong>&nbsp;offset.&nbsp;</p> <p>Following is the example of changing the position of android Toast notification to top-right based on offset positions by using the&nbsp;<strong>setGravity()</strong>&nbsp;method.</p> <pre class=\"prettyprint\">t.makeText(MainActivity.this, \"You Clicked on Button..\", Toast.LENGTH_SHORT); toast.setGravity(Gravity.TOP|Gravity.RIGHT, 100, 250); toast.show();</pre>",
                    "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                            "&lt;LinearLayout\n" +
                            "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                            "    android:layout_width=&quot;match_parent&quot;\n" +
                            "    android:layout_height=&quot;match_parent&quot;\n" +
                            "    android:orientation=&quot;vertical&quot; &gt;\n" +
                            "    &lt;Button\n" +
                            "        android:id=&quot;@+id/btnShow&quot;\n" +
                            "        android:layout_width=&quot;wrap_content&quot;\n" +
                            "        android:layout_height=&quot;wrap_content&quot;\n" +
                            "        android:text=&quot;Show Toast&quot;\n" +
                            "        android:layout_marginTop=&quot;200dp&quot;\n" +
                            "        android:layout_marginLeft=&quot;140dp&quot;/&gt;\n" +
                            "&lt;/LinearLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.toastexample;\n" +
                            "import android.support.v7.app.AppCompatActivity;\n" +
                            "import android.os.Bundle;\n" +
                            "import android.view.View;\n" +
                            "import android.widget.Button;\n" +
                            "import android.widget.Toast;\n" +
                            "\n" +
                            "public class MainActivity extends AppCompatActivity {\n" +
                            "    @Override\n" +
                            "    protected void onCreate(Bundle savedInstanceState) {\n" +
                            "        super.onCreate(savedInstanceState);\n" +
                            "        setContentView(R.layout.activity_main);\n" +
                            "        Button btn = (Button)findViewById(R.id.btnShow);\n" +
                            "        btn.setOnClickListener(new View.OnClickListener() {\n" +
                            "            @Override\n" +
                            "            public void onClick(View v) {\n" +
                            "                Toast.makeText(MainActivity.this, \"You Clicked on Button..\", Toast.LENGTH_SHORT).show();\n" +
                            "            }\n" +
                            "        });\n" +
                            "    }\n" +
                            "}</pre>",
                    "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=toast_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=toast_img2.png height=500 width=300/>"));
        mTutorialData.put("Android Custom Toast",new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">Custom Toast</h1> <hr /> <p>In Android, Sometimes simple Toast may not be satisfactory, and then we can go for customizing a Toast. For creating a custom layout, define a View layout, in XML and pass the root View object to the setView(View) method.</p> <p><strong>Steps for Implementation of Custom Toast In Android:</strong></p> <p><strong>1)</strong>&nbsp;Firstly Retrieve the&nbsp;Layout Inflater &nbsp;with &nbsp;getLayoutInflater() (or&nbsp;getSystemService()) and then inflate the layout from XML using&nbsp;inflate(int, ViewGroup). In inflate method first parameter is the layout resource ID and the second is the root View.</p> <p><strong>2)</strong>&nbsp;Create a new Toast with&nbsp;Toast(Context)&nbsp;and set some properties of the Toast, such as the duration and gravity.</p> <p><strong>3)</strong>&nbsp;Call&nbsp;setView(View)&nbsp;and pass the inflated layout in this method.</p> <p><strong>4)</strong>&nbsp;Display the Toast on the screen using the show() method of Toast.</p>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><p>In this example, we display one&nbsp;Button&nbsp;for Custom Toast and perform click event on them. Whenever a user clicks on a custom toast Button a Toast with an image displayed on the screen.</p> <h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;LinearLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;\n" +
                        "    android:orientation=&quot;vertical&quot;&gt;\n" +
                        "    &lt;Button\n" +
                        "        android:id=&quot;@+id/btnShow&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:text=&quot;Show Custom Toast&quot;\n" +
                        "        android:layout_marginTop=&quot;150dp&quot;\n" +
                        "        android:layout_marginLeft=&quot;110dp&quot;/&gt;\n" +
                        "&lt;/LinearLayout&gt;</pre> <h2><em>custom_toast.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;LinearLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    android:id=&quot;@+id/custom_toast_layout&quot;\n" +
                        "    android:orientation=&quot;horizontal&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;\n" +
                        "    android:paddingLeft=&quot;10dp&quot;\n" +
                        "    android:paddingRight=&quot;10dp&quot;\n" +
                        "    android:background=&quot;#80CC28&quot;&gt;\n" +
                        "    &lt;ImageView android:src=&quot;@drawable/img8&quot;\n" +
                        "        android:layout_width=&quot;100dp&quot;\n" +
                        "        android:layout_height=&quot;100dp&quot;\n" +
                        "        android:layout_marginRight=&quot;10dp&quot; /&gt;\n" +
                        "    &lt;TextView android:id=&quot;@+id/txtvw&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_marginTop=&quot;13dp&quot;\n" +
                        "        android:textColor=&quot;#FFF&quot;\n" +
                        "        android:textStyle=&quot;bold&quot;\n" +
                        "        android:textSize=&quot;15dp&quot; /&gt;\n" +
                        "&lt;/LinearLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.customtoastexample;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.Gravity;\n" +
                        "import android.view.LayoutInflater;\n" +
                        "import android.view.View;\n" +
                        "import android.view.ViewGroup;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.TextView;\n" +
                        "import android.widget.Toast;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        // get the reference of Button\n" +
                        "        Button btn = (Button)findViewById(R.id.btnShow);\n" +
                        "        // perform setOnClickListener event on custom Toast Button\n" +
                        "        btn.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                // Retrieve the Layout Inflater and inflate the layout from xml\n" +
                        "                LayoutInflater inflater = getLayoutInflater();\n" +
                        "                View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));\n" +
                        "                // get the reference of TextView and ImageVIew from inflated layout\n" +
                        "                TextView tv = (TextView) layout.findViewById(R.id.txtvw);\n" +
                        "                // set the text in the TextView\n" +
                        "                tv.setText(\"Custom Toast Notification\");\n" +
                        "                //Creating the Toast object\n" +
                        "                Toast toast = new Toast(getApplicationContext());\n" +
                        "                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);\n" +
                        "                toast.setDuration(Toast.LENGTH_LONG);\n" +
                        "                //set the view of custom toast layout\n" +
                        "                toast.setView(layout);\n" +
                        "                toast.show();\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}</pre>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=custom_toast_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=custom_toast_img2.png height=500 width=300/>"));
        mTutorialData.put("Android Notifications",new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">Notifications</h1> <hr /> <p>In Android,&nbsp;<strong>Notifications</strong> provides short, timely information about the action happened in the application, even it is not running. The notification displays the icon, title and some amount of the content text.</p> <p>The android Notifications will be displayed outside of our app&rsquo;s normal UI and alert the users without interrupting their current activities.</p> <p><strong>Set Android Notification Properties:</strong></p> <p>The properties of Android notification are set using <strong>NotificationCompat.Builder</strong> object. Some of the notification properties are mention below:</p> <ul class=\"points\"> <li><strong>setSmallIcon()</strong>: It sets the icon of notification.</li> <li><strong>setContentTitle()</strong>: It is used to set the title of notification.</li> <li><strong>setContentText()</strong>: It is used to set the text message.</li> <li><strong>setAutoCancel()</strong>: It sets the cancelable property of notification.</li> <li><strong>setPriority()</strong>: It sets the priority of notification.&nbsp;</li> </ul> <p><strong>Create a Notification in Android:</strong></p> <pre class=\"prettyprint\">NotificationCompat.Builder nBuilder =  new NotificationCompat.Builder(this)\n" +
                        "                .setSmallIcon(R.drawable.notification_icon)\n" +
                        "                .setContentTitle(\"Sample notification\")\n" +
                        "                .setContentText(\"Hello World!\");</pre> <p><strong>Define the Android Notification Actions:</strong></p> <p>If we assign an action to the notification, it will allow users to go directly from the notification to an Activity&nbsp;of our app. We can also add buttons to the notification to perform additional actions such as hang up the call or responding immediately to a text message; this feature is available as of Android 4.1.&nbsp;</p> <p>In android, we can define an action inside of notification by using&nbsp; <strong>PendingIntent</strong>&nbsp;object which contains an Intent&nbsp;that starts an&nbsp;Activity&nbsp;of our app.</p> <pre class=\"prettyprint\">NotificationCompat.Builder nBuilder =  new NotificationCompat.Builder(this)\n" +
                        "…...\n" +
                        "Intent resultIntent = new Intent(this, MainActivity.class);\n" +
                        "PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, resultIntent, 0);\n" +
                        "nBuilder.setContentIntent(pendingIntent);</pre> <p><strong>Issue the Android Notification:</strong></p> <p>Once we are done with the creation of notification, we need to pass a notification to the system by using&nbsp;<strong>NotificationManager.notify()</strong>method and we need to specify an&nbsp;<strong>ID</strong>&nbsp;in the notification to use this&nbsp;<strong>ID</strong>&nbsp;to update a notification later if required.</p> <pre class=\"prettyprint\">NotificationCompat.Builder nBuilder =  new NotificationCompat.Builder(this);\n" +
                        "....\n" +
                        "int mNotificationId = 999;\n" +
                        "NotificationManager mNotifyMgr = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);\n" +
                        "// Builds the notification and issues it.\n" +
                        "mNotifyMgr.notify(mNotificationId, nBuilder.build());</pre>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><p><strong>1) Android Simple Notifications Example:</strong></p> <h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;LinearLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;\n" +
                        "    android:orientation=&quot;vertical&quot;&gt;\n" +
                        "    &lt;Button\n" +
                        "        android:id=&quot;@+id/btnShow&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:text=&quot;Show Notification&quot;\n" +
                        "        android:layout_marginTop=&quot;200dp&quot;\n" +
                        "        android:layout_marginLeft=&quot;100dp&quot;/&gt;\n" +
                        "&lt;/LinearLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.notificationexample;\n" +
                        "import android.app.NotificationChannel;\n" +
                        "import android.app.NotificationManager;\n" +
                        "import android.app.PendingIntent;\n" +
                        "import android.content.Intent;\n" +
                        "import android.support.v4.app.NotificationCompat;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        Button btnNotify = (Button) findViewById(R.id.btnShow);\n" +
                        "        btnNotify.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                // Sets an ID for the notification\n" +
                        "                int mNotificationId = 001;\n" +
                        "\n" +
                        "                NotificationManager notificationManager = (NotificationManager) getBaseContext().getSystemService(NOTIFICATION_SERVICE);\n" +
                        "\n" +
                        "                String CHANNEL_ID = \"my_channel_01\";\n" +
                        "\n" +
                        "                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {\n" +
                        "                    CharSequence name = \"my_channel\";\n" +
                        "                    String Description = \"This is my channel\";\n" +
                        "                    NotificationChannel mChannel = new NotificationChannel(CHANNEL_ID, name, NotificationManager.IMPORTANCE_DEFAULT);\n" +
                        "                    notificationManager.createNotificationChannel(mChannel);\n" +
                        "                }\n" +
                        "                \n" +
                        "                NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(getApplicationContext(), CHANNEL_ID)\n" +
                        "                        .setSmallIcon(R.drawable.ic_notification)\n" +
                        "                        .setContentTitle(\"Notifications Example\")\n" +
                        "                        .setContentText(\"Hi, This is a notification message\");                \n" +
                        "                // Set the intent to fire when the user taps on notification.\n" +
                        "                Intent resultIntent = new Intent(MainActivity.this, MainActivity.class);\n" +
                        "                PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this, 0, resultIntent, 0);\n" +
                        "                mBuilder.setContentIntent(pendingIntent);\n" +
                        "                // It will display the notification in notification bar\n" +
                        "                notificationManager.notify(mNotificationId, mBuilder.build());\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}</pre> <p><strong>2) Android Big Text Style Notification Example:</strong></p> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.bigtextnotificationexample;\n" +
                        "import android.app.NotificationChannel;\n" +
                        "import android.app.NotificationManager;\n" +
                        "import android.app.PendingIntent;\n" +
                        "import android.content.Intent;\n" +
                        "import android.graphics.Bitmap;\n" +
                        "import android.graphics.BitmapFactory;\n" +
                        "import android.support.v4.app.NotificationCompat;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        Button btnNotify = (Button) findViewById(R.id.btnShow);\n" +
                        "        btnNotify.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                // Sets an ID for the notification\n" +
                        "                int mNotificationId = 001;\n" +
                        "                NotificationManager notificationManager = (NotificationManager) getBaseContext().getSystemService(NOTIFICATION_SERVICE);\n" +
                        "\n" +
                        "                String CHANNEL_ID = \"my_channel_01\";\n" +
                        "\n" +
                        "                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {\n" +
                        "                    CharSequence name = \"my_channel\";\n" +
                        "                    String Description = \"This is my channel\";\n" +
                        "                    NotificationChannel mChannel = new NotificationChannel(CHANNEL_ID, name, NotificationManager.IMPORTANCE_DEFAULT);\n" +
                        "                    notificationManager.createNotificationChannel(mChannel);\n" +
                        "                }\n" +
                        "\n" +
                        "                //To set large icon in notification\n" +
                        "                Bitmap licon = BitmapFactory.decodeResource(getResources(), R.drawable.img1);\n" +
                        "\n" +
                        "                //Assign BigText style notification\n" +
                        "                NotificationCompat.BigTextStyle bigText = new NotificationCompat.BigTextStyle();\n" +
                        "                bigText.bigText(\"Welocme to Android Development Tutorial, It provides a tutorials related to Android. Here we covered complete tutorials from basic to adavanced topics from Android\");\n" +
                        "                bigText.setSummaryText(\"Android Development\");\n" +
                        "\n" +
                        "                NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(getApplicationContext(), CHANNEL_ID)\n" +
                        "                        .setSmallIcon(R.drawable.ic_notification)\n" +
                        "                        .setContentTitle(\"Big Text Notification Example\")\n" +
                        "                        .setLargeIcon(licon)\n" +
                        "                        .setStyle(bigText);\n" +
                        "                // Set the intent to fire when the user taps on notification.\n" +
                        "                Intent resultIntent = new Intent(MainActivity.this, MainActivity.class);\n" +
                        "                PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this, 0, resultIntent, 0);\n" +
                        "                mBuilder.setContentIntent(pendingIntent);\n" +
                        "                // It will display the notification in notification bar\n" +
                        "                notificationManager.notify(mNotificationId, mBuilder.build());\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}</pre> <p><strong>3) Android Inbox Style Notification Example:</strong></p> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.inboxnotificationexample;\n" +
                        "import android.app.NotificationChannel;\n" +
                        "import android.app.NotificationManager;\n" +
                        "import android.app.PendingIntent;\n" +
                        "import android.content.Intent;\n" +
                        "import android.support.v4.app.NotificationCompat;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        Button btnNotify = (Button) findViewById(R.id.btnShow);\n" +
                        "        btnNotify.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                // Sets an ID for the notification\n" +
                        "                int mNotificationId = 001;\n" +
                        "                NotificationManager notificationManager = (NotificationManager) getBaseContext().getSystemService(NOTIFICATION_SERVICE);\n" +
                        "\n" +
                        "                String CHANNEL_ID = \"my_channel_01\";\n" +
                        "\n" +
                        "                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {\n" +
                        "                    CharSequence name = \"my_channel\";\n" +
                        "                    String Description = \"This is my channel\";\n" +
                        "                    NotificationChannel mChannel = new NotificationChannel(CHANNEL_ID, name, NotificationManager.IMPORTANCE_DEFAULT);\n" +
                        "                    notificationManager.createNotificationChannel(mChannel);\n" +
                        "                }\n" +
                        "\n" +
                        "                //Implement inbox style notification\n" +
                        "                NotificationCompat.InboxStyle iStyle =  new NotificationCompat.InboxStyle();\n" +
                        "                iStyle.addLine(\"Message 1.\");\n" +
                        "                iStyle.addLine(\"Message 2.\");\n" +
                        "                iStyle.addLine(\"Message 3.\");\n" +
                        "                iStyle.addLine(\"Message 4.\");\n" +
                        "                iStyle.addLine(\"Message 5.\");\n" +
                        "                iStyle.setSummaryText(\"+2 more\");\n" +
                        "\n" +
                        "                NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(getApplicationContext(), CHANNEL_ID)\n" +
                        "                        .setSmallIcon(R.drawable.ic_notification)\n" +
                        "                        .setContentTitle(\"Inbox Style Notification Example\")\n" +
                        "                        .setStyle(iStyle);\n" +
                        "                // Set the intent to fire when the user taps on notification.\n" +
                        "                Intent resultIntent = new Intent(MainActivity.this, MainActivity.class);\n" +
                        "                PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this, 0, resultIntent, 0);\n" +
                        "                mBuilder.setContentIntent(pendingIntent);\n" +
                        "                // It will display the notification in notification bar\n" +
                        "                notificationManager.notify(mNotificationId, mBuilder.build());\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}</pre> <p><strong>4)Android Big Picture Notification Example:</strong></p> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.bigpicturenotificationexample;\n" +
                        "import android.app.NotificationChannel;\n" +
                        "import android.app.NotificationManager;\n" +
                        "import android.app.PendingIntent;\n" +
                        "import android.content.Intent;\n" +
                        "import android.graphics.BitmapFactory;\n" +
                        "import android.net.Uri;\n" +
                        "import android.support.v4.app.NotificationCompat;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        Button btnNotify = (Button) findViewById(R.id.btnShow);\n" +
                        "        btnNotify.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                // Sets an ID for the notification\n" +
                        "                int mNotificationId = 001;\n" +
                        "                NotificationManager notificationManager = (NotificationManager) getBaseContext().getSystemService(NOTIFICATION_SERVICE);\n" +
                        "\n" +
                        "                String CHANNEL_ID = \"my_channel_01\";\n" +
                        "\n" +
                        "                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {\n" +
                        "                    CharSequence name = \"my_channel\";\n" +
                        "                    String Description = \"This is my channel\";\n" +
                        "                    NotificationChannel mChannel = new NotificationChannel(CHANNEL_ID, name, NotificationManager.IMPORTANCE_DEFAULT);\n" +
                        "                    notificationManager.createNotificationChannel(mChannel);\n" +
                        "                }\n" +
                        "\n" +
                        "                // Assign big picture notification\n" +
                        "                NotificationCompat.BigPictureStyle bpStyle = new NotificationCompat.BigPictureStyle();\n" +
                        "                bpStyle.bigPicture(BitmapFactory.decodeResource(getResources(), R.drawable.img1)).build();\n" +
                        "\n" +
                        "                // Set the intent to fire when the user taps on notification.\n" +
                        "                Intent rIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(\"http://google.com/\"));\n" +
                        "                PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this, 0, rIntent, 0);\n" +
                        "\n" +
                        "                NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(getApplicationContext(), CHANNEL_ID)\n" +
                        "                        .setSmallIcon(R.drawable.ic_notification)\n" +
                        "                        .setContentTitle(\"Big Picture Notification Example\")\n" +
                        "                        .addAction(R.drawable.ic_share, \"Share\", pendingIntent)\n" +
                        "                        .setStyle(bpStyle);\n" +
                        "\n" +
                        "                mBuilder.setContentIntent(pendingIntent);\n" +
                        "                // It will display the notification in notification bar\n" +
                        "                notificationManager.notify(mNotificationId, mBuilder.build());\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}</pre>",
                "<p><strong>1) Simple Android Notification Output:</strong></p> <img style=\"display: block; margin-left: auto; margin-right: auto;\" src=notification_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=notification_img2.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=notification_img3.png height=500 width=300/> <p><strong>2) Android Big Text Style Notification Output:</strong></p> <img style=\"display: block; margin-left: auto; margin-right: auto;\" src=bigtext_notification_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=bigtext_notification_img2.png height=500 width=300/> <p><strong>3) Android Inbox Style Notification Output:</strong></p> <img style=\"display: block; margin-left: auto; margin-right: auto;\" src=inbox_notification_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=inbox_notification_img2.png height=500 width=300/> <p><strong>4) Android Big Picture Notification Output:</strong></p> <img style=\"display: block; margin-left: auto; margin-right: auto;\" src=bigpicture_notification_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=bigpicture_notification_img2.png height=500 width=300/>"));
        mTutorialData.put("Android Progress Notification",new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">Progress Notification</h1> <hr /> <p>In Android,&nbsp;<strong>Progress Notification</strong>&nbsp;is used to show the progress of an ongoing operation in the notification bar. By using progress notification, we can easily know how much percentage of the current operation completed and how long the operation will run to complete the remaining operation.&nbsp;</p> <p>In android, two types of progress indicators available, one is&nbsp;<strong>determinate</strong>&nbsp;and another one is&nbsp;<strong>indeterminate</strong>. If we are known about how long the operation will take to complete, then we can use a&nbsp;<strong>determinate</strong>&nbsp;form of the indicator. In case if we are not aware of how long the operation will run then we can use an&nbsp;<strong>indeterminate</strong>&nbsp;form of indicator.</p>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;LinearLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;\n" +
                        "    android:orientation=&quot;vertical&quot;&gt;\n" +
                        "    &lt;Button\n" +
                        "        android:id=&quot;@+id/btnShow&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:text=&quot;Show Notification&quot;\n" +
                        "        android:layout_marginTop=&quot;200dp&quot;\n" +
                        "        android:layout_marginLeft=&quot;100dp&quot;/&gt;\n" +
                        "&lt;/LinearLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.progressnotificationexample;\n" +
                        "import android.app.NotificationChannel;\n" +
                        "import android.app.NotificationManager;\n" +
                        "import android.content.Context;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v4.app.NotificationCompat;\n" +
                        "import android.util.Log;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    private NotificationManager mNotifyManager;\n" +
                        "    private NotificationCompat.Builder mBuilder;\n" +
                        "    int mNotificationId = 1;\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        Button b1 = (Button) findViewById(R.id.btnShow);\n" +
                        "        b1.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                mNotifyManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);\n" +
                        "                String CHANNEL_ID = \"my_channel_01\";\n" +
                        "\n" +
                        "                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {\n" +
                        "                    CharSequence name = \"my_channel\";\n" +
                        "                    String Description = \"This is my channel\";\n" +
                        "                    NotificationChannel mChannel = new NotificationChannel(CHANNEL_ID, name, NotificationManager.IMPORTANCE_DEFAULT);\n" +
                        "                    mNotifyManager.createNotificationChannel(mChannel);\n" +
                        "                }\n" +
                        "                mBuilder = new NotificationCompat.Builder(MainActivity.this,CHANNEL_ID);\n" +
                        "                mBuilder.setContentTitle(\"File Download\")\n" +
                        "                        .setContentText(\"Download in progress\")\n" +
                        "                        .setSmallIcon(R.drawable.ic_file_download);\n" +
                        "                // Start a the operation in a background thread\n" +
                        "                new Thread(\n" +
                        "                        new Runnable() {\n" +
                        "                            @Override\n" +
                        "                            public void run() {\n" +
                        "                                int incr;\n" +
                        "                                // Do the \"lengthy\" operation 20 times\n" +
                        "                                for (incr = 0; incr <= 100; incr+=5) {\n" +
                        "                                    // Sets the progress indicator to a max value, the current completion percentage and \"determinate\" state\n" +
                        "                                    mBuilder.setProgress(100, incr, false);\n" +
                        "                                    // Displays the progress bar for the first time.\n" +
                        "                                    mNotifyManager.notify(mNotificationId, mBuilder.build());\n" +
                        "                                    // Sleeps the thread, simulating an operation\n" +
                        "                                    try {\n" +
                        "                                        // Sleep for 1 second\n" +
                        "                                        Thread.sleep(1*1000);\n" +
                        "                                    } catch (InterruptedException e) {\n" +
                        "                                        Log.d(\"TAG\", \"sleep failure\");\n" +
                        "                                    }\n" +
                        "                                }\n" +
                        "                                // When the loop is finished, updates the notification\n" +
                        "                                mBuilder.setContentText(\"Download completed\")\n" +
                        "                                        // Removes the progress bar\n" +
                        "                                        .setProgress(0,0,false);\n" +
                        "                                mNotifyManager.notify(mNotificationId, mBuilder.build());\n" +
                        "                            }\n" +
                        "                        }\n" +
                        "                        // Starts the thread by calling the run() method in its Runnable\n" +
                        "                ).start();\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}</pre>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=progress_notification_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=progress_notification_img2.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=progress_notification_img3.png height=500 width=300/>"));
//        mTutorialData.put("",new TabDetailsPojoClass(
//                "",
//                "",
//                ""));
        //<img style="display: block; margin-left: auto; margin-right: auto;" src=edittext_img1.png height=500 width=300/><br/>
        //<link rel=stylesheet href="sunburst"/><script src=SourceCodeJS></script>
            mTutorialData.put("Android Button",new TabDetailsPojoClass("<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">Button</h1> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; ↳ android.view.View<br />&nbsp; &nbsp; &nbsp; ↳ android.widget.TextView<br />&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ↳android.widget.Button</pre> <p>In Android,&nbsp;<strong>Button</strong>&nbsp;represents a Push-button. Push buttons can be clicked, or pressed by the user to perform an action. There are different types of buttons used in Android such as CompoundButton,&nbsp;ToggleButton,&nbsp;RadioButton.</p> <p>On a button, we can perform different actions or events like click event, pressed event, touch event etc.</p> <p>In Android, we can create a Button control in two ways either in XML layout file or create it in Activity&nbsp;file programmatically.</p> <h2>Create Button in XML Layout File</h2> <p>Following is the simple way to define&nbsp;<strong>Button</strong>&nbsp;control in XML layout file in the android application.</p> <pre class=\"prettyprint\">&lt;LinearLayout \n" +
                    "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                    "    android:orientation=&quot;vertical&quot; android:layout_width=&quot;match_parent&quot;\n" +
                    "    android:layout_height=&quot;match_parent&quot;&gt;\n" +
                    "    &lt;Button\n" +
                    "        android:id=&quot;@+id/addBtn&quot;\n" +
                    "        android:layout_width=&quot;wrap_content&quot;\n" +
                    "        android:layout_height=&quot;wrap_content&quot;\n" +
                    "        android:text=&quot;Add&quot; /&gt;\n" +
                    "&lt;/LinearLayout&gt;</pre> <h2>Create Button Control in Activity File</h2> <p>Following is the example of creating&nbsp;<strong>Button</strong>&nbsp;control dynamically in an activity file.</p> <pre class=\"prettyprint\">LinearLayout layout = (LinearLayout)findViewById(R.id.l_layout);<br /> Button btn = new Button(this);<br /> btn.setText(\"Test\");<br /> layout.addView(btn);</pre> <h2 id=\"divanbk\">Android Handle Button Click Events</h2> <p>Generally, whenever the user clicks on a&nbsp;<strong>Button</strong>, the&nbsp;<strong>Button</strong>&nbsp;object will receive an on-click event.</p> <p>In Android, we can define button click event in two ways either in XML layout file or create it in Activity file programmatically.</p> <h2>Define Button Click Event in XML Layout File</h2> <p>We can define a click event handler for button by adding <strong>android:onClick</strong> attribute&nbsp;to the&nbsp;<strong>&lt;Button&gt;</strong>&nbsp;element in our XML layout file.&nbsp;</p> <p>The value of&nbsp;<strong>android:onClick</strong>&nbsp;attribute must be the name of the method which we need to call in response to a click event and the Activity file which hosting XML layout must implement the corresponding method.</p> <p>Following is the example of defining a button click event using&nbsp;<strong>android:onClick</strong>&nbsp;attribute in the XML layout file.</p> <pre class=\"prettyprint\">&lt;Button<br /> android:id=\"@+id/addBtn\"<br /> android:layout_width=\"wrap_content\"<br /> android:layout_height=\"wrap_content\"<br /> android:text=\"Add\"<br /> android:onClick=\"addOperation\"/&gt;</pre> <p>In Activity that hosts our XML layout file, we need to implement click event method like as shown below</p> <pre class=\"prettyprint\">/** Called when the user touches the button */<br /> public void addOperation(View view) {<br /> // Do something in response to a button click<br /> }</pre> <h2>Define Button Click Event in Activity File</h2> <p>To define button click programmatically, create&nbsp;<strong>View.OnClickListener</strong>&nbsp;object and assign it to the button by calling&nbsp;<strong>setOnClickListener(View.OnClickListener)</strong>&nbsp;like as shown below.</p> <pre class=\"prettyprint\">Button btnAdd = (Button)findViewById(R.id.addBtn);<br /> btnAdd.setOnClickListener(new View.OnClickListener() {<br /> public void onClick(View v) {<br /> <br /> // Do something in response to button click<br /> }<br /> });<br /> }Button btnAdd = (Button)findViewById(R.id.addBtn);<br /> btnAdd.setOnClickListener(new View.OnClickListener() {<br /> public void onClick(View v) {<br /> <br /> // Do something in response to button click<br /> }<br /> });<br /> }</pre> <h2><span style=\"text-decoration: underline;\">Button Attributes</span></h2> <p>Following are the important attributes related to the Button control.&nbsp;Inherited from&nbsp;<strong>android.widget.TextView</strong>&nbsp;Class.</p> <table border=\"1\"> <thead> <tr> <th>Attribute</th> <th>Description</th> </tr> </thead> <tbody> <tr> <td>android:id</td> <td>It is used to uniquely identify the control</td> </tr> <tr> <td>android:gravity</td> <td>It is used to specify how to align the text like left, right, center, top, etc.</td> </tr> <tr> <td>android:text</td> <td>It is used to set the text.</td> </tr> <tr> <td>android:textColor</td> <td>It is used to change the color of text.</td> </tr> <tr> <td>android:textSize</td> <td>It is used to specify the size of text.</td> </tr> <tr> <td>android:textStyle</td> <td>It is used to change the style (bold, italic, bolditalic) of text.</td> </tr> <tr> <td>android:background</td> <td>It is used to set the background color for button control.</td> </tr> <tr> <td>android:padding</td> <td>It is used to set the padding from left, right, top and bottom.</td> </tr> <tr> <td>android:drawableBottom</td> <td>It&rsquo;s a drawable to be drawn to the below of text.</td> </tr> <tr> <td>android:drawableRight</td> <td>It&rsquo;s a drawable to be drawn to the right of text.</td> </tr> <tr> <td>android:drawableLeft</td> <td>It&rsquo;s a drawable to be drawn to the left of text.</td> </tr> </tbody> </table>",
                                                                       "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><p>Here, we are going to create one text fields and one button for the display text. If the user clicks a button, the input value is displayed on the Toast.</p> <h2><em>activity_main.xml</em></h2> <pre class=prettyprint>&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                                                                               "&lt;RelativeLayout\n" +
                                                                               "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                                                                               "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                                                                               "    android:layout_width=&quot;match_parent&quot;\n" +
                                                                               "    android:layout_height=&quot;match_parent&quot;\n" +
                                                                               "    tools:context=&quot;com.hd.buttonexample.MainActivity&quot;&gt;\n" +
                                                                               "\n" +
                                                                               "    &lt;EditText\n" +
                                                                               "        android:id=&quot;@+id/editText1&quot;\n" +
                                                                               "        android:layout_width=&quot;wrap_content&quot;\n" +
                                                                               "        android:layout_height=&quot;wrap_content&quot;\n" +
                                                                               "        android:layout_alignParentTop=&quot;true&quot;\n" +
                                                                               "        android:layout_centerHorizontal=&quot;true&quot;\n" +
                                                                               "        android:layout_marginTop=&quot;100dp&quot;\n" +
                                                                               "        android:inputType=&quot;textNoSuggestions&quot;\n" +
                                                                               "        android:ems=&quot;10&quot;\n" +
                                                                               "        /&gt;\n" +
                                                                               "    &lt;Button\n" +
                                                                               "        android:id=&quot;@+id/button&quot;\n" +
                                                                               "        android:layout_width=&quot;wrap_content&quot;\n" +
                                                                               "        android:layout_height=&quot;wrap_content&quot;\n" +
                                                                               "        android:layout_below=&quot;@+id/editText1&quot;\n" +
                                                                               "        android:layout_centerHorizontal=&quot;true&quot;\n" +
                                                                               "        android:layout_marginTop=&quot;30dp&quot;\n" +
                                                                               "        android:text=&quot;Click me&quot;/&gt;\n" +
                                                                               "&lt;/RelativeLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.buttonexample;\n" +
                                                                               "\n" +
                                                                               "import android.support.v7.app.AppCompatActivity;\n" +
                                                                               "import android.os.Bundle;\n" +
                                                                               "import android.view.View;\n" +
                                                                               "import android.widget.Button;\n" +
                                                                               "import android.widget.EditText;\n" +
                                                                               "import android.widget.Toast;\n" +
                                                                               "\n" +
                                                                               "public class MainActivity extends AppCompatActivity {\n" +
                                                                               "    private EditText editText1;\n" +
                                                                               "    private Button buttonClick;\n" +
                                                                               "    @Override\n" +
                                                                               "    protected void onCreate(Bundle savedInstanceState) {\n" +
                                                                               "        super.onCreate(savedInstanceState);\n" +
                                                                               "        setContentView(R.layout.activity_main);\n" +
                                                                               "\n" +
                                                                               "        editText1 = (EditText) findViewById(R.id.editText1);\n" +
                                                                               "        buttonClick = (Button) findViewById(R.id.button);\n" +
                                                                               "\n" +
                                                                               "        buttonClick.setOnClickListener(new View.OnClickListener() {\n" +
                                                                               "            @Override\n" +
                                                                               "            public void onClick(View v) {\n" +
                                                                               "                Toast.makeText(getApplicationContext(), editText1.getText(), Toast.LENGTH_LONG).show();\n" +
                                                                               "            }\n" +
                                                                               "        });\n" +
                                                                               "    }\n" +
                                                                               "}</pre>",
                                                                       "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=buttonclick_img.png height=500 width=300/>"));
                    mTutorialData.put("Android TextView",new TabDetailsPojoClass("<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">TextView</h1> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; ↳ android.view.View<br />&nbsp;&nbsp;&nbsp;&nbsp; ↳ android.widget.TextView</pre> <p>In Android, TextView is a user interface control which is used to set and display the text to the user based on our requirements. The TextView control will act as like label control and it won&rsquo;t allow users to edit the text.</p> <p>We can create a TextView&nbsp;instance by declaring it inside a layout(XML&nbsp;file) or by instantiating it programmatically(JAVA&nbsp;Class).</p> <p><strong>TextView code in XML:</strong></p> <pre class=\"prettyprint\">&lt;TextView android:id=&quot;@+id/simpleTextView&quot;&lt;br /&gt;\n" +
                            "android:layout_width=&quot;wrap_content&quot;&lt;br /&gt;\n" +
                            "android:layout_height=&quot;wrap_content&quot;&lt;br /&gt;\n" +
                            "android:text=&quot;Android TextView&quot; /&gt;</pre> <p><strong>TextView code in JAVA:</strong></p> <pre class=\"prettyprint\">TextView textView = (TextView) findViewById(R.id.textView);\n" +
                            "textView.setText(\"Android TextView\"); //set text for text view</pre> <h2><span style=\"text-decoration: underline;\">TextView Attributes</span></h2> <table border=1> <thead> <tr> <th>Attribute</th> <th>Description</th> </tr> </thead> <tbody> <tr> <td>android: id</td> <td>It is used to uniquely identify the control</td> </tr> <tr> <td>android:autoLink</td> <td>It will automatically found and convert urls and email addresses as a clickable links.</td> </tr> <tr> <td>android: ems</td> <td>It is used to make the textview be exactly this many ems wide.</td> </tr> <tr> <td>android:hint</td> <td>It is used to display the hint text when text is empty</td> </tr> <tr> <td>android:width</td> <td>It makes the TextView be exactly this many pixels wide.</td> </tr> <tr> <td>android:height</td> <td>It makes the TextView be exactly this many pixels tall.</td> </tr> <tr> <td>android:text</td> <td>It is used to display the text.</td> </tr> <tr> <td>android:textColor</td> <td>It is used to change the color of text.</td> </tr> <tr> <td>android:gravity</td> <td>It is used to specify how to align the text by the view's x and y axis.</td> </tr> <tr> <td>android:maxWidth</td> <td>It is used to make the TextView be at most this many pixels wide.</td> </tr> <tr> <td>android:minWidth</td> <td>It is used to make the TextView be at least this many pixels wide.</td> </tr> <tr> <td>android:textSize</td> <td>It is used to specify the size of text.</td> </tr> <tr> <td>android:textStyle</td> <td>It is used to change the style (bold, italic, bolditalic) of text.</td> </tr> <tr> <td>android:textAllCaps</td> <td>It is used to present the text in all CAPS</td> </tr> <tr> <td>android:typeface</td> <td>It is used to specify the Typeface (normal, sans, serif, monospace) for the text.</td> </tr> <tr> <td>android:textColor</td> <td>It is used to change the color of text.</td> </tr> <tr> <td>android:textColorHighlight</td> <td>It is used to change the color of text selection highlight.</td> </tr> <tr> <td>android:textColorLink</td> <td>It is used to change the text color of links.</td> </tr> <tr> <td>android:inputType</td> <td>It is used to specify the type of text being placed in a text fields.</td> </tr> <tr> <td>android:fontFamily</td> <td>It is used to specify the fontFamily for the text.</td> </tr> <tr> <td>android:editable</td> <td>If we set, it specifies that this TextView has an input method.</td> </tr> </tbody> </table>",
                            "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><p>Below is the example of TextView in which we display a text view and set the text in XML file and then change the text on Button click event programmatically:</p> <h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                                    "&lt;RelativeLayout\n" +
                                    "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                                    "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                                    "    android:layout_width=&quot;match_parent&quot;\n" +
                                    "    android:layout_height=&quot;match_parent&quot;\n" +
                                    "    tools:context=&quot;.MainActivity&quot;&gt;\n" +
                                    "\n" +
                                    "    &lt;TextView\n" +
                                    "        android:id=&quot;@+id/simpleTextView&quot;\n" +
                                    "        android:layout_width=&quot;wrap_content&quot;\n" +
                                    "        android:layout_height=&quot;wrap_content&quot;\n" +
                                    "        android:layout_centerHorizontal=&quot;true&quot;\n" +
                                    "        android:text=&quot;Before Clicking&quot;\n" +
                                    "        android:textSize=&quot;25sp&quot;\n" +
                                    "        android:textStyle=&quot;bold|italic&quot;\n" +
                                    "        android:layout_marginTop=&quot;50dp&quot;/&gt;\n" +
                                    "\n" +
                                    "    &lt;Button\n" +
                                    "        android:id=&quot;@+id/btnChangeText&quot;\n" +
                                    "        android:layout_width=&quot;wrap_content&quot;\n" +
                                    "        android:layout_height=&quot;wrap_content&quot;\n" +
                                    "        android:layout_centerInParent=&quot;true&quot;\n" +
                                    "        android:padding=&quot;10dp&quot;\n" +
                                    "        android:text=&quot;Change Text&quot;\n" +
                                    "        android:textStyle=&quot;bold&quot; /&gt;\n" +
                                    "&lt;/RelativeLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.textviewexample;\n" +
                                    "\n" +
                                    "import android.support.v7.app.AppCompatActivity;\n" +
                                    "import android.os.Bundle;\n" +
                                    "import android.view.View;\n" +
                                    "import android.widget.Button;\n" +
                                    "import android.widget.TextView;\n" +
                                    "\n" +
                                    "public class MainActivity extends AppCompatActivity {\n" +
                                    "    private TextView textView;\n" +
                                    "    private Button buttonClick;\n" +
                                    "\n" +
                                    "    @Override\n" +
                                    "    protected void onCreate(Bundle savedInstanceState) {\n" +
                                    "        super.onCreate(savedInstanceState);\n" +
                                    "        setContentView(R.layout.activity_main);\n" +
                                    "\n" +
                                    "        textView = (TextView) findViewById(R.id.simpleTextView); //get the id for TextView\n" +
                                    "        buttonClick = (Button) findViewById(R.id.btnChangeText); //get the id for Button\n" +
                                    "\n" +
                                    "        buttonClick.setOnClickListener(new View.OnClickListener() {\n" +
                                    "            @Override\n" +
                                    "            public void onClick(View v) {\n" +
                                    "                textView.setText(\"After Clicking\"); //set the text after clicking button\n" +
                                    "            }\n" +
                                    "        });\n" +
                                    "    }\n" +
                                    "}</pre>",
                            "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=textview_image1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=textview_img2.png height=500 width=300/>"));
            mTutorialData.put("Android EditText",new TabDetailsPojoClass("<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">EditText</h1> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp;↳ android.view.View<br />&nbsp;&nbsp;&nbsp;&nbsp;↳android.widget.TextView<br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.EditText</pre> <p>In Android, EditText is a standard entry widget in android apps. It is an overlay over TextView that configures itself to be editable. EditText is a subclass of TextView with text editing operations. We often use EditText in our applications in order to provide an input or text field, especially in forms. The most simple example of EditText is Login or Sign-in form.</p> <p><strong>EditText code in XML:</strong></p> <pre class=prettyprint>&lt;EditText\n" +
                    "android:id=&quot;@+id/simpleEditText&quot;\n" +
                    "android:layout_height=&quot;wrap_content&quot;\n" +
                    "android:layout_width=&quot;match_parent&quot;/&gt;</pre> <p><strong>EditText code in JAVA:</strong></p> <pre class=prettyprint>EditText simpleEditText = (EditText) findViewById(R.id.simpleEditText);\n" +
                    "String editTextValue = simpleEditText.getText().toString();</pre> <h2><span style=\"text-decoration: underline;\">EditText Attributes</span></h2> <table border=\"1\"> <thead> <tr> <th>Attribute</th> <th>Description</th> </tr> </thead> <tbody> <tr> <td>android:id</td> <td>It is used to uniquely identify the control</td> </tr> <tr> <td>android:gravity</td> <td>It is used to specify how to align the text like left, right, center, top, etc.</td> </tr> <tr> <td>android:text</td> <td>It is used to set the text.</td> </tr> <tr> <td>android:hint</td> <td>It is used to display the hint text when text is empty</td> </tr> <tr> <td>android:textColor</td> <td>It is used to change the color of the text.</td> </tr> <tr> <td>android:textColorHint</td> <td>It is used to change the text color of hint text.</td> </tr> <tr> <td>android:textSize</td> <td>It is used to specify the size of the text.</td> </tr> <tr> <td>android:textStyle</td> <td>It is used to change the style (bold, italic, bolditalic) of text.</td> </tr> <tr> <td>android:background</td> <td>It is used to set the background color for edit text control</td> </tr> <tr> <td>android:ems</td> <td>It is used to make the textview be exactly this many ems wide.</td> </tr> <tr> <td>android:width</td> <td>It makes the TextView be exactly this many pixels wide.</td> </tr> <tr> <td>android:height</td> <td>It makes the TextView be exactly this many pixels tall.</td> </tr> <tr> <td>android:maxWidth</td> <td>It is used to make the TextView be at most this many pixels wide.</td> </tr> <tr> <td>android:minWidth</td> <td>It is used to make the TextView be at least this many pixels wide.</td> </tr> <tr> <td>android:textAllCaps</td> <td>It is used to present the text in all CAPS</td> </tr> <tr> <td>android:typeface</td> <td>It is used to specify the Typeface (normal, sans, serif, monospace) for the text.</td> </tr> <tr> <td>android:textColorHighlight</td> <td>It is used to change the color of text selection highlight.</td> </tr> <tr> <td>android:inputType</td> <td>It is used to specify the type of text being placed in a text field.</td> </tr> <tr> <td>android:fontFamily</td> <td>It is used to specify the font family for the text.</td> </tr> <tr> <td>android:editable</td> <td>If we set false, EditText won't allow us to enter or modify the text</td> </tr> </tbody> </table>",
                         "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><p>Below is the example of edit text in which we get the value from multiple EditTexts and on button click event the Toast will show the data defined in Edittext.</p><h2><em>activity_main.xml</em></h2> <pre class=prettyprint>&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                                 "&lt;RelativeLayout\n" +
                                 "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                                 "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                                 "    android:layout_width=&quot;match_parent&quot;\n" +
                                 "    android:layout_height=&quot;match_parent&quot;\n" +
                                 "    tools:context=&quot;.MainActivity&quot;&gt;\n" +
                                 "\n" +
                                 "    &lt;EditText\n" +
                                 "        android:id=&quot;@+id/editText1&quot;\n" +
                                 "        android:layout_width=&quot;wrap_content&quot;\n" +
                                 "        android:layout_height=&quot;wrap_content&quot;\n" +
                                 "        android:layout_alignParentLeft=&quot;true&quot;\n" +
                                 "        android:layout_alignParentStart=&quot;true&quot;\n" +
                                 "        android:layout_alignParentTop=&quot;true&quot;\n" +
                                 "        android:layout_marginLeft=&quot;50dp&quot;\n" +
                                 "        android:layout_marginStart=&quot;50dp&quot;\n" +
                                 "        android:layout_marginTop=&quot;24dp&quot;\n" +
                                 "        android:ems=&quot;10&quot;\n" +
                                 "        android:hint=&quot;First Name&quot;\n" +
                                 "        android:inputType=&quot;textPersonName&quot;\n" +
                                 "        android:selectAllOnFocus=&quot;true&quot; /&gt;\n" +
                                 "\n" +
                                 "    &lt;EditText\n" +
                                 "        android:id=&quot;@+id/editText2&quot;\n" +
                                 "        android:layout_width=&quot;wrap_content&quot;\n" +
                                 "        android:layout_height=&quot;wrap_content&quot;\n" +
                                 "        android:layout_alignLeft=&quot;@+id/editText1&quot;\n" +
                                 "        android:layout_alignStart=&quot;@+id/editText1&quot;\n" +
                                 "        android:layout_below=&quot;@+id/editText1&quot;\n" +
                                 "        android:layout_marginTop=&quot;19dp&quot;\n" +
                                 "        android:ems=&quot;10&quot;\n" +
                                 "        android:hint=&quot;Last Name&quot;\n" +
                                 "        android:inputType=&quot;textPersonName&quot; /&gt;\n" +
                                 "    &lt;Button\n" +
                                 "        android:id=&quot;@+id/button&quot;\n" +
                                 "        android:layout_width=&quot;match_parent&quot;\n" +
                                 "        android:layout_height=&quot;wrap_content&quot;\n" +
                                 "        android:layout_alignParentLeft=&quot;true&quot;\n" +
                                 "        android:layout_alignParentStart=&quot;true&quot;\n" +
                                 "        android:layout_below=&quot;@+id/editText2&quot;\n" +
                                 "        android:layout_marginTop=&quot;30dp&quot;\n" +
                                 "        android:text=&quot;Submit&quot;\n" +
                                 "        android:textSize=&quot;16sp&quot;\n" +
                                 "        android:textStyle=&quot;normal|bold&quot; /&gt;\n" +
                                 "&lt;/RelativeLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=prettyprint>package com.hd.edittextexample;\n" +
                                 "\n" +
                                 "import android.support.v7.app.AppCompatActivity;\n" +
                                 "import android.os.Bundle;\n" +
                                 "import android.view.View;\n" +
                                 "import android.widget.Button;\n" +
                                 "import android.widget.EditText;\n" +
                                 "import android.widget.Toast;\n" +
                                 "\n" +
                                 "public class MainActivity extends AppCompatActivity {\n" +
                                 "    private EditText fname, lname;\n" +
                                 "    private Button submit;\n" +
                                 "\n" +
                                 "    @Override\n" +
                                 "    protected void onCreate(Bundle savedInstanceState) {\n" +
                                 "        super.onCreate(savedInstanceState);\n" +
                                 "        setContentView(R.layout.activity_main);\n" +
                                 "\n" +
                                 "        fname = (EditText) findViewById(R.id.editText1);\n" +
                                 "        lname = (EditText) findViewById(R.id.editText2);\n" +
                                 "        submit = (Button) findViewById(R.id.button);\n" +
                                 "\n" +
                                 "        submit.setOnClickListener(new View.OnClickListener() {\n" +
                                 "            @Override\n" +
                                 "            public void onClick(View v) {\n" +
                                 "                if (fname.getText().toString().isEmpty() || lname.getText().toString().isEmpty()) {\n" +
                                 "                    Toast.makeText(getApplicationContext(), \"Enter The Data\", Toast.LENGTH_LONG).show();\n" +
                                 "                } else {\n" +
                                 "                    Toast.makeText(getApplicationContext(), \"First Name: \" + fname.getText().toString() + \"\\n Last Name: \" + lname.getText().toString(), Toast.LENGTH_LONG).show();\n" +
                                 "                }\n" +
                                 "            }\n" +
                                 "        });\n" +
                                 "    }\n" +
                                 "}</pre>",
                         "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=edittext_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=edittext_img2.png height=500 width=300 />"));
        mTutorialData.put("Android AutoCompleteTextView",new TabDetailsPojoClass(
            "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">AutoCompleteTextView</h1> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; &nbsp;↳ android.view.View<br />&nbsp; &nbsp; &nbsp;&nbsp;↳ android.widget.TextView<br />&nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.EditText<br />&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.AutoCompleteTextView</pre> <p>In Android, AutoCompleteTextView is an editable text view which is used to show the list of suggestions based on the user typing text. The list of suggestions will be shown as a dropdown menu from which the user can choose an item to replace the content of textbox.</p> <p>The&nbsp;<strong>AutoCompleteTextView</strong>&nbsp;is a subclass of EditText&nbsp;class so we can inherit all the properties of EditText&nbsp;in AutoCompleteTextView based on our requirements.</p> <p><strong>AutoCompleteTextView code in XML:</strong></p> <pre class=\"prettyprint\">&lt;AutoCompleteTextView\n" +
                    "android:id=&quot;@+id/simpleAutoCompleteTextView&quot;\n" +
                    "android:layout_width=&quot;fill_parent&quot;\n" +
                    "android:layout_height=&quot;wrap_content&quot;\n" +
                    "android:text=&quot;This is an AutoCompleteTextView&quot;/&gt;</pre> <p><strong>Create AutoCompleteTextView Control in Activity File:</strong></p> <p>Following is the example of creating AutoCompleteTextView control dynamically in activity file.</p> <pre class=\"prettyprint\">LinearLayout l_layout =  (LinearLayout) findViewById(R.id.linear_Layout);\n" +
                    "AutoCompleteTextView actv = new AutoCompleteTextView(this);\n" +
                    "\n" +
                    "l_layout.addView(actv);</pre> <p><strong>Set the Text of AutoCompleteTextView:</strong></p> <p>we can set the text of AutoCompleteTextView control by using <strong>setAdapter()</strong> method in Activity file.</p> <p>Following is example of binding data AutoCompleteTextView in activity file using <strong>setAdapter()</strong> method.</p> <pre class=\"prettyprint\">String[] Countries = { \"India\", \"USA\", \"Australia\", \"UK\", \"Italy\", \"Ireland\", \"Africa\" };\n" +
                    "\n" +
                    "ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, Countries);\n" +
                    "AutoCompleteTextView actv = AutoCompleteTextView)findViewById(R.id.autoComplete_Country);\n" +
                    "actv.setAdapter(adapter);</pre> <h2><span style=\"text-decoration: underline;\">AutoCompleteTextView Attributes</span></h2> <table border=\"1\"> <thead> <tr> <th>Attribute</th> <th>Description</th> </tr> </thead> <tbody> <tr> <td>android:id</td> <td>It is used to uniquely identify the control</td> </tr> <tr> <td>android:gravity</td> <td>It is used to specify how to align the text like left, right, center, top, etc.</td> </tr> <tr> <td>android:text</td> <td>It is used to set the text.</td> </tr> <tr> <td>android:hint</td> <td>It is used to display the hint text when text is empty</td> </tr> <tr> <td>android:textColor</td> <td>It is used to change the color of the text.</td> </tr> <tr> <td>android:textColorHint</td> <td>It is used to change the text color of hint text.</td> </tr> <tr> <td>android:textSize</td> <td>It is used to specify the size of the text.</td> </tr> <tr> <td>android:textStyle</td> <td>It is used to change the style (bold, italic, bolditalic) of text.</td> </tr> <tr> <td>android:background</td> <td>It is used to set the background color for autocomplete textview control</td> </tr> <tr> <td>android:ems</td> <td>It is used to make the textview be exactly this many ems wide.</td> </tr> <tr> <td>android:width</td> <td>It makes the TextView be exactly this many pixels wide.</td> </tr> <tr> <td>android:height</td> <td>It makes the TextView be exactly this many pixels tall.</td> </tr> <tr> <td>android:textColorHighlight</td> <td>It is used to change the color of the text selection highlight.</td> </tr> <tr> <td>android:fontFamily</td> <td>It is used to specify the font family for the text.</td> </tr> </tbody> </table>",
            "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><p>In this example, we are displaying the countries in the AutoCompleteTextView. All the countries are stored in a string array. We are using the&nbsp;<strong>ArrayAdapter</strong>&nbsp;class to display the array content.</p> <h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                    "&lt;android.support.constraint.ConstraintLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                    "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                    "    android:layout_width=&quot;match_parent&quot;\n" +
                    "    android:layout_height=&quot;match_parent&quot;\n" +
                    "    xmlns:app=&quot;http://schemas.android.com/apk/res-auto&quot;\n" +
                    "    tools:context=&quot;.MainActivity&quot;&gt;\n" +
                    "\n" +
                    "    &lt;TextView\n" +
                    "        android:layout_width=&quot;wrap_content&quot;\n" +
                    "        android:layout_height=&quot;wrap_content&quot;\n" +
                    "        android:text=&quot;What is your favourite country?&quot;\n" +
                    "        app:layout_constraintBottom_toBottomOf=&quot;parent&quot;\n" +
                    "        app:layout_constraintLeft_toLeftOf=&quot;parent&quot;\n" +
                    "        app:layout_constraintRight_toRightOf=&quot;parent&quot;\n" +
                    "        app:layout_constraintTop_toTopOf=&quot;parent&quot;\n" +
                    "        app:layout_constraintVertical_bias=&quot;0.032&quot; /&gt;\n" +
                    "\n" +
                    "    &lt;AutoCompleteTextView\n" +
                    "        android:id=&quot;@+id/autoCompleteTextView&quot;\n" +
                    "        android:layout_width=&quot;200dp&quot;\n" +
                    "        android:layout_height=&quot;wrap_content&quot;\n" +
                    "        android:layout_marginLeft=&quot;92dp&quot;\n" +
                    "        android:layout_marginTop=&quot;144dp&quot;\n" +
                    "        android:text=&quot;&quot;\n" +
                    "        app:layout_constraintStart_toStartOf=&quot;parent&quot;\n" +
                    "        app:layout_constraintTop_toTopOf=&quot;parent&quot; /&gt;\n" +
                    "&lt;/android.support.constraint.ConstraintLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.autocompletetextviewexample;\n" +
                    "\n" +
                    "import android.graphics.Color;\n" +
                    "import android.support.v7.app.AppCompatActivity;\n" +
                    "import android.os.Bundle;\n" +
                    "import android.widget.ArrayAdapter;\n" +
                    "import android.widget.AutoCompleteTextView;\n" +
                    "\n" +
                    "public class MainActivity extends AppCompatActivity {\n" +
                    "    String[] countries = { \"India\", \"USA\", \"Australia\", \"UK\", \"Italy\", \"Ireland\", \"Africa\" };\n" +
                    "    @Override\n" +
                    "    protected void onCreate(Bundle savedInstanceState) {\n" +
                    "        super.onCreate(savedInstanceState);\n" +
                    "        setContentView(R.layout.activity_main);\n" +
                    "\n" +
                    "        //Creating the instance of ArrayAdapter containing list of country names\n" +
                    "        ArrayAdapter<String> adapter = new ArrayAdapter<String>\n" +
                    "                (this,android.R.layout.select_dialog_item,countries);\n" +
                    "        //Getting the instance of AutoCompleteTextView\n" +
                    "        AutoCompleteTextView actv =  (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);\n" +
                    "        actv.setThreshold(1);//will start working from first character\n" +
                    "        actv.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView\n" +
                    "        actv.setTextColor(Color.RED);\n" +
                    "    }\n" +
                    "}</pre>",
            "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=actext_img.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=actext_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=actext_img2.png height=500 width=300/>"));
        mTutorialData.put("Android ImageButton",new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script> <h1 style=\"text-align: center;\">ImageButton</h1> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; &nbsp;↳ android.view.View<br />&nbsp; &nbsp; &nbsp;&nbsp;↳ android.widget.ImageView<br />&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;↳ android.widget.ImageButton</pre> <p id=\"divanimbt\">In Android,&nbsp;<strong>Image Button</strong>&nbsp;is a user interface control which is used to display a button with an image and to perform an action when a user clicks or tap on it.</p> <p>By default, the ImageButton looks the same as a normal button and it performs an action when a user clicks or touches it, but the only difference is we will add a custom image to the button instead of text.</p> <p>we can add an image to the button by using&nbsp;<strong>&lt;ImageButton&gt; </strong>attribute <strong>android:src</strong>&nbsp;in XML layout file or by using&nbsp;<strong>setImageResource()</strong>&nbsp;method.</p> <p><strong>ImageButton code in XML:</strong></p> <pre class=\"prettyprint\">&lt;!--Make Sure To Add Image Name home in Drawable Folder--&gt;\n" +
                        "&lt;ImageButton\n" +
                        "android:id=&quot;@+id/simpleImageButton&quot;\n" +
                        "android:layout_width=&quot;wrap_content&quot;\n" +
                        "android:layout_height=&quot;wrap_content&quot;\n" +
                        "android:src=&quot;@drawable/home&quot; /&gt;</pre> <h2><span style=\"text-decoration: underline;\">ImageButton Attributes</span></h2> <table border=\"1\"> <thead> <tr> <th>Attribute</th> <th>Description</th> </tr> </thead> <tbody> <tr> <td>android:id</td> <td>It is used to uniquely identify the control</td> </tr> <tr> <td>android:src</td> <td>It is used to specify the source file of image</td> </tr> <tr> <td>android:background</td> <td>It is used to set the background color for an image button control.</td> </tr> <tr> <td>android:padding</td> <td>It is used to set the padding from left, right, top and bottom of image button.</td> </tr> <tr> <td>android:baseline</td> <td>It is used to set offset of the baseline within the view.</td> </tr> </tbody> </table>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script> <p>In this example, We defining a one&nbsp;<strong>ImageButton</strong>&nbsp;and two EditText&nbsp;controls in LinearLayout&nbsp;to get the data of EditText&nbsp;controls when clicking on <strong>ImageButton</strong> in the android application.</p> <h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;LinearLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    android:orientation=&quot;vertical&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;\n" +
                        "    android:id=&quot;@+id/l_layout&quot;&gt;\n" +
                        "    &lt;TextView\n" +
                        "        android:id=&quot;@+id/fstTxt&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_marginLeft=&quot;100dp&quot;\n" +
                        "        android:layout_marginTop=&quot;150dp&quot;\n" +
                        "        android:text=&quot;First Number&quot;/&gt;\n" +
                        "    &lt;EditText\n" +
                        "        android:id=&quot;@+id/firstNum&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_marginLeft=&quot;100dp&quot;\n" +
                        "        android:ems=&quot;10&quot;/&gt;\n" +
                        "    &lt;TextView\n" +
                        "        android:id=&quot;@+id/secTxt&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:text=&quot;Second Number&quot;\n" +
                        "        android:layout_marginLeft=&quot;100dp&quot; /&gt;\n" +
                        "    &lt;EditText\n" +
                        "        android:id=&quot;@+id/secondNum&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_marginLeft=&quot;100dp&quot;\n" +
                        "        android:ems=&quot;10&quot; /&gt;\n" +
                        "\n" +
                        "    &lt;ImageButton\n" +
                        "        android:id=&quot;@+id/addBtn&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_marginLeft=&quot;100dp&quot;\n" +
                        "        android:src=&quot;@drawable/add_icon&quot; /&gt;\n" +
                        "&lt;/LinearLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.imagebuttonexample;\n" +
                        "\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.EditText;\n" +
                        "import android.widget.ImageButton;\n" +
                        "import android.widget.Toast;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    private EditText firstNum, secoNdnum;\n" +
                        "    private ImageButton btnAdd;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        firstNum = (EditText) findViewById(R.id.firstNum);\n" +
                        "        secoNdnum = (EditText) findViewById(R.id.secondNum);\n" +
                        "        btnAdd = (ImageButton) findViewById(R.id.addBtn);\n" +
                        "        btnAdd.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                if (firstNum.getText().toString().isEmpty() || secoNdnum.getText().toString().isEmpty()) {\n" +
                        "                    Toast.makeText(getApplicationContext(), \"Please fill all the fields\", Toast.LENGTH_SHORT).show();\n" +
                        "                } else {\n" +
                        "                    int num1 = Integer.parseInt(firstNum.getText().toString());\n" +
                        "                    int num2 = Integer.parseInt(secoNdnum.getText().toString());\n" +
                        "                    Toast.makeText(getApplicationContext(), \"SUM = \" + (num1 + num2), Toast.LENGTH_SHORT).show();\n" +
                        "                }\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}</pre>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=imgbutton_img.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=imgbutton_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=imgbutton_img2.png height=500 width=300/>"));
        mTutorialData.put("Android ToggleButton",new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script> <h2 style=\"text-align: center;\">ToggleButton (On/Off)</h2> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; &nbsp;↳ android.view.View<br />&nbsp; &nbsp; &nbsp;&nbsp;↳ android.widget.TextView<br />&nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.Button<br />&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.CompoundButton<br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.ToggleButton</pre> <p>In Android,&nbsp;<strong>ToggleButton</strong>&nbsp;is a user interface control which is used to display&nbsp;<strong>ON</strong>&nbsp;(<strong>Checked</strong>) or&nbsp;<strong>OFF</strong>&nbsp;(<strong>Unchecked</strong>) states as a button with a light indicator.</p> <p>The&nbsp;<strong>ToggleButton</strong>&nbsp;is useful for the users to change the settings between two states either&nbsp;<strong>ON</strong>&nbsp;or&nbsp;<strong>OFF</strong>. We can add a&nbsp;<strong>ToggleButton</strong>&nbsp;to our application layout by using a&nbsp;<strong>ToggleButton</strong>&nbsp;object.</p> <p><strong>Toggle Button code in XML:</strong></p> <pre class=\"prettyprint\">&lt;ToggleButton\n" +
                        "android:id=&quot;@+id/simpleToggleButton&quot;\n" +
                        "android:layout_width=&quot;wrap_content&quot;\n" +
                        "android:layout_height=&quot;wrap_content&quot;/&gt;</pre> <h2><span style=\"text-decoration: underline;\">ToggleButton Attributes</span></h2> <table border=\"1\"> <thead> <tr> <th>Attribute</th> <th>Description</th> </tr> </thead> <tbody> <tr> <td>android:id</td> <td>It is used to uniquely identify the control</td> </tr> <tr> <td>android:checked</td> <td>It is used to specify the current state of the toggle button</td> </tr> <tr> <td>android:gravity</td> <td>It is used to specify how to align the text like left, right, center, top, etc.</td> </tr> <tr> <td>android:text</td> <td>It is used to set the text.</td> </tr> <tr> <td>android:textOn</td> <td>It is used to set the text when the toggle button is in ON / Checked state.</td> </tr> <tr> <td>android:textOff</td> <td>It is used to set the text when the toggle button is in the OFF / Unchecked state.</td> </tr> <tr> <td>android:textColor</td> <td>It is used to change the color of the text.</td> </tr> <tr> <td>android:textSize</td> <td>It is used to specify the size of the text.</td> </tr> <tr> <td>android:textStyle</td> <td>It is used to change the style (bold, italic, bolditalic) of text.</td> </tr> <tr> <td>android:background</td> <td>It is used to set the background color for toggle button control.</td> </tr> <tr> <td>android:padding</td> <td>It is used to set the padding from left, right, top and bottom.</td> </tr> <tr> <td>android:drawableBottom</td> <td>It&rsquo;s a drawable to be drawn to the below of the text.</td> </tr> <tr> <td>android:drawableRight</td> <td>It&rsquo;s a drawable to be drawn to the right of the text.</td> </tr> <tr> <td>android:drawableLeft</td> <td>It&rsquo;s a drawable to be drawn to the left of the text.</td> </tr> </tbody> </table> <h2><span style=\"text-decoration: underline;\">ToggleButton Methods</span></h2> <table border=\"1\"> <tbody> <tr> <th>Method</th> <th>Description</th> </tr> <tr> <td>CharSequence getTextOff()</td> <td>Returns the text when button is not in the checked state.</td> </tr> <tr> <td>CharSequence getTextOn()</td> <td>Returns the text for when button is in the checked state.</td> </tr> <tr> <td>void setChecked(boolean checked)</td> <td>Changes the checked state of this button.</td> </tr> </tbody> </table>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script> <p>In this example, we defining&nbsp;two&nbsp;<strong>ToggleButton</strong>&nbsp;controls and one&nbsp;Button&nbsp;control and&nbsp;get the state of&nbsp;<strong>ToggleButton</strong>&nbsp;controls when we click on Button&nbsp;control in the Android application.</p> <h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;android.support.constraint.ConstraintLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    xmlns:app=&quot;http://schemas.android.com/apk/res-auto&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;&gt;\n" +
                        "    &lt;ToggleButton\n" +
                        "        android:id=&quot;@+id/toggleButton&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_marginLeft=&quot;8dp&quot;\n" +
                        "        android:layout_marginTop=&quot;80dp&quot;\n" +
                        "        android:text=&quot;ToggleButton&quot;\n" +
                        "        android:textOff=&quot;Off&quot;\n" +
                        "        android:textOn=&quot;On&quot;\n" +
                        "        app:layout_constraintEnd_toStartOf=&quot;@+id/toggleButton2&quot;\n" +
                        "        app:layout_constraintStart_toStartOf=&quot;parent&quot;\n" +
                        "        app:layout_constraintTop_toTopOf=&quot;parent&quot; /&gt;\n" +
                        "    &lt;ToggleButton\n" +
                        "        android:id=&quot;@+id/toggleButton2&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_marginRight=&quot;60dp&quot;\n" +
                        "        android:layout_marginTop=&quot;80dp&quot;\n" +
                        "        android:text=&quot;ToggleButton&quot;\n" +
                        "        android:textOff=&quot;Off&quot;\n" +
                        "        android:textOn=&quot;On&quot;\n" +
                        "        app:layout_constraintEnd_toEndOf=&quot;parent&quot;\n" +
                        "        app:layout_constraintTop_toTopOf=&quot;parent&quot; /&gt;\n" +
                        "    &lt;Button\n" +
                        "        android:id=&quot;@+id/button&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_marginBottom=&quot;144dp&quot;\n" +
                        "        android:layout_marginLeft=&quot;148dp&quot;\n" +
                        "        android:text=&quot;Submit&quot;\n" +
                        "        app:layout_constraintBottom_toBottomOf=&quot;parent&quot;\n" +
                        "        app:layout_constraintStart_toStartOf=&quot;parent&quot; /&gt;\n" +
                        "&lt;/android.support.constraint.ConstraintLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.togglebuttonexample;\n" +
                        "\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.Toast;\n" +
                        "import android.widget.ToggleButton;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    private ToggleButton toggleButton1, toggleButton2;\n" +
                        "    private Button buttonSubmit;\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        addListenerOnButtonClick();\n" +
                        "    }\n" +
                        "\n" +
                        "    private void addListenerOnButtonClick() {\n" +
                        "        //Getting the ToggleButton and Button instance from the layout xml file\n" +
                        "        toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton);\n" +
                        "        toggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);\n" +
                        "        buttonSubmit = (Button) findViewById(R.id.button);\n" +
                        "\n" +
                        "        //Performing action on button click\n" +
                        "        buttonSubmit.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View view) {\n" +
                        "                StringBuilder result = new StringBuilder();\n" +
                        "                result.append(\"ToggleButton1 : \").append(toggleButton1.getText());\n" +
                        "                result.append(\"\\nToggleButton2 : \").append(toggleButton2.getText());\n" +
                        "                //Displaying the message in toast\n" +
                        "                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}</pre>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=toggle_img.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=toggle_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=toggle_img2.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=toggle_img3.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=toggle_img4.png height=500 width=300/>\n"));
        mTutorialData.put("Android RadioButton",new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">RadioButton</h1> <hr /> <p>In Android,&nbsp;<strong>RadioButton</strong>&nbsp;is a two states button which is either checked or unchecked. If a single radio button is unchecked, we can click it to make checked radio button. Once a radio button is checked, it cannot be marked as unchecked by the user.</p> <p>RadioButton is generally used with&nbsp;<em>RadioGroup</em>. RadioGroup contains combine multiple radio buttons into one group and it will make sure that user can select only one option from the group of multiple options.</p> <p>By default, the android&nbsp;<strong>RadioButton</strong>&nbsp;will be in&nbsp;<strong>OFF</strong>&nbsp;(<strong>Unchecked</strong>) state. We can change the default state of&nbsp;<strong>RadioButton</strong>&nbsp;by using&nbsp;<strong>android:checked </strong>attrtibute.</p> <p>In case, if we want to change the state of&nbsp;<strong>RadioButton</strong>&nbsp;to&nbsp;<strong>ON</strong>&nbsp;(<strong>Checked</strong>), then we need to set&nbsp;<strong>android:checked = &ldquo;true&rdquo;</strong>&nbsp;in our XML layout file.</p> <p><strong>RadioButton code in XML:</strong></p> <pre class=\"prettyprint\">&lt;RadioGroup\n" +
                        "    android:layout_width=&quot;wrap_content&quot;\n" +
                        "    android:layout_height=&quot;wrap_content&quot;&gt;\n" +
                        "        &lt;RadioButton\n" +
                        "        android:id=&quot;@+id/simpleRadioButton&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;/&gt;\n" +
                        "        &lt;RadioButton\n" +
                        "        android:id=&quot;@+id/simpleRadioButton1&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;/&gt;\n" +
                        "&lt;/RadioGroup&gt;</pre> <h2><span style=\"text-decoration: underline;\">RadioButton Attributes</span></h2> <table border=1> <thead> <tr> <th>Attribute</th> <th>Description</th> </tr> </thead> <tbody> <tr> <td>android:id</td> <td>It is used to uniquely identify the control</td> </tr> <tr> <td>android:checked</td> <td>It is used to specify the current state of radio button</td> </tr> <tr> <td>android:gravity</td> <td>It is used to specify how to align the text like left, right, center, top, etc.</td> </tr> <tr> <td>android:text</td> <td>It is used to set the text for radio button.</td> </tr> <tr> <td>android:textColor</td> <td>It is used to change the color of text.</td> </tr> <tr> <td>android:textSize</td> <td>It is used to specify the size of text.</td> </tr> <tr> <td>android:textStyle</td> <td>It is used to change the style (bold, italic, bolditalic) of text.</td> </tr> <tr> <td>android:background</td> <td>It is used to set the background color for radio button control.</td> </tr> <tr> <td>android:padding</td> <td>It is used to set the padding from left, right, top and bottom.</td> </tr> <tr> <td>android:onClick</td> <td>It&rsquo;s a name of the method to invoke when the radio button clicked.</td> </tr> <tr> <td>android:visibility</td> <td>It is used to control the visibility of control.</td> </tr> </tbody> </table>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><p>In this example, we get the selected values of RadioButton controls when we click on Button in the android application.</p> <h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;RelativeLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;&gt;\n" +
                        "    &lt;TextView\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_marginTop=&quot;150dp&quot;\n" +
                        "        android:layout_marginLeft=&quot;100dp&quot;\n" +
                        "        android:textSize=&quot;18dp&quot;\n" +
                        "        android:text=&quot;Select Your Course&quot;\n" +
                        "        android:textStyle=&quot;bold&quot;\n" +
                        "        android:id=&quot;@+id/txtView&quot;/&gt;\n" +
                        "    &lt;RadioGroup\n" +
                        "        android:layout_width=&quot;match_parent&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:orientation=&quot;vertical&quot;\n" +
                        "        android:id=&quot;@+id/rdGroup&quot;\n" +
                        "        android:layout_below=&quot;@+id/txtView&quot;&gt;\n" +
                        "        &lt;RadioButton\n" +
                        "            android:id=&quot;@+id/rdbJava&quot;\n" +
                        "            android:layout_width=&quot;wrap_content&quot;\n" +
                        "            android:layout_height=&quot;wrap_content&quot;\n" +
                        "            android:padding=&quot;10dp&quot;\n" +
                        "            android:layout_marginLeft=&quot;100dp&quot;\n" +
                        "            android:text=&quot;Java&quot;\n" +
                        "            android:onClick=&quot;onRadioButtonClicked&quot;/&gt;\n" +
                        "        &lt;RadioButton\n" +
                        "            android:id=&quot;@+id/rdbPython&quot;\n" +
                        "            android:layout_width=&quot;wrap_content&quot;\n" +
                        "            android:layout_height=&quot;wrap_content&quot;\n" +
                        "            android:padding=&quot;10dp&quot;\n" +
                        "            android:layout_marginLeft=&quot;100dp&quot;\n" +
                        "            android:text=&quot;Python&quot;\n" +
                        "            android:onClick=&quot;onRadioButtonClicked&quot;/&gt;\n" +
                        "        &lt;RadioButton\n" +
                        "            android:id=&quot;@+id/rdbAndroid&quot;\n" +
                        "            android:layout_width=&quot;wrap_content&quot;\n" +
                        "            android:layout_height=&quot;wrap_content&quot;\n" +
                        "            android:padding=&quot;10dp&quot;\n" +
                        "            android:layout_marginLeft=&quot;100dp&quot;\n" +
                        "            android:text=&quot;Android&quot;\n" +
                        "            android:onClick=&quot;onRadioButtonClicked&quot;/&gt;\n" +
                        "        &lt;RadioButton\n" +
                        "            android:id=&quot;@+id/rdbAngular&quot;\n" +
                        "            android:layout_width=&quot;wrap_content&quot;\n" +
                        "            android:layout_height=&quot;wrap_content&quot;\n" +
                        "            android:padding=&quot;10dp&quot;\n" +
                        "            android:layout_marginLeft=&quot;100dp&quot;\n" +
                        "            android:text=&quot;AngularJS&quot;\n" +
                        "            android:onClick=&quot;onRadioButtonClicked&quot;/&gt;\n" +
                        "    &lt;/RadioGroup&gt;\n" +
                        "    &lt;Button\n" +
                        "        android:id=&quot;@+id/getBtn&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_marginLeft=&quot;100dp&quot;\n" +
                        "        android:layout_below=&quot;@+id/rdGroup&quot;\n" +
                        "        android:text=&quot;Get Course&quot; /&gt;\n" +
                        "&lt;/RelativeLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.radiobuttonexample;\n" +
                        "\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.RadioButton;\n" +
                        "import android.widget.Toast;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    RadioButton android, java, angular, python;\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        android = (RadioButton)findViewById(R.id.rdbAndroid);\n" +
                        "        angular = (RadioButton)findViewById(R.id.rdbAngular);\n" +
                        "        java = (RadioButton)findViewById(R.id.rdbJava);\n" +
                        "        python = (RadioButton)findViewById(R.id.rdbPython);\n" +
                        "        Button btn = (Button)findViewById(R.id.getBtn);\n" +
                        "        btn.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                String result = \"Selected Course: \";\n" +
                        "                result+= (android.isChecked())?\"Android\":(angular.isChecked())?\"AngularJS\":(java.isChecked())?\"Java\":(python.isChecked())?\"Python\":\"\";\n" +
                        "                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "    public void onRadioButtonClicked(View view) {\n" +
                        "        boolean checked = ((RadioButton) view).isChecked();\n" +
                        "        String str=\"\";\n" +
                        "        // Check which radio button was clicked\n" +
                        "        switch(view.getId()) {\n" +
                        "            case R.id.rdbAndroid:\n" +
                        "                if(checked)\n" +
                        "                    str = \"Android Selected\";\n" +
                        "                break;\n" +
                        "            case R.id.rdbAngular:\n" +
                        "                if(checked)\n" +
                        "                    str = \"AngularJS Selected\";\n" +
                        "                break;\n" +
                        "            case R.id.rdbJava:\n" +
                        "                if(checked)\n" +
                        "                    str = \"Java Selected\";\n" +
                        "                break;\n" +
                        "            case R.id.rdbPython:\n" +
                        "                if(checked)\n" +
                        "                    str = \"Python Selected\";\n" +
                        "                break;\n" +
                        "        }\n" +
                        "        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();\n" +
                        "    }\n" +
                        "}</pre>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=radio_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=radio_img2.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=radio_img3.png height=500 width=300/>\n"));
        mTutorialData.put("Android CheckBox",new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">CheckBox</h1> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; &nbsp;↳ android.view.View<br />&nbsp; &nbsp; &nbsp;&nbsp;↳ android.widget.TextView<br />&nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.Button<br />&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.CompoundButton<br /> ↳ android.widget.CheckBox</pre> <p>In Android, <strong>CheckBox</strong>&nbsp;is a two states button that can be either checked (ON) or unchecked (OFF) and it will allow users to toggle between the two states (ON / OFF) based on the requirements.</p> <p><strong>CheckBox code in XML:</strong></p> <pre class=\"prettyprint\">&lt;CheckBox\n" +
                        "android:id=&quot;@+id/simpleCheckBox&quot;\n" +
                        "android:layout_width=&quot;wrap_content&quot;\n" +
                        "android:layout_height=&quot;wrap_content&quot;\n" +
                        "android:text=&quot;Simple CheckBox&quot;/&gt;</pre> <p><strong>Create CheckBox Control in Activity File:</strong></p> <p>Following is the example of creating CheckBox control dynamically in the activity file.</p> <pre class=\"prettyprint\">LinearLayout layout = (LinearLayout)findViewById(R.id.l_layout);\n" +
                        "CheckBox cb = new CheckBox(this);\n" +
                        "cb.setText(\"Simple CheckBox\");\n" +
                        "cb.setChecked(true);\n" +
                        "layout.addView(cb);</pre> <p><strong>CheckBox Class Methods:</strong></p> <table border=\"1\"> <tbody> <tr> <th>Method</th> <th>Description</th> </tr> <tr> <td>public boolean isChecked()</td> <td>Returns true if it is checked otherwise false.</td> </tr> <tr> <td>public void setChecked(boolean status)</td> <td>Changes the state of the CheckBox.</td> </tr> </tbody> </table> <h2><span style=\"text-decoration: underline;\">CheckBox Attributes</span></h2> <table border=\"1\"> <thead> <tr class=\"info\"> <th>Attribute</th> <th>Description</th> </tr> </thead> <tbody> <tr> <td>android:id</td> <td>It is used to uniquely identify the control</td> </tr> <tr> <td>android:checked</td> <td>It is used to specify the current state of a checkbox</td> </tr> <tr> <td>android:gravity</td> <td>It is used to specify how to align the text like left, right, center, top, etc.</td> </tr> <tr> <td>android:text</td> <td>It is used to set the text for a checkbox.</td> </tr> <tr> <td>android:textColor</td> <td>It is used to change the color of the text.</td> </tr> <tr> <td>android:textSize</td> <td>It is used to specify the size of the text.</td> </tr> <tr> <td>android:textStyle</td> <td>It is used to change the style (bold, italic, bolditalic) of text.</td> </tr> <tr> <td>android:background</td> <td>It is used to set the background color for checkbox control.</td> </tr> <tr> <td>android:padding</td> <td>It is used to set the padding from left, right, top and bottom.</td> </tr> <tr> <td>android:onClick</td> <td>It&rsquo;s the name of the method to invoke when the checkbox clicked.</td> </tr> <tr> <td>android:visibility</td> <td>It is used to control the visibility of control.</td> </tr> </tbody> </table>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;CheckBox\n" +
                        "android:id=&quot;@+id/simpleCheckBox&quot;\n" +
                        "android:layout_width=&quot;wrap_content&quot;\n" +
                        "android:layout_height=&quot;wrap_content&quot;\n" +
                        "android:text=&quot;Simple CheckBox&quot;/&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.checkboxexample;\n" +
                        "\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.CheckBox;\n" +
                        "import android.widget.Toast;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    CheckBox pizza, coffee, burger;\n" +
                        "    Button buttonOrder;\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        addListenerOnButtonClick();\n" +
                        "    }\n" +
                        "\n" +
                        "    public void addListenerOnButtonClick() {\n" +
                        "\n" +
                        "        //Getting instance of CheckBoxes and Button from the activty_main.xml file\n" +
                        "        pizza = (CheckBox) findViewById(R.id.checkBox);\n" +
                        "        coffee = (CheckBox) findViewById(R.id.checkBox2);\n" +
                        "        burger = (CheckBox) findViewById(R.id.checkBox3);\n" +
                        "        buttonOrder = (Button) findViewById(R.id.button);\n" +
                        "\n" +
                        "        //Applying the Listener on the Button click\n" +
                        "        buttonOrder.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View view) {\n" +
                        "                int totalamount = 0;\n" +
                        "                StringBuilder result = new StringBuilder();\n" +
                        "                result.append(\"Selected Items:\");\n" +
                        "                if (pizza.isChecked()) {\n" +
                        "                    result.append(\"\\nPizza 100Rs\");\n" +
                        "                    totalamount += 100;\n" +
                        "                }\n" +
                        "                if (coffee.isChecked()) {\n" +
                        "                    result.append(\"\\nCoffe 50Rs\");\n" +
                        "                    totalamount += 50;\n" +
                        "                }\n" +
                        "                if (burger.isChecked()) {\n" +
                        "                    result.append(\"\\nBurger 120Rs\");\n" +
                        "                    totalamount += 120;\n" +
                        "                }\n" +
                        "                result.append(\"\\nTotal: \" + totalamount + \"Rs\");\n" +
                        "                //Displaying the message on the toast\n" +
                        "                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}</pre>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=checkbox_img.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=checkbox_img1.png height=500 width=300/>\n"));
        mTutorialData.put("Android ProgressBar",new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">ProgressBar</h1> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; &nbsp;↳ android.view.View<br />&nbsp; &nbsp; &nbsp;&nbsp;↳ android.widget.ProgressBar&nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</pre> <p>In Android, <strong>ProgressBar</strong>&nbsp;is a user interface control which is used to indicate the progress of an operation. For example, downloading a file, uploading a file.</p> <p>The&nbsp;<strong>ProgressDialog</strong>&nbsp;class provides methods to work on progress bar like setProgress(), setMessage(), setProgressStyle(), setMax(), show() etc. The progress range of Progress Dialog is 0 to 10000.</p> <p>By default the ProgressBar will be displayed as a spinning wheel, in case if we want to show it like horizontal bar then we need to change the style property to horizontal like&nbsp;</p> <pre class=\"prettyprint\">style=\"?android:attr/progressBarStyleHorizontal\"</pre> <p><strong>ProgressBar code in XML:</strong></p> <pre class=\"prettyprint\">&lt;ProgressBar\n" +
                        "android:id=&quot;@+id/simpleProgressBar&quot;\n" +
                        "android:layout_width=&quot;wrap_content&quot;\n" +
                        "android:layout_height=&quot;wrap_content&quot; /&gt;</pre><p>Let's see a simple example to display a progress bar in android.</p> <pre class=\"prettyprint\">ProgressDialog progressBar = new ProgressDialog(this);  \n" +
                        "progressBar.setCancelable(true);//you can cancel it by pressing back button  \n" +
                        "progressBar.setMessage(\"File downloading ...\");  \n" +
                        "progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);  \n" +
                        "progressBar.setProgress(0);//initially progress is 0  \n" +
                        "progressBar.setMax(100);//sets the maximum value 100  \n" +
                        "progressBar.show();//displays the progress bar</pre> <p><strong>ProgressBar Methods:</strong></p> <table border=\"1\"> <tbody> <tr> <th>Title &amp; description</th> </tr> <tr> <td> <p><strong>getMax()</strong></p> <p>This method returns the maximum value of the progress.</p> </td> </tr> <tr> <td> <p><strong>incrementProgressBy(int diff)</strong></p> <p>This method increments the progress bar by the difference of value passed as a parameter.</p> </td> </tr> <tr> <td> <p><strong>setIndeterminate(boolean indeterminate)</strong></p> <p>This method sets the progress indicator as determinate or indeterminate.</p> </td> </tr> <tr> <td> <p><strong>setMax(int max)</strong></p> <p>This method sets the maximum value of the progress dialog.</p> </td> </tr> <tr> <td> <p><strong>setProgress(int value)</strong></p> <p>This method is used to update the progress dialog with some specific value.</p> </td> </tr> <tr> <td> <p><strong>show(Context context, CharSequence title, CharSequence message)</strong></p> <p>This is a static method, used to display progress dialog.</p> </td> </tr> </tbody> </table> <h2><span style=\"text-decoration: underline;\">ProgressBar Attributes</span></h2> <table border=\"1\"> <thead> <tr> <th>Attribute</th> <th>Description</th> </tr> </thead> <tbody> <tr> <td>android:id</td> <td>It is used to uniquely identify the control</td> </tr> <tr> <td>android:minHeight</td> <td>It is used to set the height of the progress bar.</td> </tr> <tr> <td>android:minWidth</td> <td>It is used to set the width of the progress bar.</td> </tr> <tr> <td>android:max</td> <td>It is used to set the maximum value of the progress bar.</td> </tr> <tr> <td>android:progress</td> <td>It is used to set the default progress value between 0 and max. It must be an integer value.</td> </tr> <tr> <td>android:background</td> <td>It is used to set the background color for a progress bar.</td> </tr> <tr> <td>android:indeterminate</td> <td>It is used to enable the indeterminate progress mode.</td> </tr> <tr> <td>android:padding</td> <td>It is used to set the padding for left, right, top or bottom of a progress bar.</td> </tr> </tbody> </table>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><p>Following is the example of defining one ProgressBar control, one TextView&nbsp;control and one Button&nbsp;control in RelativeLayout&nbsp;to start showing the progress in the progress bar on Button&nbsp;click in the android application.</p> <h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;RelativeLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;&gt;\n" +
                        "    &lt;ProgressBar\n" +
                        "        android:id=&quot;@+id/pBar&quot;\n" +
                        "        style=&quot;?android:attr/progressBarStyleHorizontal&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_marginLeft=&quot;100dp&quot;\n" +
                        "        android:layout_marginTop=&quot;200dp&quot;\n" +
                        "        android:minHeight=&quot;50dp&quot;\n" +
                        "        android:minWidth=&quot;200dp&quot;\n" +
                        "        android:max=&quot;100&quot;\n" +
                        "        android:indeterminate=&quot;false&quot;\n" +
                        "        android:progress=&quot;0&quot; /&gt;\n" +
                        "    &lt;TextView\n" +
                        "        android:id=&quot;@+id/tView&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_alignLeft=&quot;@+id/pBar&quot;\n" +
                        "        android:layout_below=&quot;@+id/pBar&quot; /&gt;\n" +
                        "    &lt;Button\n" +
                        "        android:id=&quot;@+id/btnShow&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_marginLeft=&quot;130dp&quot;\n" +
                        "        android:layout_marginTop=&quot;20dp&quot;\n" +
                        "        android:text=&quot;Start Progress&quot;\n" +
                        "        android:layout_below=&quot;@+id/tView&quot;/&gt;\n" +
                        "&lt;/RelativeLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.progressbarexample;\n" +
                        "\n" +
                        "import android.os.Handler;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.ProgressBar;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    private ProgressBar pgsBar;\n" +
                        "    private int i = 0;\n" +
                        "    private TextView txtView;\n" +
                        "    private Handler hdlr = new Handler();\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        pgsBar = (ProgressBar) findViewById(R.id.pBar);\n" +
                        "        txtView = (TextView) findViewById(R.id.tView);\n" +
                        "        Button btn = (Button)findViewById(R.id.btnShow);\n" +
                        "        btn.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                i = pgsBar.getProgress();\n" +
                        "                new Thread(new Runnable() {\n" +
                        "                    public void run() {\n" +
                        "                        while (i < 100) {\n" +
                        "                            i += 1;\n" +
                        "                            // Update the progress bar and display the current value in text view\n" +
                        "                            hdlr.post(new Runnable() {\n" +
                        "                                public void run() {\n" +
                        "                                    pgsBar.setProgress(i);\n" +
                        "                                    txtView.setText(i+\"/\"+pgsBar.getMax());\n" +
                        "                                }\n" +
                        "                            });\n" +
                        "                            try {\n" +
                        "                                // Sleep for 100 milliseconds to show the progress slowly.\n" +
                        "                                Thread.sleep(100);\n" +
                        "                            } catch (InterruptedException e) {\n" +
                        "                                e.printStackTrace();\n" +
                        "                            }\n" +
                        "                        }\n" +
                        "                    }\n" +
                        "                }).start();\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}</pre>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=progressbar_img.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=progressbar_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=progressbar_img2.png height=500 width=300/>\n"));
        mTutorialData.put("Android Spinner",new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">Spinner(Dropdown List)</h1> <hr /> <p id=\"divansp\">In Android,&nbsp;<strong>Spinner</strong>&nbsp;is a view which allows a user to select one value from the list of values. The spinner in android will behave the same as a dropdown list in other programming languages.&nbsp;</p> <p>Generally, the android spinners will provide a quick way to select one item from the list of values and it will show a dropdown menu with a list of all values when we click or tap on it.&nbsp;</p> <p>Android spinner is associated with AdapterView. So you need to use one of the adapter classes with spinner.</p> <p>Android Spinner class is the subclass of AsbSpinner class.</p> <p><strong>Android Adapter:</strong></p> <p>In Android,&nbsp;<strong>Adapter</strong>&nbsp;will act as an intermediate between the data sources and adapter views such as&nbsp;<strong>ListView</strong>,&nbsp;<strong>Gridview</strong>&nbsp;to fill the data into adapter views. The adapter will hold the data and iterates through items in data set and generate the views for each item in the list.&nbsp;</p> <p>Generally, in android we have a different type of adapters available to fetch the data from different data sources to fill the data into adapter views, those are:</p> <table border=\"1\"> <thead> <tr> <th>Adapter</th> <th>Description</th> </tr> </thead> <tbody> <tr> <td>ArrayAdapter</td> <td>It will expect an Array or List as input.</td> </tr> <tr> <td>CurosrAdapter</td> <td>It will accept an instance of a cursor as an input.</td> </tr> <tr> <td>SimpleAdapter</td> <td>It will accept a static data defined in the resources.</td> </tr> <tr> <td>BaseAdapter</td> <td>It is a generic implementation for all three adapter types and it can be used for ListView, Gridview or Spinners based on our requirements</td> </tr> </tbody> </table> <p><strong>Spinner code in XML:</strong></p> <pre class=\"prettyprint\">&lt;Spinner\n" +
                        "android:id=&quot;@+id/simpleSpinner &quot;\n" +
                        "android:layout_width=&quot;fill_parent&quot;\n" +
                        "android:layout_height=&quot;wrap_content&quot; /&gt;</pre>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><p>In this example, we are going to display the country list. You need to use&nbsp;<strong>ArrayAdapter</strong>&nbsp;class to store the country list.</p> <h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;android.support.constraint.ConstraintLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    xmlns:app=&quot;http://schemas.android.com/apk/res-auto&quot;\n" +
                        "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;\n" +
                        "    tools:context=&quot;.MainActivity&quot;&gt;\n" +
                        "\n" +
                        "    &lt;Spinner\n" +
                        "        android:id=&quot;@+id/spinner&quot;\n" +
                        "        android:layout_width=&quot;149dp&quot;\n" +
                        "        android:layout_height=&quot;40dp&quot;\n" +
                        "        android:layout_marginBottom=&quot;8dp&quot;\n" +
                        "        android:layout_marginEnd=&quot;8dp&quot;\n" +
                        "        android:layout_marginStart=&quot;8dp&quot;\n" +
                        "        android:layout_marginTop=&quot;8dp&quot;\n" +
                        "        app:layout_constraintBottom_toBottomOf=&quot;parent&quot;\n" +
                        "        app:layout_constraintEnd_toEndOf=&quot;parent&quot;\n" +
                        "        app:layout_constraintHorizontal_bias=&quot;0.502&quot;\n" +
                        "        app:layout_constraintStart_toStartOf=&quot;parent&quot;\n" +
                        "        app:layout_constraintTop_toTopOf=&quot;parent&quot;\n" +
                        "        app:layout_constraintVertical_bias=&quot;0.498&quot; /&gt;\n" +
                        "\n" +
                        "&lt;/android.support.constraint.ConstraintLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.spinnerexample;\n" +
                        "\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.AdapterView;\n" +
                        "import android.widget.ArrayAdapter;\n" +
                        "import android.widget.Spinner;\n" +
                        "import android.widget.Toast;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity implements\n" +
                        "        AdapterView.OnItemSelectedListener {\n" +
                        "    String[] country = {\"India\", \"USA\", \"China\", \"Japan\", \"Other\"};\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        //Getting the instance of Spinner and applying OnItemSelectedListener on it\n" +
                        "        Spinner spin = (Spinner) findViewById(R.id.spinner);\n" +
                        "        spin.setOnItemSelectedListener(this);\n" +
                        "\n" +
                        "        //Creating the ArrayAdapter instance having the country list\n" +
                        "        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, country);\n" +
                        "        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);\n" +
                        "        //Setting the ArrayAdapter data on the Spinner\n" +
                        "        spin.setAdapter(aa);\n" +
                        "    }\n" +
                        "\n" +
                        "    //Performing action onItemSelected and onNothing selected\n" +
                        "    @Override\n" +
                        "    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {\n" +
                        "        Toast.makeText(getApplicationContext(), country[position], Toast.LENGTH_LONG).show();\n" +
                        "    }\n" +
                        "    @Override\n" +
                        "    public void onNothingSelected(AdapterView<?> arg0) {\n" +
                        "        // TODO Auto-generated method stub\n" +
                        "    }\n" +
                        "}</pre>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=spinner_img.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=spinner_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=spinner_img2.png height=500 width=300/>"));
         mTutorialData.put("Android DatePicker",new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">DatePicker</h1> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; &nbsp;↳ android.view.View<br />&nbsp; &nbsp; &nbsp;&nbsp;↳ android.view.ViewGroup<br />&nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.FrameLayout<br />&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.DatePicker</pre> <p>Android DatePicker is a widget to select a date. It allows you to select date by a day, month and year. Like DatePicker, Android also provides TimePicker to select a time.</p> <p>The android.widget.DatePicker is the subclass of FrameLayout class.</p> <p><strong>DatePicker code in XML:</strong></p> <pre class=\"prettyprint\">&lt;DatePicker\n" +
                        "android:id=&quot;@+id/simpleDatePicker&quot;\n" +
                        "android:layout_width=&quot;wrap_content&quot;\n" +
                        "android:layout_height=&quot;wrap_content&quot;\n" +
                        "android:datePickerMode=&quot;spinner&quot;/&gt;</pre> <p><strong>Datepicker Methods:</strong></p> <table border=\"1\"> <tbody> <tr> <th>Method &amp; description</th> </tr> <tr> <td> <p><strong>getDayOfMonth()</strong></p> <p>This method gets the selected day of month</p> </td> </tr> <tr> <td> <p><strong>getMonth()</strong></p> <p>This method gets the selected month</p> </td> </tr> <tr> <td> <p><strong>getYear()</strong></p> <p>This method gets the selected year</p> </td> </tr> <tr> <td> <p><strong>setMaxDate(long maxDate)</strong></p> <p>This method sets the maximal date supported by this DatePicker in milliseconds since January 1, 1970 00:00:00 in getDefault() time zone</p> </td> </tr> <tr> <td> <p><strong>setMinDate(long minDate)</strong></p> <p>This method sets the minimal date supported by this NumberPicker in milliseconds since January 1, 1970 00:00:00 in getDefault() time zone</p> </td> </tr> <tr> <td> <p><strong>setSpinnersShown(boolean shown)</strong></p> <p>This method sets whether the spinners are shown</p> </td> </tr> <tr> <td> <p><strong>updateDate(int year, int month, int dayOfMonth)</strong></p> <p>This method updates the current date</p> </td> </tr> <tr> <td> <p><strong>getCalendarView()</strong></p> <p>This method returns calendar view</p> </td> </tr> <tr> <td> <p><strong>getFirstDayOfWeek()</strong></p> <p>This Method returns the first day of the week</p> </td> </tr> </tbody> </table> <h2><span style=\"text-decoration: underline;\">DatePicker Attributes</span>&nbsp;</h2> <table border=\"1\"> <thead> <tr> <th>Attribute</th> <th>Description</th> </tr> </thead> <tbody> <tr> <td>android:id</td> <td>It is used to uniquely identify the control</td> </tr> <tr> <td>android:datePickerMode</td> <td>It is used to specify DatePicker mode either spinner or calendar</td> </tr> <tr> <td>android:background</td> <td>It is used to set the background color for the DatePicker.</td> </tr> <tr> <td>android:padding</td> <td>It is used to set the padding for left, right, top or bottom of DatePicker.</td> </tr> </tbody> </table>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;RelativeLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;\n" +
                        "    tools:context=&quot;.MainActivity&quot;&gt;\n" +
                        "    &lt;TextView\n" +
                        "        android:id=&quot;@+id/textView1&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_above=&quot;@+id/button1&quot;\n" +
                        "        android:layout_alignParentLeft=&quot;true&quot;\n" +
                        "        android:layout_alignParentStart=&quot;true&quot;\n" +
                        "        android:layout_marginBottom=&quot;102dp&quot;\n" +
                        "        android:layout_marginLeft=&quot;30dp&quot;\n" +
                        "        android:layout_marginStart=&quot;30dp&quot;\n" +
                        "        android:text=&quot;&quot; /&gt;\n" +
                        "    &lt;Button\n" +
                        "        android:id=&quot;@+id/button1&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_alignParentBottom=&quot;true&quot;\n" +
                        "        android:layout_centerHorizontal=&quot;true&quot;\n" +
                        "        android:layout_marginBottom=&quot;20dp&quot;\n" +
                        "        android:text=&quot;Change Date&quot; /&gt;\n" +
                        "    &lt;DatePicker\n" +
                        "        android:id=&quot;@+id/datePicker&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_above=&quot;@+id/textView1&quot;\n" +
                        "        android:paddingTop=&quot;20dp&quot;\n" +
                        "        android:layout_centerHorizontal=&quot;true&quot;\n" +
                        "        android:layout_marginBottom=&quot;36dp&quot; /&gt;\n" +
                        "&lt;/RelativeLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.datepickerexample;\n" +
                        "\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.DatePicker;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    DatePicker picker;\n" +
                        "    Button displayDate;\n" +
                        "    TextView textview1;\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        textview1=(TextView)findViewById(R.id.textView1);\n" +
                        "        picker=(DatePicker)findViewById(R.id.datePicker);\n" +
                        "        displayDate=(Button)findViewById(R.id.button1);\n" +
                        "\n" +
                        "        textview1.setText(\"Current Date: \"+getCurrentDate());\n" +
                        "\n" +
                        "        displayDate.setOnClickListener(new View.OnClickListener(){\n" +
                        "            @Override\n" +
                        "            public void onClick(View view) {\n" +
                        "                textview1.setText(\"Change Date: \"+getCurrentDate());\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "    public String getCurrentDate(){\n" +
                        "        StringBuilder builder=new StringBuilder();;\n" +
                        "        builder.append((picker.getMonth() + 1)+\"/\");//month is 0 based\n" +
                        "        builder.append(picker.getDayOfMonth()+\"/\");\n" +
                        "        builder.append(picker.getYear());\n" +
                        "        return builder.toString();\n" +
                        "    }\n" +
                        "}</pre>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=datepicker_img.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=datepicker_img1.png height=500 width=300/>\n"));
         mTutorialData.put("Android TimePicker",new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">TimePicker</h1> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; &nbsp;↳ android.view.View<br />&nbsp; &nbsp; &nbsp;&nbsp;↳ android.view.ViewGroup<br />&nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.FrameLayout<br />&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.TimePicker</pre> <p>In Android,&nbsp;<strong>TimePicker</strong>&nbsp;widget allows you to select the time of day in either 24 hours or AM/PM mode. The time consists of hours, minutes and clock format. Android provides this functionality through TimePicker class.</p> <p>The android.widget.TimePicker is the subclass of FrameLayout class.</p> <p><strong>TimePicker code in XML:</strong></p> <pre class=\"prettyprint\">&lt;TimePicker\n" +
                        "    android:id=&quot;@+id/simpleTimePicker&quot;\n" +
                        "    android:layout_width=&quot;wrap_content&quot;\n" +
                        "    android:layout_height=&quot;wrap_content&quot;\n" +
                        "    android:timePickerMode=&quot;spinner&quot;\n" +
                        "    android:background=&quot;#F88F00&quot; /&gt; &lt;!-- orange background color for the time picker --&gt;</pre> <p><strong>Datepicker Methods:</strong></p> <table border=\"1\"> <tbody> <tr> <th>Method &amp; description</th> </tr> <tr> <td> <p><strong>is24HourView()</strong></p> <p>This method returns true if this is in 24 hour view else false</p> </td> </tr> <tr> <td> <p><strong>isEnabled()</strong></p> <p>This method returns the enabled status for this view</p> </td> </tr> <tr> <td> <p><strong>setCurrentHour(Integer currentHour)</strong></p> <p>This method sets the current hour</p> </td> </tr> <tr> <td> <p><strong>setCurrentMinute(Integer currentMinute)</strong></p> <p>This method sets the current minute</p> </td> </tr> <tr> <td> <p><strong>setEnabled(boolean enabled)</strong></p> <p>This method set the enabled state of this view</p> </td> </tr> <tr> <td> <p><strong>setIs24HourView(Boolean is24HourView)</strong></p> <p>This method set whether in 24 hour or AM/PM mode</p> </td> </tr> <tr> <td> <p><strong>setOnTimeChangedListener(TimePicker.OnTimeChangedListener onTimeChangedListener)</strong></p> <p>This method Set the callback that indicates the time has been adjusted by the user</p> </td> </tr> </tbody> </table> <h2><span style=\"text-decoration: underline;\">TimePicker Attributes</span></h2> <table border=\"1\"> <thead> <tr> <th>Attribute</th> <th>Description</th> </tr> </thead> <tbody> <tr> <td>android:id</td> <td>It is used to uniquely identify the control</td> </tr> <tr> <td>android:timePickerMode</td> <td>It is used to specify TimePicker mode, either spinner or clock</td> </tr> <tr> <td>android:background</td> <td>It is used to set the background color for the TimePicker.</td> </tr> <tr> <td>android:padding</td> <td>It is used to set the padding for left, right, top or bottom of TimePicker.</td> </tr> </tbody> </table>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;RelativeLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;\n" +
                        "    tools:context=&quot;.MainActivity&quot;&gt;\n" +
                        "    &lt;TextView\n" +
                        "        android:id=&quot;@+id/textView1&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_above=&quot;@+id/button1&quot;\n" +
                        "        android:layout_alignParentLeft=&quot;true&quot;\n" +
                        "        android:layout_alignParentStart=&quot;true&quot;\n" +
                        "        android:layout_marginBottom=&quot;102dp&quot;\n" +
                        "        android:layout_marginLeft=&quot;30dp&quot;\n" +
                        "        android:layout_marginStart=&quot;30dp&quot;\n" +
                        "        android:text=&quot;&quot; /&gt;\n" +
                        "    &lt;Button\n" +
                        "        android:id=&quot;@+id/button1&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_alignParentBottom=&quot;true&quot;\n" +
                        "        android:layout_centerHorizontal=&quot;true&quot;\n" +
                        "        android:layout_marginBottom=&quot;20dp&quot;\n" +
                        "        android:text=&quot;Change Time&quot; /&gt;\n" +
                        "    &lt;TimePicker\n" +
                        "        android:id=&quot;@+id/timePicker&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_above=&quot;@+id/textView1&quot;\n" +
                        "        android:paddingTop=&quot;20dp&quot;\n" +
                        "        android:layout_centerHorizontal=&quot;true&quot;\n" +
                        "        android:layout_marginBottom=&quot;36dp&quot; /&gt;\n" +
                        "&lt;/RelativeLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.timepickerexample;\n" +
                        "\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.TextView;\n" +
                        "import android.widget.TimePicker;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    TextView textview1;\n" +
                        "    TimePicker timepicker;\n" +
                        "    Button changetime;\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        textview1=(TextView)findViewById(R.id.textView1);\n" +
                        "        timepicker=(TimePicker)findViewById(R.id.timePicker);\n" +
                        "        //Uncomment the below line of code for 24 hour view\n" +
                        "        timepicker.setIs24HourView(true);\n" +
                        "        changetime=(Button)findViewById(R.id.button1);\n" +
                        "\n" +
                        "        textview1.setText(getCurrentTime());\n" +
                        "\n" +
                        "        changetime.setOnClickListener(new View.OnClickListener(){\n" +
                        "            @Override\n" +
                        "            public void onClick(View view) {\n" +
                        "                textview1.setText(getCurrentTime());\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "\n" +
                        "    public String getCurrentTime(){\n" +
                        "        String currentTime=\"Current Time: \"+timepicker.getCurrentHour()+\":\"+timepicker.getCurrentMinute();\n" +
                        "        return currentTime;\n" +
                        "    }\n" +
                        "}</pre>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=timepicker_img.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=timepicker_img1.png height=500 width=300/>\n" +
                        "\n"));
         mTutorialData.put("Android SeekBar",new TabDetailsPojoClass(
                 "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">SeekBar</h1> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; &nbsp;↳ android.view.View<br />&nbsp; &nbsp; &nbsp;&nbsp;↳ android.widget.ProgressBar<br />&nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.AbsSeekBar<br />&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.SeekBar</pre> <p>In Android,&nbsp;<strong>SeekBar</strong>&nbsp;is an extension of ProgressBar&nbsp;control with a draggable thumb. The SeekBar allows users to touch the thumb and drag left or right to set the current progress levels.&nbsp;</p> <p>The android SeekBar is one of the useful UI element and it provides a user interface to select the integer values within the defined range.</p> <p>By using the draggable thumb in SeekBar we can slide left or right to choose a value between&nbsp;<strong>0</strong>&nbsp;and&nbsp;<strong>maximum</strong>&nbsp;integer value which we defined using&nbsp;<strong>android:max</strong>&nbsp;attribute. An example of SeekBar is our device Brightness control or volume control.&nbsp;</p> <p>In Android, by using&nbsp;<strong>SeekBar.OnSeekBarChangeListener</strong>&nbsp;listener, we can notify the client when the progress level of SeekBar has been changed.</p> <p><strong>SeekBar code in XML:</strong></p> <pre class=\"prettyprint\">&lt;SeekBar\n" +
                         "android:id=&quot;@+id/simpleSeekBar&quot;\n" +
                         "android:layout_width=&quot;fill_parent&quot;\n" +
                         "android:layout_height=&quot;wrap_content&quot; /&gt;</pre> <h2><span style=\"text-decoration: underline;\">SeekBar Attributes</span></h2> <table border=\"1\"> <thead> <tr> <th>Attribute</th> <th>Description</th> </tr> </thead> <tbody> <tr> <td>android:id</td> <td>It is used to uniquely identify the control</td> </tr> <tr> <td>android:indeterminate</td> <td>It is used to show the cyclic animation in SeekBar without an indication of progress.</td> </tr> <tr> <td>android:max</td> <td>It is used to set the maximum value of SeekBar.</td> </tr> <tr> <td>android:progress</td> <td>It is used to set the default progress value between 0 and max. It must be an integer value.</td> </tr> <tr> <td>android:padding</td> <td>It is used to set the padding for left, right, top or bottom of SeekBar.</td> </tr> <tr> <td>android:progressDrawable</td> <td>It is used to set the custom drawable xml for the progress mode of a seekbar.</td> </tr> <tr> <td>android:thumb</td> <td>It is used to set the thumb icon on seekbar to drag left or right.</td> </tr> <tr> <td>android:background</td> <td>It is used to set the background color for SeekBar</td> </tr> </tbody> </table>",
                 "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                         "&lt;android.support.constraint.ConstraintLayout\n" +
                         "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                         "    xmlns:app=&quot;http://schemas.android.com/apk/res-auto&quot;\n" +
                         "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                         "    android:layout_width=&quot;match_parent&quot;\n" +
                         "    android:layout_height=&quot;match_parent&quot;\n" +
                         "    tools:context=&quot;.MainActivity&quot;&gt;\n" +
                         "\n" +
                         "    &lt;SeekBar\n" +
                         "        android:id=&quot;@+id/seekBar&quot;\n" +
                         "        android:layout_width=&quot;match_parent&quot;\n" +
                         "        android:layout_height=&quot;wrap_content&quot;\n" +
                         "        android:layout_marginEnd=&quot;8dp&quot;\n" +
                         "        android:layout_marginStart=&quot;8dp&quot;\n" +
                         "        android:layout_marginTop=&quot;232dp&quot;\n" +
                         "        app:layout_constraintEnd_toEndOf=&quot;parent&quot;\n" +
                         "        app:layout_constraintHorizontal_bias=&quot;0.0&quot;\n" +
                         "        app:layout_constraintStart_toStartOf=&quot;parent&quot;\n" +
                         "        app:layout_constraintTop_toTopOf=&quot;parent&quot; /&gt;\n" +
                         "&lt;/android.support.constraint.ConstraintLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.seekbarexample;\n" +
                         "\n" +
                         "import android.support.v7.app.AppCompatActivity;\n" +
                         "import android.os.Bundle;\n" +
                         "import android.widget.SeekBar;\n" +
                         "import android.widget.Toast;\n" +
                         "\n" +
                         "public class MainActivity extends AppCompatActivity {\n" +
                         "    SeekBar seekBar;\n" +
                         "    @Override\n" +
                         "    protected void onCreate(Bundle savedInstanceState) {\n" +
                         "        super.onCreate(savedInstanceState);\n" +
                         "        setContentView(R.layout.activity_main);\n" +
                         "\n" +
                         "        seekBar=(SeekBar)findViewById(R.id.seekBar);\n" +
                         "        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {\n" +
                         "            @Override\n" +
                         "            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {\n" +
                         "                Toast.makeText(getApplicationContext(),\"seekbar progress: \"+progress, Toast.LENGTH_SHORT).show();\n" +
                         "            }\n" +
                         "            @Override\n" +
                         "            public void onStartTrackingTouch(SeekBar seekBar) {\n" +
                         "                Toast.makeText(getApplicationContext(),\"seekbar touch started!\", Toast.LENGTH_SHORT).show();\n" +
                         "            }\n" +
                         "            @Override\n" +
                         "            public void onStopTrackingTouch(SeekBar seekBar) {\n" +
                         "                Toast.makeText(getApplicationContext(),\"seekbar touch stopped!\", Toast.LENGTH_SHORT).show();\n" +
                         "            }\n" +
                         "        });\n" +
                         "    }\n" +
                         "}</pre>",
                 "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=seekbar_img.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=seekbar_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=seekbar_img2.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=seekbar_img3.png height=500 width=300/>\n"));
        mTutorialData.put("Android RatingBar",new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">RatingBar</h1> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; &nbsp;↳ android.view.View<br />&nbsp; &nbsp; &nbsp;&nbsp;↳ android.widget.ProgressBar<br />&nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.AbsSeekBar<br />&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.RatingBar</pre> <p>In Android,&nbsp;<strong>RatingBar</strong>&nbsp;is a UI control which is used to get the rating from the user. The&nbsp;<strong>RatingBar</strong>&nbsp;is an extension of SeekBar&nbsp;and ProgressBar&nbsp;that shows a rating in stars and it allows users to set the rating value by touch or click on the stars.&nbsp;</p> <p>The android&nbsp;<strong>RatingBar</strong>&nbsp;will always return a rating value as floating point number such as 1.0, 2.0, 2.5, 3.0, 3.5, etc.</p> <p>By using&nbsp;<strong>android:numStars</strong>&nbsp;attribute we can define the number of stars to display in&nbsp;<strong>RatingBar</strong>. An example of using RatingBar is in movie sites or product sites to collect the user rating about the movies or products, etc.&nbsp;</p> <p>By using&nbsp;<strong>android.widget.RatingBar</strong>&nbsp;component we can display the rating bar with star icons.</p> <p><strong>RatingBar code in XML:</strong></p> <pre class=\"prettyprint\">&lt;RatingBar\n" +
                        "android:id=&quot;@+id/simpleRatingBar&quot;\n" +
                        "android:layout_width=&quot;wrap_content&quot;\n" +
                        "android:layout_height=&quot;wrap_content&quot; /&gt;</pre> <p><strong>Get RatingBar Value:</strong></p> <p>In Android, by using&nbsp;<strong>RatingBar</strong>&nbsp;methods (<strong>getNumStars()</strong>,&nbsp;<strong>getRating()</strong>) we can get the number of stars and the rating value which was selected.</p> <pre class=\"prettyprint\">int noofstars = rBar.getNumStars();\n" +
                        "float getrating = rBar.getRating();\n" +
                        "tView.setText(\"Rating: \"+getrating+\"/\"+noofstars);</pre> <h2><span style=\"text-decoration: underline;\">RatingBar Attributes</span></h2> <table border=\"1\"> <thead> <tr> <th>Attribute</th> <th>Description</th> </tr> </thead> <tbody> <tr> <td>android:id</td> <td>It is used to uniquely identify the control</td> </tr> <tr> <td>android:numStars</td> <td>It is used to define a number of stars to display.</td> </tr> <tr> <td>android:rating</td> <td>It is used to set the default rating value for RatingBar.</td> </tr> <tr> <td>android:background</td> <td>It is used to set the background color for RatingBar.</td> </tr> <tr> <td>android:padding</td> <td>It is used to set the padding for left, right, top or bottom of RatingBar.</td> </tr> </tbody> </table>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;RelativeLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;&gt;\n" +
                        "    &lt;RatingBar\n" +
                        "        android:id=&quot;@+id/ratingBar1&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_marginLeft=&quot;80dp&quot;\n" +
                        "        android:layout_marginTop=&quot;200dp&quot;\n" +
                        "        android:numStars=&quot;5&quot;\n" +
                        "        android:rating=&quot;3.5&quot;/&gt;\n" +
                        "    &lt;Button\n" +
                        "        android:id=&quot;@+id/btnGet&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_alignLeft=&quot;@+id/ratingBar1&quot;\n" +
                        "        android:layout_below=&quot;@+id/ratingBar1&quot;\n" +
                        "        android:layout_marginTop=&quot;30dp&quot;\n" +
                        "        android:layout_marginLeft=&quot;60dp&quot;\n" +
                        "        android:text=&quot;Get Rating&quot;/&gt;\n" +
                        "    &lt;TextView\n" +
                        "        android:id=&quot;@+id/textview1&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_alignLeft=&quot;@+id/btnGet&quot;\n" +
                        "        android:layout_below=&quot;@+id/btnGet&quot;\n" +
                        "        android:layout_marginTop=&quot;20dp&quot;\n" +
                        "        android:textSize=&quot;20dp&quot;\n" +
                        "        android:textStyle=&quot;bold&quot;/&gt;\n" +
                        "&lt;/RelativeLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.ratingbarexample;\n" +
                        "\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.RatingBar;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    private RatingBar rBar;\n" +
                        "    private TextView tView;\n" +
                        "    private Button btn;\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        rBar = (RatingBar) findViewById(R.id.ratingBar1);\n" +
                        "        tView = (TextView) findViewById(R.id.textview1);\n" +
                        "        btn = (Button)findViewById(R.id.btnGet);\n" +
                        "        btn.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                int noofstars = rBar.getNumStars();\n" +
                        "                float getrating = rBar.getRating();\n" +
                        "                tView.setText(\"Rating: \"+getrating+\"/\"+noofstars);\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}</pre>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=ratingbar_img.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=ratingbar_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=ratingbar_img2.png height=500 width=300/>\n"));
        mTutorialData.put("Android TextClock",new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">TextClock</h1> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; &nbsp;↳ android.view.View<br />&nbsp; &nbsp; &nbsp;&nbsp;↳ android.widget.TextView<br />&nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.TextClock&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;</pre> <p>In Android,&nbsp;<strong>TextClock</strong>&nbsp;is a UI control which is used to show the current date or time as a formatted string.</p> <p>The TextClock provides a date/time in two formats, one is to show the date/time in 24 Hour format and another one is to show the date/time in 12-hour format.</p> <p>By using the&nbsp;<strong>is24HourModeEnabled()</strong>&nbsp;method, we can easily know whether the system using TextClock in&nbsp;<strong>24 Hours</strong>&nbsp;format or&nbsp;<strong>12 Hours </strong>format.</p> <p><strong>TextClock code in XML:</strong></p> <pre class=\"prettyprint\">&lt;TextClock\n" +
                        "    android:id=&quot;@+id/textClock&quot;\n" +
                        "    android:layout_width=&quot;wrap_content&quot;\n" +
                        "    android:layout_height=&quot;wrap_content&quot;\n" +
                        "    android:format12Hour=&quot;hh:mm:ss a&quot; /&gt;</pre> <h2><span style=\"text-decoration: underline;\">TextClock Attributes</span></h2> <table border=\"1\"> <tbody> <tr> <td>android:id</td> <td>It is used to uniquely identify the control</td> </tr> <tr> <td>android:format12Hour</td> <td>It is used to specify the formatting pattern to show the time in 12-hour mode.</td> </tr> <tr> <td>android:format24Hour</td> <td>It is used to specify the formatting pattern to show the time in 24 hours mode.</td> </tr> <tr> <td>android:gravity</td> <td>It is used to specify how to align the text like left, right, center, top, etc.</td> </tr> <tr> <td>android:textColor</td> <td>It is used to change the color of the text.</td> </tr> <tr> <td>android:textSize</td> <td>It is used to specify the size of the text.</td> </tr> <tr> <td>android:textStyle</td> <td>It is used to change the style (bold, italic, bolditalic) of text.</td> </tr> <tr> <td>android:background</td> <td>It is used to set the background color for textclock control.</td> </tr> <tr> <td>android:padding</td> <td>It is used to set the padding from left, right, top and bottom.</td> </tr> </tbody> </table>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><p>Following is the example of defining two&nbsp;<strong>TextClock</strong>&nbsp;controls, one Button&nbsp;control and one Textview control in RelativeLayout to get the time from TextClock on Button click.</p> <p>The android&nbsp;<strong>TextClock</strong>&nbsp;has been introduced in API Level 17 so if we use TextClock in our app then it requires a minimum API Level 17. In case if your app SDK version is less than 17 then TextClock will throw an error like &ldquo;<strong>View Required API Level 17</strong>&rdquo;.&nbsp;</p> <p>To fix this error we need to update SDK version of our app for that just double click on&nbsp;<strong>build.gradle(Module: app)</strong>&nbsp;file in application&nbsp;<strong>Gradle Scripts</strong>&nbsp;section like as shown below.</p> <p><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"textclock_img.png\" width=\"320\" height=\"300\" /></p> <p>Once you open build.gradle(<strong>Module: app</strong>) file update <strong>minSDKVersion&nbsp;</strong>to update&nbsp;<strong>minSDKVersion</strong>&nbsp;to&nbsp;<strong>17</strong>&nbsp;or more and click&nbsp;<strong>Sync</strong>&nbsp;<strong>Now</strong>&nbsp;like as shown below.</p> <p><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"textclock_img1.png\" width=\"350\" height=\"300\" /></p> <p>Once you update SDK version then &ldquo;<strong>View Required API Level 17</strong>&rdquo; problem will get solved automatically. Let's see the example below:</p> <h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;RelativeLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;&gt;\n" +
                        "    &lt;TextClock\n" +
                        "        android:id=&quot;@+id/textClock1&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_marginTop=&quot;100dp&quot;\n" +
                        "        android:layout_marginLeft=&quot;70dp&quot;\n" +
                        "        android:format12Hour=&quot;hh:mm:ss a&quot;\n" +
                        "        android:textColor=&quot;#F1511B&quot;\n" +
                        "        android:textSize=&quot;45dp&quot;\n" +
                        "        android:textStyle=&quot;bold&quot; /&gt;\n" +
                        "    &lt;TextClock\n" +
                        "        android:id=&quot;@+id/textClock2&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_marginTop=&quot;30dp&quot;\n" +
                        "        android:layout_marginLeft=&quot;100dp&quot;\n" +
                        "        android:layout_below=&quot;@+id/textClock1&quot;\n" +
                        "        android:textColor=&quot;#80CC28&quot;\n" +
                        "        android:textSize=&quot;45dp&quot;\n" +
                        "        android:textStyle=&quot;bold&quot; /&gt;\n" +
                        "    &lt;Button\n" +
                        "        android:id=&quot;@+id/btnGet&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_alignLeft=&quot;@+id/textClock2&quot;\n" +
                        "        android:layout_below=&quot;@+id/textClock2&quot;\n" +
                        "        android:layout_marginTop=&quot;30dp&quot;\n" +
                        "        android:layout_marginLeft=&quot;40dp&quot;\n" +
                        "        android:text=&quot;Get Time&quot;/&gt;\n" +
                        "    &lt;TextView\n" +
                        "        android:id=&quot;@+id/textview1&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_alignLeft=&quot;@+id/btnGet&quot;\n" +
                        "        android:layout_below=&quot;@+id/btnGet&quot;\n" +
                        "        android:layout_marginTop=&quot;20dp&quot;\n" +
                        "        android:layout_marginLeft=&quot;-30dp&quot;\n" +
                        "        android:textSize=&quot;20dp&quot;\n" +
                        "        android:textStyle=&quot;bold&quot;/&gt;\n" +
                        "&lt;/RelativeLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.textclockexample;\n" +
                        "\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.TextClock;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    private TextClock tClock;\n" +
                        "    private TextView tView;\n" +
                        "    private Button btn;\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        tClock = (TextClock) findViewById(R.id.textClock1);\n" +
                        "        tView = (TextView) findViewById(R.id.textview1);\n" +
                        "        btn = (Button)findViewById(R.id.btnGet);\n" +
                        "        btn.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                tView.setText(\"Time: \"+tClock.getText());\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}</pre>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=textclock_img2.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=textclock_img3.png height=500 width=300/>\n"));
        mTutorialData.put("Android Switch",new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">Switch(On/Off)</h1> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; &nbsp;↳ android.view.View<br />&nbsp; &nbsp; &nbsp;&nbsp;↳ android.widget.TextView<br />&nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.Button<br />&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.CompoundButton<br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↳ android.widget.Switch</pre> <p>In Android,&nbsp;<strong>Switch</strong>&nbsp;is a two-state user interface element which is used to display&nbsp;<strong>ON</strong>&nbsp;(<strong>Checked</strong>) or&nbsp;<strong>OFF</strong>&nbsp;(<strong>Unchecked</strong>) states as a button with thumb slider. By using&nbsp;<strong>thumb</strong>, the user may drag back and forth to choose an option either&nbsp;<strong>ON</strong>&nbsp;or&nbsp;<strong>OFF</strong>.&nbsp;</p> <p>The&nbsp;<strong>Switch</strong>&nbsp;element is useful for the users to change the settings between two states either&nbsp;<strong>ON</strong>&nbsp;or&nbsp;<strong>OFF</strong>. We can add a&nbsp;<strong>Switch</strong>&nbsp;to our application layout by using a&nbsp;<strong>Switch</strong>&nbsp;object.</p> <p>The android&nbsp;<strong>Switch</strong>&nbsp;will be in&nbsp;<strong>OFF</strong>&nbsp;(<strong>Unchecked</strong>) state. We can change the default state of&nbsp;<strong>Switch</strong>&nbsp;by using&nbsp;<strong>android:checked </strong>attribute.&nbsp;</p> <p>In case, if we want to change the state of Switch to&nbsp;<strong>ON</strong>&nbsp;(<strong>Checked</strong>), then we need to set&nbsp;<strong>android:checked = &ldquo;true&rdquo;</strong>&nbsp;in our XML layout file.</p> <p><strong>Switch code in XML:</strong></p> <pre class=\"prettyprint\">&lt;Switch\n" +
                        "android:id=&quot;@+id/simpleSwitch&quot;\n" +
                        "android:layout_width=&quot;wrap_content&quot;\n" +
                        "android:layout_height=&quot;wrap_content&quot;/&gt;</pre> <h2><span style=\"text-decoration: underline;\">Switch Attributes</span></h2> <table border=\"1\"> <thead> <tr> <th>Attribute</th> <th>Description</th> </tr> </thead> <tbody> <tr> <td>android:id</td> <td>It is used to uniquely identify the control</td> </tr> <tr> <td>android:checked</td> <td>It is used to specify the current state of switch control</td> </tr> <tr> <td>android:gravity</td> <td>It is used to specify how to align the text like left, right, center, top, etc.</td> </tr> <tr> <td>android:text</td> <td>It is used to set the text.</td> </tr> <tr> <td>android:textOn</td> <td>It is used to set the text when the toggle button is in ON / Checked state.</td> </tr> <tr> <td>android:textOff</td> <td>It is used to set the text when the toggle button is in the OFF / Unchecked state.</td> </tr> <tr> <td>android:textColor</td> <td>It is used to change the color of the text.</td> </tr> <tr> <td>android:textSize</td> <td>It is used to specify the size of the text.</td> </tr> <tr> <td>android:textStyle</td> <td>It is used to change the style (bold, italic, bold-italic) of text.</td> </tr> <tr> <td>android:background</td> <td>It is used to set the background color for toggle button control.</td> </tr> <tr> <td>android:padding</td> <td>It is used to set the padding from left, right, top and bottom.</td> </tr> <tr> <td>android:drawableBottom</td> <td>It&rsquo;s drawable to be drawn to the below of the text.</td> </tr> <tr> <td>android:drawableRight</td> <td>It&rsquo;s drawable to be drawn to the right of the text.</td> </tr> <tr> <td>android:drawableLeft</td> <td>It&rsquo;s drawable to be drawn to the left of the text.</td> </tr> </tbody> </table>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;RelativeLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;&gt;\n" +
                        "    &lt;Switch\n" +
                        "        android:id=&quot;@+id/switch1&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:switchMinWidth=&quot;56dp&quot;\n" +
                        "        android:layout_marginLeft=&quot;100dp&quot;\n" +
                        "        android:layout_marginTop=&quot;120dp&quot;\n" +
                        "        android:text=&quot;Switch1:&quot;\n" +
                        "        android:checked=&quot;true&quot;\n" +
                        "        android:textOff=&quot;OFF&quot;\n" +
                        "        android:textOn=&quot;ON&quot;/&gt;\n" +
                        "    &lt;Switch\n" +
                        "        android:id=&quot;@+id/switch2&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:switchMinWidth=&quot;56dp&quot;\n" +
                        "        android:layout_below=&quot;@+id/switch1&quot;\n" +
                        "        android:layout_alignLeft=&quot;@+id/switch1&quot;\n" +
                        "        android:text=&quot;Switch2:&quot;\n" +
                        "        android:textOff=&quot;OFF&quot;\n" +
                        "        android:textOn =&quot;ON&quot;/&gt;\n" +
                        "    &lt;Button\n" +
                        "        android:id=&quot;@+id/getBtn&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_marginLeft=&quot;150dp&quot;\n" +
                        "        android:layout_marginTop=&quot;200dp&quot;\n" +
                        "        android:text=&quot;Get&quot; /&gt;\n" +
                        "&lt;/RelativeLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.switchexample;\n" +
                        "\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.Switch;\n" +
                        "import android.widget.Toast;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    private Switch sw1,sw2;\n" +
                        "    private  Button btnGet;\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        sw1 = (Switch)findViewById(R.id.switch1);\n" +
                        "        sw2 = (Switch)findViewById(R.id.switch2);\n" +
                        "        btnGet = (Button)findViewById(R.id.getBtn);\n" +
                        "        btnGet.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                String str1, str2;\n" +
                        "                if (sw1.isChecked())\n" +
                        "                    str1 = sw1.getTextOn().toString();\n" +
                        "                else\n" +
                        "                    str1 = sw1.getTextOff().toString();\n" +
                        "                if (sw2.isChecked())\n" +
                        "                    str2 = sw2.getTextOn().toString();\n" +
                        "                else\n" +
                        "                    str2 = sw2.getTextOff().toString();\n" +
                        "                Toast.makeText(getApplicationContext(), \"Switch1 -  \" + str1 + \" \\n\" + \"Switch2 - \" + str2,Toast.LENGTH_SHORT).show();\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}</pre>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=switch_img.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=switch_img1.png height=500 width=300/>\n"));
        mTutorialData.put("Android AlertDialog",new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">AlertDialog</h1> <hr /> <pre class=\"prettyprint\">java.lang.Object<br />&nbsp; &nbsp;↳ android.app.Dialog<br />&nbsp; &nbsp; &nbsp;&nbsp;↳ android.app.AlertDialog</pre> <p>In Android, <strong>Dialog</strong>&nbsp;is a small window that prompt messages to the user to make a decision or enter additional details. Generally, the Dialogs are used with modals event and these useful to prompt users to perform a particular action to proceed further in the application.</p> <p>The&nbsp;<strong>AutoCompleteTextView</strong>&nbsp;is a subclass of EditText&nbsp;class so we can inherit all the properties of EditText&nbsp;in AutoCompleteTextView based on our requirements.</p> <p>Android AlertDialog is composed of three regions: title, content area, and action buttons.</p> <table border=\"1\"> <thead> <tr> <th>Region</th> <th>Description</th> </tr> </thead> <tbody> <tr> <td>Title</td> <td>It&rsquo;s optional and it can be used to show the detailed messages based on our requirements.</td> </tr> <tr> <td>Content Area</td> <td>It is used to display a message, list or other custom layouts based on our requirements.</td> </tr> <tr> <td>Action Buttons</td> <td>It is used to display an action button to interact with the users. We can use up to 3 different action buttons in AlertDialog, such as positive, negative and neutral.</td> </tr> </tbody> </table> <p><strong>AlertDialog Methods:</strong></p> <table border=\"1\"> <thead> <tr> <th>Method</th> <th>Description</th> </tr> </thead> <tbody> <tr> <td>setTitle()</td> <td>It is used to set the title of AlertDialog and its an optional component.</td> </tr> <tr> <td>setIcon()</td> <td>It is used to set the icon before the title</td> </tr> <tr> <td>setMessage()</td> <td>It is used to set the message required a message to display in AlertDialog.</td> </tr> <tr> <td>setCancelable()</td> <td>It is used to allow users to cancel AlertDialog by clicking on outside of dialog area by setting true/false.</td> </tr> <tr> <td>setPositiveButton()</td> <td>It is used to set the positive button for AlertDialog and we can implement click event of a positive button.</td> </tr> <tr> <td>setNegativeButton()</td> <td>It is used to set the negative button for AlertDialog and we can implement click event of a negative button.</td> </tr> <tr> <td>setNeutralButton()</td> <td>It is used to set the neutral button for AlertDialog and we can implement click event of a neutral button.</td> </tr> </tbody> </table>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;android.support.constraint.ConstraintLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    xmlns:app=&quot;http://schemas.android.com/apk/res-auto&quot;\n" +
                        "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;\n" +
                        "    tools:context=&quot;.MainActivity&quot;&gt;\n" +
                        "    &lt;Button\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:id=&quot;@+id/button&quot;\n" +
                        "        android:text=&quot;Close app&quot;\n" +
                        "        app:layout_constraintBottom_toBottomOf=&quot;parent&quot;\n" +
                        "        app:layout_constraintLeft_toLeftOf=&quot;parent&quot;\n" +
                        "        app:layout_constraintRight_toRightOf=&quot;parent&quot;\n" +
                        "        app:layout_constraintTop_toTopOf=&quot;parent&quot;/&gt;\n" +
                        "&lt;/android.support.constraint.ConstraintLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.alertdialogexample;\n" +
                        "\n" +
                        "import android.content.DialogInterface;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.app.AlertDialog;\n" +
                        "import android.widget.Toast;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    Button closeButton;\n" +
                        "    AlertDialog.Builder builder;\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        closeButton = (Button) findViewById(R.id.button);\n" +
                        "        builder = new AlertDialog.Builder(this);\n" +
                        "        closeButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "\n" +
                        "                //Uncomment the below code to Set the message and title from the strings.xml file\n" +
                        "                builder.setMessage(\"Welcome to Alert Dialog\") .setTitle(\"Alert Dialog\");\n" +
                        "\n" +
                        "                //Setting message manually and performing action on button click\n" +
                        "                builder.setMessage(\"Do you want to close this application ?\")\n" +
                        "                        .setCancelable(false)\n" +
                        "                        .setPositiveButton(\"Yes\", new DialogInterface.OnClickListener() {\n" +
                        "                            public void onClick(DialogInterface dialog, int id) {\n" +
                        "                                finish();\n" +
                        "                                Toast.makeText(getApplicationContext(),\"you choose Yes action for AlertDialog\",\n" +
                        "                                        Toast.LENGTH_LONG).show();\n" +
                        "                            }\n" +
                        "                        })\n" +
                        "                        .setNegativeButton(\"No\", new DialogInterface.OnClickListener() {\n" +
                        "                            public void onClick(DialogInterface dialog, int id) {\n" +
                        "                                //  Action for 'NO' Button\n" +
                        "                                dialog.cancel();\n" +
                        "                                Toast.makeText(getApplicationContext(),\"you choose NO action for AlertDialog\",\n" +
                        "                                        Toast.LENGTH_LONG).show();\n" +
                        "                            }\n" +
                        "                        });\n" +
                        "                //Creating dialog box\n" +
                        "                AlertDialog alert = builder.create();\n" +
                        "                //Setting the title manually\n" +
                        "                alert.setTitle(\"AlertDialogExample\");\n" +
                        "                alert.show();\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}</pre>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=alert_img.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=alert_img1.png height=500 width=300/></br><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=alert_img2.png height=500 width=300/>"));
        mTutorialData.put("Android Shared Preferences",new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">Shared Preferences</h1> <hr /> <p>In Android, <strong>Shared Preferences</strong>&nbsp;are used to save and retrieve the primitive data types (integer, float, Boolean, String, long) data in the form of key-value pair from a file within an apps file structure.</p> <p>Android&nbsp;Shared Preferences&nbsp;object will point to a file that contains key-value pairs and provides a simple read and write methods to save and retrieve the key-value pairs from a file.&nbsp;</p> <p>The Shared Preferences are useful to store the small collection of key-values such as user&rsquo;s login information, app preferences related to users, etc. to maintain the state of the app, next time when they login again to the app.</p> <p><strong>Shared Preferences Method:</strong></p> <table border=\"1\"> <thead> <tr> <th>Method</th> <th>Description</th> </tr> </thead> <tbody> <tr> <td>getPreferences()</td> <td> <p>This method is for activity level preferences and each activity will have its own preference file and by default, this method retrieves a default shared preference file that belongs to the activity.</p> <p><strong>Syntax:</strong></p> <pre class=\"prettyprint\">SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);</pre> </td> </tr> <tr> <td>getSharedPreferences()</td> <td> <p>This method is useful to get the values from multiple shared preference files by passing the name as a parameter to identify the file. We can call this from any Context in our app.</p> <p><strong>Syntax:</strong></p> <pre class=\"prettyprint\">SharedPreferences sharedPref = getSharedPreferences(\"filename1\",Context.MODE_PRIVATE);</pre> </td> </tr> <tr> <td colspan=\"2\">Here, the name &ldquo;<strong>filename1</strong>&rdquo; is the preference file, which wants to read the values based on our requirements and the context mode&nbsp;<strong>MODE_PRIVATE</strong>, will make sure that the file can be accessed only within our application.</td> </tr> </tbody> </table><br/><br/> <table border=1> <tbody> <tr> <td style=\"text-align: center;\">&nbsp;<strong>Shared Preferences</strong></td> <td style=\"text-align: center;\"><strong>Code</strong>&nbsp;</td> </tr> <tr> <td> <p><strong>Write:&nbsp;</strong></p> <p>To store data in a shared preference file.</p> </td> <td> <pre class=\"prettyprint\">SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);\n" +
                        "SharedPreferences.Editor editor = sharedPref.edit();\n" +
                        "editor.putBoolean(\"keyname\",true);\n" +
                        "editor.putString(\"keyname\",\"string value\");\n" +
                        "editor.putInt(\"keyname\",\"int value\");\n" +
                        "editor.putFloat(\"keyname\",\"float value\");\n" +
                        "editor.putLong(\"keyname\",\"long value\");\n" +
                        "editor.commit();</pre> </td> </tr> <tr> <td> <p><strong>Read:</strong></p> <p>To read or retrieve a value from Shared Preferences file</p> </td> <td> <pre class=\"prettyprint\">SharedPreferences pref = getPreferences(Context.MODE_PRIVATE);\n" +
                        "pref.getString(\"keyname\",null);\n" +
                        "pref.getInt(\"keyname\",0);\n" +
                        "pref.getFloat(\"keyname\",0);\n" +
                        "pref.getBoolean(\"keyname\",true);\n" +
                        "pref.getLong(\"keyname\",0);</pre> </td> </tr> <tr> <td> <p><strong>Delete:</strong></p> <p>To delete a value from the Shared Preferences file.</p> </td> <td> <pre class=\"prettyprint\">SharedPreferences pref = getPreferences(Context.MODE_PRIVATE);\n" +
                        "SharedPreferences.Editor editor = pref.edit();\n" +
                        "editor.remove(\"keyname\");\n" +
                        "editor.commit();</pre> </td> </tr> <tr> <td> <p><strong>Clear:</strong></p> <p>We can clear all the data from Shared Preferences file.</p> </td> <td> <pre class=\"prettyprint\">SharedPreferences pref = getPreferences(Context.MODE_PRIVATE);\n" +
                        "SharedPreferences.Editor editor = pref.edit();\n" +
                        "editor.clear();\n" +
                        "editor.commit();</pre> </td> </tr> </tbody> </table>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;RelativeLayout \n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;\n" +
                        "    tools:context=&quot;MainActivity&quot;&gt;\n" +
                        "    &lt;TextView\n" +
                        "        android:id=&quot;@+id/txtPrefs&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_centerVertical=&quot;true&quot;\n" +
                        "        android:text=&quot;Data:&quot; /&gt;\n" +
                        "    &lt;Button\n" +
                        "        android:id=&quot;@+id/storeinformation&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_below=&quot;@+id/showinformation&quot;\n" +
                        "        android:layout_centerHorizontal=&quot;true&quot;\n" +
                        "        android:layout_marginTop=&quot;18dp&quot;\n" +
                        "        android:text=&quot;Store Information&quot; /&gt;\n" +
                        "    &lt;Button\n" +
                        "        android:id=&quot;@+id/showinformation&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_alignParentTop=&quot;true&quot;\n" +
                        "        android:layout_centerHorizontal=&quot;true&quot;\n" +
                        "        android:layout_marginTop=&quot;17dp&quot;\n" +
                        "        android:text=&quot;Show Information&quot; /&gt;\n" +
                        "&lt;/RelativeLayout&gt;</pre> <h2><em>array.xml</em></h2> <p>Create layout resource file&nbsp;inside&nbsp;<strong>\\res\\values </strong>directory.&nbsp;</p> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;resources&gt;\n" +
                        "    &lt;string-array name=&quot;listOptions&quot;&gt;\n" +
                        "        &lt;item&gt;English&lt;/item&gt;\n" +
                        "        &lt;item&gt;Hindi&lt;/item&gt;\n" +
                        "        &lt;item&gt;Other&lt;/item&gt;\n" +
                        "    &lt;/string-array&gt;\n" +
                        "\n" +
                        "    &lt;string-array name=&quot;listValues&quot;&gt;\n" +
                        "        &lt;item&gt;English Language&lt;/item&gt;\n" +
                        "        &lt;item&gt;Hindi Language&lt;/item&gt;\n" +
                        "        &lt;item&gt;Other Language&lt;/item&gt;\n" +
                        "    &lt;/string-array&gt;\n" +
                        "&lt;/resources&gt;</pre> <h2><em>prefs.xml</em></h2> <p>Create layout resource file&nbsp;inside&nbsp;<strong>\\res\\xml&nbsp;</strong>directory.&nbsp;</p> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;PreferenceScreen \n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;&gt;\n" +
                        "    &lt;PreferenceCategory\n" +
                        "        android:summary=&quot;Username and password information&quot;\n" +
                        "        android:title=&quot;Login information&quot; &gt;\n" +
                        "        &lt;EditTextPreference\n" +
                        "            android:key=&quot;username&quot;\n" +
                        "            android:summary=&quot;Please enter your login username&quot;\n" +
                        "            android:title=&quot;Username&quot; /&gt;\n" +
                        "        &lt;EditTextPreference\n" +
                        "            android:key=&quot;password&quot;\n" +
                        "            android:summary=&quot;Enter your password&quot;\n" +
                        "            android:title=&quot;Password&quot; /&gt;\n" +
                        "    &lt;/PreferenceCategory&gt;\n" +
                        "    &lt;PreferenceCategory\n" +
                        "        android:summary=&quot;Username and password information&quot;\n" +
                        "        android:title=&quot;Settings&quot; &gt;\n" +
                        "        &lt;CheckBoxPreference\n" +
                        "            android:key=&quot;checkBox&quot;\n" +
                        "            android:summary=&quot;On/Off&quot;\n" +
                        "            android:title=&quot;Keep me logged in&quot; /&gt;\n" +
                        "        &lt;ListPreference\n" +
                        "            android:entries=&quot;@array/listOptions&quot;\n" +
                        "            android:entryValues=&quot;@array/listValues&quot;\n" +
                        "            android:key=&quot;listpref&quot;\n" +
                        "            android:summary=&quot;List preference example&quot;\n" +
                        "            android:title=&quot;List preference&quot; /&gt;\n" +
                        "    &lt;/PreferenceCategory&gt;\n" +
                        "&lt;/PreferenceScreen&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.sharedpreferencesexample;\n" +
                        "import android.content.Intent;\n" +
                        "import android.content.SharedPreferences;\n" +
                        "import android.preference.PreferenceManager;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    TextView textView;\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        Button storeinformation = (Button) findViewById(R.id.storeinformation);\n" +
                        "        Button showinformation = (Button) findViewById(R.id.showinformation);\n" +
                        "        textView = (TextView) findViewById(R.id.txtPrefs);\n" +
                        "\n" +
                        "        View.OnClickListener listener = new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                switch (v.getId()) {\n" +
                        "                    case R.id.storeinformation:\n" +
                        "                        Intent intent = new Intent(MainActivity.this,PrefsActivity.class);\n" +
                        "                        startActivity(intent);\n" +
                        "                        break;\n" +
                        "                    case R.id.showinformation:\n" +
                        "                        displaySharedPreferences();\n" +
                        "                        break;\n" +
                        "                    default:\n" +
                        "                        break;\n" +
                        "                }\n" +
                        "            }\n" +
                        "        };\n" +
                        "        storeinformation.setOnClickListener(listener);\n" +
                        "        showinformation.setOnClickListener(listener);\n" +
                        "    }\n" +
                        "    \n" +
                        "    private void displaySharedPreferences() {\n" +
                        "        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);\n" +
                        "        String username = prefs.getString(\"username\", \"Default NickName\");\n" +
                        "        String passw = prefs.getString(\"password\", \"Default Password\");\n" +
                        "        boolean checkBox = prefs.getBoolean(\"checkBox\", false);\n" +
                        "        String listPrefs = prefs.getString(\"listpref\", \"Default list prefs\");\n" +
                        "\n" +
                        "\n" +
                        "        StringBuilder builder = new StringBuilder();\n" +
                        "        builder.append(\"Username: \" + username + \"\\n\");\n" +
                        "        builder.append(\"Password: \" + passw + \"\\n\");\n" +
                        "        builder.append(\"Keep me logged in: \" + String.valueOf(checkBox) + \"\\n\");\n" +
                        "        builder.append(\"List preference: \" + listPrefs);\n" +
                        "        textView.setText(builder.toString());\n" +
                        "    }\n" +
                        "}</pre> <h2><em>PrefsActivity.java</em></h2> <p>Create another activity file right click on your application folder (\\java\\com.hd.sharedpreferencesexample) -&gt;<strong>&nbsp;</strong>Go to&nbsp;<strong>New</strong> -&gt;&nbsp;<strong>Java Class</strong> and give name as <strong>PrefsActivity.java</strong>.&nbsp;</p> <pre class=\"prettyprint\">package com.hd.sharedpreferencesexample;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.preference.PreferenceActivity;\n" +
                        "\n" +
                        "public class PrefsActivity extends PreferenceActivity {\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        addPreferencesFromResource(R.xml.prefs);\n" +
                        "    }\n" +
                        "}</pre> <h2><em><strong>AndroidManifest.xml</strong></em></h2> <p>Now we need to add this newly created Activity&nbsp;in&nbsp;<strong>AndroidManifest.xml</strong>&nbsp;file in like as shown below.&nbsp;</p> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;manifest xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    package=&quot;com.hd.sharedpreferencesexample&quot;&gt;\n" +
                        "    &lt;application\n" +
                        "        android:allowBackup=&quot;true&quot;\n" +
                        "        android:icon=&quot;@mipmap/ic_launcher&quot;\n" +
                        "        android:label=&quot;@string/app_name&quot;\n" +
                        "        android:roundIcon=&quot;@mipmap/ic_launcher_round&quot;\n" +
                        "        android:supportsRtl=&quot;true&quot;\n" +
                        "        android:theme=&quot;@style/AppTheme&quot;&gt;\n" +
                        "        &lt;activity android:name=&quot;.MainActivity&quot;&gt;\n" +
                        "            &lt;intent-filter&gt;\n" +
                        "                &lt;action android:name=&quot;android.intent.action.MAIN&quot; /&gt;\n" +
                        "\n" +
                        "                &lt;category android:name=&quot;android.intent.category.LAUNCHER&quot; /&gt;\n" +
                        "            &lt;/intent-filter&gt;\n" +
                        "        &lt;/activity&gt;\n" +
                        "        &lt;activity  android:name=&quot;.PrefsActivity&quot;\n" +
                        "            android:theme=&quot;@android:style/Theme.Black.NoTitleBar&quot; &gt;\n" +
                        "        &lt;/activity&gt;\n" +
                        "    &lt;/application&gt;\n" +
                        "&lt;/manifest&gt;</pre>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=sharedprefs_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=sharedprefs_img2.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=sharedprefs_img3.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=sharedprefs_img4.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=sharedprefs_img5.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=sharedprefs_img6.png height=500 width=300/>"));
        mTutorialData.put("Android Internal Storage",new TabDetailsPojoClass(
                "<h1 style=\"text-align: center;\">Internal Storage</h1> <hr /> <p>In Android, <strong>Internal Storage</strong>&nbsp;is useful to store the data files locally on the device&rsquo;s internal memory using a&nbsp;<strong>FileOutputStream</strong>&nbsp;object. After storing the data files in device internal storage, we can read the data file from the device using a&nbsp;<strong>FileInputStream</strong>&nbsp;object.</p> <p>The data files saved in internal storage is managed by an android framework and it can be accessed anywhere within the app to read or write data into the file, but it&rsquo;s not possible to access the file from any other app so it&rsquo;s secured. When the user uninstalls the app, automatically these data files will be removed from the device internal storage.</p> <table border=\"1\"> <thead> <tr> <th>Method</th> <th>Description</th> </tr> </thead> <tbody> <tr> <td>getChannel()</td> <td>It returns the unique FileChannel object associated with this file output stream.</td> </tr> <tr> <td>getFD()</td> <td>It returns the file descriptor which is associated with the stream.</td> </tr> <tr> <td>write(byte[] b, int off, int len)</td> <td>It writes&nbsp;<strong>len</strong>&nbsp;bytes from the specified byte array starting at offset&nbsp;<strong>off</strong>&nbsp;to the file output stream.</td> </tr> <tr> <td>read(byte[] b, int off, int len)</td> <td>It reads&nbsp;<strong>len</strong>&nbsp;bytes of data from the specified file input stream into an array of bytes.</td> </tr> </tbody> </table>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2><em>activity_main.xml</em></h2><pre class=\"prettyprint\">&lt;RelativeLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;\n" +
                        "    tools:context=&quot;.MainActivity&quot; &gt;\n" +
                        "    &lt;EditText\n" +
                        "        android:id=&quot;@+id/editText1&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_alignParentRight=&quot;true&quot;\n" +
                        "        android:layout_alignParentTop=&quot;true&quot;\n" +
                        "        android:layout_marginRight=&quot;20dp&quot;\n" +
                        "        android:layout_marginTop=&quot;24dp&quot;\n" +
                        "        android:ems=&quot;10&quot; &gt;\n" +
                        "    &lt;/EditText&gt;\n" +
                        "    &lt;EditText\n" +
                        "        android:id=&quot;@+id/editText2&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_alignRight=&quot;@+id/editText1&quot;\n" +
                        "        android:layout_below=&quot;@+id/editText1&quot;\n" +
                        "        android:layout_marginTop=&quot;24dp&quot;\n" +
                        "        android:ems=&quot;10&quot; /&gt;\n" +
                        "\n" +
                        "    &lt;TextView\n" +
                        "        android:id=&quot;@+id/textView1&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_alignBaseline=&quot;@+id/editText1&quot;\n" +
                        "        android:layout_alignBottom=&quot;@+id/editText1&quot;\n" +
                        "        android:layout_alignParentLeft=&quot;true&quot;\n" +
                        "        android:text=&quot;File Name:&quot; /&gt;\n" +
                        "    &lt;TextView\n" +
                        "        android:id=&quot;@+id/textView2&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_alignBaseline=&quot;@+id/editText2&quot;\n" +
                        "        android:layout_alignBottom=&quot;@+id/editText2&quot;\n" +
                        "        android:layout_alignParentLeft=&quot;true&quot;\n" +
                        "        android:text=&quot;Data:&quot; /&gt;\n" +
                        "    &lt;Button\n" +
                        "        android:id=&quot;@+id/button1&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_alignLeft=&quot;@+id/editText2&quot;\n" +
                        "        android:layout_below=&quot;@+id/editText2&quot;\n" +
                        "        android:layout_marginLeft=&quot;70dp&quot;\n" +
                        "        android:layout_marginTop=&quot;16dp&quot;\n" +
                        "        android:text=&quot;save&quot; /&gt;\n" +
                        "    &lt;Button\n" +
                        "        android:id=&quot;@+id/button2&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_alignBaseline=&quot;@+id/button1&quot;\n" +
                        "        android:layout_alignBottom=&quot;@+id/button1&quot;\n" +
                        "        android:layout_toRightOf=&quot;@+id/button1&quot;\n" +
                        "        android:text=&quot;read&quot; /&gt;\n" +
                        "&lt;/RelativeLayout&gt;</pre><h2><em>MainActivity.java</em></h2><pre class=\"prettyprint\">package com.hd.internalstoragexample;\n" +
                        "import android.content.Context;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.EditText;\n" +
                        "import android.widget.Toast;\n" +
                        "import java.io.BufferedReader;\n" +
                        "import java.io.FileNotFoundException;\n" +
                        "import java.io.FileOutputStream;\n" +
                        "import java.io.IOException;\n" +
                        "import java.io.InputStreamReader;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    EditText editTextFileName,editTextData;\n" +
                        "    Button saveButton,readButton;\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        editTextFileName=findViewById(R.id.editText1);\n" +
                        "        editTextData=findViewById(R.id.editText2);\n" +
                        "        saveButton=findViewById(R.id.button1);\n" +
                        "        readButton=findViewById(R.id.button2);\n" +
                        "\n" +
                        "        //Performing Action on Read Button\n" +
                        "        saveButton.setOnClickListener(new View.OnClickListener(){\n" +
                        "\n" +
                        "            @Override\n" +
                        "            public void onClick(View arg0) {\n" +
                        "                String filename=editTextFileName.getText().toString();\n" +
                        "                String data=editTextData.getText().toString();\n" +
                        "                FileOutputStream fos;\n" +
                        "                try {\n" +
                        "                    fos = openFileOutput(filename, Context.MODE_PRIVATE);\n" +
                        "                    //default mode is PRIVATE, can be APPEND etc.\n" +
                        "                    fos.write(data.getBytes());\n" +
                        "                    fos.close();\n" +
                        "                    Toast.makeText(getApplicationContext(),filename + \" saved\",\n" +
                        "                            Toast.LENGTH_LONG).show();\n" +
                        "                } catch (FileNotFoundException e){\n" +
                        "                    e.printStackTrace();\n" +
                        "                }\n" +
                        "                catch (IOException e){\n" +
                        "                    e.printStackTrace();\n" +
                        "                }\n" +
                        "            }\n" +
                        "        });\n" +
                        "        //Performing Action on Read Button\n" +
                        "        readButton.setOnClickListener(new View.OnClickListener(){\n" +
                        "            @Override\n" +
                        "            public void onClick(View arg0) {\n" +
                        "                String filename=editTextFileName.getText().toString();\n" +
                        "                StringBuffer stringBuffer = new StringBuffer();\n" +
                        "                try {\n" +
                        "                    //Attaching BufferedReader to the FileInputStream by the help of InputStreamReader\n" +
                        "                    BufferedReader inputReader = new BufferedReader(new InputStreamReader(\n" +
                        "                            openFileInput(filename)));\n" +
                        "                    String inputString;\n" +
                        "                    //Reading data line by line and storing it into the stringbuffer\n" +
                        "                    while ((inputString = inputReader.readLine()) != null) {\n" +
                        "                        stringBuffer.append(inputString + \"\\n\");\n" +
                        "                    }\n" +
                        "\n" +
                        "                } catch (IOException e) {\n" +
                        "                    e.printStackTrace();\n" +
                        "                }\n" +
                        "                //Displaying data on the toast\n" +
                        "                Toast.makeText(getApplicationContext(),stringBuffer.toString(),Toast.LENGTH_LONG).show();\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}</pre>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=internalstorage_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=internalstorage_img2.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=internalstorage_img3.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=internalstorage_img4.png height=500 width=300/>"));
        mTutorialData.put("Android External Storage",new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">External Storage</h1> <hr /> <p>In android,&nbsp;<strong>External Storage</strong>&nbsp;is useful to store the data files publically on the shared external storage using&nbsp;<strong>FileOutputStream</strong>&nbsp;object. After storing the data files on external storage, we can read the data file from external storage media using a&nbsp;<strong>FileInputStream</strong>&nbsp;object.&nbsp;</p> <p>The data files saved in external storage are word-readable and can be modified by the user when they enable USB mass storage to transfer files on a computer.</p> <p><strong>Grant Access to External Storage:</strong></p> <p>To read or write files on the external storage, our app must acquire the&nbsp;<strong>WRITE_EXTERNAL_STORAGE</strong>&nbsp;and&nbsp;<strong>READ_EXTERNAL_STORAGE</strong>system permissions. For that, we need to add following permissions in the android manifest file like as shown below.</p> <pre class=\"prettyprint\">&lt;manifest&gt;\n" +
                        "    ....\n" +
                        "    &lt;uses-permission android:name=&quot;android.permission.WRITE_EXTERNAL_STORAGE&quot;/&gt;\n" +
                        "    &lt;uses-permission android:name=&quot;android.permission.READ_EXTERNAL_STORAGE&quot;/&gt;\n" +
                        "    ....\n" +
                        "&lt;/manifest&gt;</pre>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;RelativeLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;\n" +
                        "    tools:context=&quot;.MainActivity&quot;&gt;\n" +
                        "    &lt;EditText\n" +
                        "        android:id=&quot;@+id/editText1&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_alignParentRight=&quot;true&quot;\n" +
                        "        android:layout_alignParentTop=&quot;true&quot;\n" +
                        "        android:layout_marginRight=&quot;20dp&quot;\n" +
                        "        android:layout_marginTop=&quot;24dp&quot;\n" +
                        "        android:ems=&quot;10&quot; /&gt;\n" +
                        "    &lt;EditText\n" +
                        "        android:id=&quot;@+id/editText2&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_alignRight=&quot;@+id/editText1&quot;\n" +
                        "        android:layout_below=&quot;@+id/editText1&quot;\n" +
                        "        android:layout_marginTop=&quot;24dp&quot;\n" +
                        "        android:ems=&quot;10&quot; /&gt;\n" +
                        "    &lt;TextView\n" +
                        "        android:id=&quot;@+id/textView1&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_alignBaseline=&quot;@+id/editText1&quot;\n" +
                        "        android:layout_alignBottom=&quot;@+id/editText1&quot;\n" +
                        "        android:layout_alignParentLeft=&quot;true&quot;\n" +
                        "        android:text=&quot;File Name:&quot; /&gt;\n" +
                        "    &lt;TextView\n" +
                        "        android:id=&quot;@+id/textView2&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_alignBaseline=&quot;@+id/editText2&quot;\n" +
                        "        android:layout_alignBottom=&quot;@+id/editText2&quot;\n" +
                        "        android:layout_alignParentLeft=&quot;true&quot;\n" +
                        "        android:text=&quot;Data:&quot; /&gt;\n" +
                        "    &lt;Button\n" +
                        "        android:id=&quot;@+id/button1&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_alignLeft=&quot;@+id/editText2&quot;\n" +
                        "        android:layout_below=&quot;@+id/editText2&quot;\n" +
                        "        android:layout_marginLeft=&quot;70dp&quot;\n" +
                        "        android:layout_marginTop=&quot;16dp&quot;\n" +
                        "        android:text=&quot;save&quot; /&gt;\n" +
                        "    &lt;Button\n" +
                        "        android:id=&quot;@+id/button2&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_alignBaseline=&quot;@+id/button1&quot;\n" +
                        "        android:layout_alignBottom=&quot;@+id/button1&quot;\n" +
                        "        android:layout_toRightOf=&quot;@+id/button1&quot;\n" +
                        "        android:text=&quot;read&quot; /&gt;\n" +
                        "&lt;/RelativeLayout&gt;</pre> <h2><em>AndroidManifest.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;manifest xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    package=&quot;com.hd.externalstorageexample&quot;&gt;\n" +
                        "    &lt;uses-permission android:name=&quot;android.permission.WRITE_EXTERNAL_STORAGE&quot;/&gt;\n" +
                        "    &lt;uses-permission android:name=&quot;android.permission.READ_EXTERNAL_STORAGE&quot;/&gt;\n" +
                        "    &lt;application\n" +
                        "        android:allowBackup=&quot;true&quot;\n" +
                        "        android:icon=&quot;@mipmap/ic_launcher&quot;\n" +
                        "        android:label=&quot;@string/app_name&quot;\n" +
                        "        android:roundIcon=&quot;@mipmap/ic_launcher_round&quot;\n" +
                        "        android:supportsRtl=&quot;true&quot;\n" +
                        "        android:theme=&quot;@style/AppTheme&quot;&gt;\n" +
                        "        &lt;activity android:name=&quot;com.hd.intentexample.MainActivity&quot;&gt;\n" +
                        "            &lt;intent-filter&gt;\n" +
                        "                &lt;action android:name=&quot;android.intent.action.MAIN&quot; /&gt;\n" +
                        "\n" +
                        "                &lt;category android:name=&quot;android.intent.category.LAUNCHER&quot; /&gt;\n" +
                        "            &lt;/intent-filter&gt;\n" +
                        "        &lt;/activity&gt;\n" +
                        "    &lt;/application&gt;\n" +
                        "&lt;/manifest&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.externalstorageexample;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.EditText;\n" +
                        "import android.widget.Toast;\n" +
                        "import java.io.BufferedReader;\n" +
                        "import java.io.File;\n" +
                        "import java.io.FileInputStream;\n" +
                        "import java.io.FileNotFoundException;\n" +
                        "import java.io.FileOutputStream;\n" +
                        "import java.io.IOException;\n" +
                        "import java.io.InputStreamReader;\n" +
                        "import java.io.OutputStreamWriter;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    EditText editTextFileName,editTextData;\n" +
                        "    Button saveButton,readButton;\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        editTextFileName=findViewById(R.id.editText1);\n" +
                        "        editTextData=findViewById(R.id.editText2);\n" +
                        "        saveButton=findViewById(R.id.button1);\n" +
                        "        readButton=findViewById(R.id.button2);\n" +
                        "\n" +
                        "        //Performing action on save button  \n" +
                        "        saveButton.setOnClickListener(new View.OnClickListener(){\n" +
                        "            @Override\n" +
                        "            public void onClick(View arg0) {\n" +
                        "                String filename=editTextFileName.getText().toString();\n" +
                        "                String data=editTextData.getText().toString();\n" +
                        "                FileOutputStream fos;\n" +
                        "                try {\n" +
                        "                    File myFile = new File(\"/sdcard/\"+filename);\n" +
                        "                    myFile.createNewFile();\n" +
                        "                    FileOutputStream fOut = new FileOutputStream(myFile);\n" +
                        "                    OutputStreamWriter myOutWriter = new OutputStreamWriter(fOut);\n" +
                        "                    myOutWriter.append(data);\n" +
                        "                    myOutWriter.close();\n" +
                        "                    fOut.close();\n" +
                        "                    Toast.makeText(getApplicationContext(),filename + \"saved\",Toast.LENGTH_LONG).show();\n" +
                        "                } catch (FileNotFoundException e) {e.printStackTrace();}\n" +
                        "                catch (IOException e) {e.printStackTrace();}\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        //Performing action on Read Button  \n" +
                        "        readButton.setOnClickListener(new View.OnClickListener(){\n" +
                        "            @Override\n" +
                        "            public void onClick(View arg0) {\n" +
                        "                String filename=editTextFileName.getText().toString();\n" +
                        "                StringBuffer stringBuffer = new StringBuffer();\n" +
                        "                String aDataRow = \"\";\n" +
                        "                String aBuffer = \"\";\n" +
                        "                try {\n" +
                        "                    File myFile = new File(\"/sdcard/\"+filename);\n" +
                        "                    FileInputStream fIn = new FileInputStream(myFile);\n" +
                        "                    BufferedReader myReader = new BufferedReader(\n" +
                        "                            new InputStreamReader(fIn));\n" +
                        "                    while ((aDataRow = myReader.readLine()) != null) {\n" +
                        "                        aBuffer += aDataRow + \"\\n\";\n" +
                        "                    }\n" +
                        "                    myReader.close();\n" +
                        "                } catch (IOException e) {\n" +
                        "                    e.printStackTrace();\n" +
                        "                }\n" +
                        "                Toast.makeText(getApplicationContext(),aBuffer,Toast.LENGTH_LONG).show();\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}  </pre>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=external_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=external_img2.png height=500 width=300/>"));
        mTutorialData.put("Android SQLite Database",new TabDetailsPojoClass(
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><h1 style=\"text-align: center;\">SQLite Database</h1> <hr /> <p>In Android, <strong>SQLite</strong>&nbsp;is an&nbsp;<strong>open-source relational database</strong>&nbsp;i.e. used to perform database operations on android devices such as storing, manipulating or retrieving persistent data from the database.</p> <p>It is embedded in android by default. So, there is no need to perform any database setup or administration task.</p> <p>The package&nbsp;<strong>android.database.sqlite</strong>&nbsp;contains all the required API&rsquo;s to use an SQLite database in our android applications.</p> <h2>SQLiteOpenHelper&nbsp;class:</h2> <p>It provides the functionality to use the SQLite database.</p> <p>The <strong>android.database.sqlite.SQLiteOpenHelper</strong> class is used for database creation and version management. For performing any database operation, you have to provide the implementation of&nbsp;<strong>onCreate()</strong>&nbsp;and&nbsp;<strong>onUpgrade() </strong>methods&nbsp;of SQLiteOpenHelper class.</p> <p>There are two constructors of SQLiteOpenHelper class.</p> <table border=\"1\"> <tbody> <tr> <th>Constructor</th> <th>Description</th> </tr> <tr> <td><strong>SQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version)</strong></td> <td>creates an object for creating, opening and managing the database.</td> </tr> <tr> <td><strong>SQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler)</strong></td> <td>creates an object for creating, opening and managing the database. It specifies the error handler.</td> </tr> </tbody> </table> <h4>Methods of SQLiteOpenHelper class:</h4> <p>There are many methods in the SQLiteOpenHelper class. Some of them are as follows:</p> <table border=\"1\"> <tbody> <tr> <th>Method</th> <th>Description</th> </tr> <tr> <td><strong>public abstract void onCreate(SQLiteDatabase db)</strong></td> <td>called only once when a database is created for the first time.</td> </tr> <tr> <td><strong>public abstract void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)</strong></td> <td>called when the database needs to be upgraded.</td> </tr> <tr> <td><strong>public synchronized void close ()</strong></td> <td>closes the database object.</td> </tr> <tr> <td><strong>public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion)</strong></td> <td>called when the database needs to be downgraded.</td> </tr> </tbody> </table> <h2>SQLiteDatabase class:</h2> <p>It contains methods to be performed on the SQLite database such as create, update, delete, select, etc.</p> <h4 class=\"h4\">Methods of SQLiteDatabase class:</h4> <p>There are many methods in the SQLiteDatabase class. Some of them are as follows:</p> <table border=\"1\"> <tbody> <tr> <th>Method</th> <th>Description</th> </tr> <tr> <td><strong>void execSQL(String sql)</strong></td> <td>executes the SQL query, not select query.</td> </tr> <tr> <td><strong>long insert(String table, String nullColumnHack, ContentValues values)</strong></td> <td>inserts a record on the database. The table specifies the table name, nullColumnHack doesn't allow completely null values. If the second argument is null, android will store null values if values are empty. The third argument specifies the values to be stored.</td> </tr> <tr> <td><strong>int update(String table, ContentValues values, String whereClause, String[] whereArgs)</strong></td> <td>updates a row.</td> </tr> <tr> <td><strong>Cursor query(String table, String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy)</strong></td> <td>returns a cursor over the resultset.</td> </tr> </tbody> </table>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><p>In this example, we are going to store and fetch the data using SQLite. Data is displayed in the <strong>Logcat</strong>.</p> <p>For Creating a class files Go to&nbsp;<strong>\\java\\com.hd.sqliteexample </strong>and right-click -&gt; Go to&nbsp;<strong>New</strong>&nbsp;-&gt; select&nbsp;<strong>Java Class</strong>&nbsp;and give the name as below.</p> <h2><em>EmployeeContact.java</em></h2> <pre class=\"prettyprint\">package com.hd.sqliteexample;\n" +
                        "public class EmployeeContact {\n" +
                        "    int _id;\n" +
                        "    String _name;\n" +
                        "    String _phone_number;\n" +
                        "    public EmployeeContact(){   }\n" +
                        "    public EmployeeContact(int id, String name, String _phone_number){\n" +
                        "        this._id = id;\n" +
                        "        this._name = name;\n" +
                        "        this._phone_number = _phone_number;\n" +
                        "    }\n" +
                        "    public EmployeeContact(String name, String _phone_number){\n" +
                        "        this._name = name;\n" +
                        "        this._phone_number = _phone_number;\n" +
                        "    }\n" +
                        "    public int getID(){\n" +
                        "        return this._id;\n" +
                        "    }\n" +
                        "\n" +
                        "    public void setID(int id){\n" +
                        "        this._id = id;\n" +
                        "    }\n" +
                        "\n" +
                        "    public String getName(){\n" +
                        "        return this._name;\n" +
                        "    }\n" +
                        "\n" +
                        "    public void setName(String name){\n" +
                        "        this._name = name;\n" +
                        "    }\n" +
                        "\n" +
                        "    public String getPhoneNumber(){\n" +
                        "        return this._phone_number;\n" +
                        "    }\n" +
                        "\n" +
                        "    public void setPhoneNumber(String phone_number){\n" +
                        "        this._phone_number = phone_number;\n" +
                        "    }\n" +
                        "}</pre> <h2><em>DbHandler.java</em></h2> <pre class=\"prettyprint\">package com.hd.sqliteexample;\n" +
                        "import android.content.ContentValues;\n" +
                        "import android.content.Context;\n" +
                        "import android.database.Cursor;\n" +
                        "import android.database.sqlite.SQLiteDatabase;\n" +
                        "import android.database.sqlite.SQLiteOpenHelper;\n" +
                        "import java.util.ArrayList;\n" +
                        "import java.util.List;\n" +
                        "\n" +
                        "public class DbHandler extends SQLiteOpenHelper {\n" +
                        "    private static final int DATABASE_VERSION = 1;\n" +
                        "    private static final String DATABASE_NAME = \"contactsManager\";\n" +
                        "    private static final String TABLE_CONTACTS = \"contacts\";\n" +
                        "    private static final String KEY_ID = \"id\";\n" +
                        "    private static final String KEY_NAME = \"name\";\n" +
                        "    private static final String KEY_PH_NO = \"phone_number\";\n" +
                        "\n" +
                        "    public DbHandler(Context context) {\n" +
                        "        super(context, DATABASE_NAME, null, DATABASE_VERSION);\n" +
                        "        //3rd argument to be passed is CursorFactory instance\n" +
                        "    }\n" +
                        "    \n" +
                        "    // Creating Tables\n" +
                        "    @Override\n" +
                        "    public void onCreate(SQLiteDatabase db) {\n" +
                        "        String CREATE_CONTACTS_TABLE = \"CREATE TABLE \" + TABLE_CONTACTS + \"(\"\n" +
                        "                + KEY_ID + \" INTEGER PRIMARY KEY,\" + KEY_NAME + \" TEXT,\"\n" +
                        "                + KEY_PH_NO + \" TEXT\" + \")\";\n" +
                        "        db.execSQL(CREATE_CONTACTS_TABLE);\n" +
                        "    }\n" +
                        "\n" +
                        "    // Upgrading database\n" +
                        "    @Override\n" +
                        "    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {\n" +
                        "        // Drop older table if existed\n" +
                        "        db.execSQL(\"DROP TABLE IF EXISTS \" + TABLE_CONTACTS);\n" +
                        "\n" +
                        "        // Create tables again\n" +
                        "        onCreate(db);\n" +
                        "    }\n" +
                        "\n" +
                        "    // code to add the new contact\n" +
                        "    void addContact(EmployeeContact contact) {\n" +
                        "        SQLiteDatabase db = this.getWritableDatabase();\n" +
                        "\n" +
                        "        ContentValues values = new ContentValues();\n" +
                        "        values.put(KEY_NAME, contact.getName()); // Contact Name\n" +
                        "        values.put(KEY_PH_NO, contact.getPhoneNumber()); // Contact Phone\n" +
                        "\n" +
                        "        // Inserting Row\n" +
                        "        db.insert(TABLE_CONTACTS, null, values);\n" +
                        "        //2nd argument is String containing nullColumnHack\n" +
                        "        db.close(); // Closing database connection\n" +
                        "    }\n" +
                        "\n" +
                        "    // code to get the single contact\n" +
                        "    EmployeeContact getContact(int id) {\n" +
                        "        SQLiteDatabase db = this.getReadableDatabase();\n" +
                        "\n" +
                        "        Cursor cursor = db.query(TABLE_CONTACTS, new String[] { KEY_ID,\n" +
                        "                        KEY_NAME, KEY_PH_NO }, KEY_ID + \"=?\",\n" +
                        "                new String[] { String.valueOf(id) }, null, null, null, null);\n" +
                        "        if (cursor != null)\n" +
                        "            cursor.moveToFirst();\n" +
                        "\n" +
                        "        EmployeeContact contact = new EmployeeContact(Integer.parseInt(cursor.getString(0)),\n" +
                        "                cursor.getString(1), cursor.getString(2));\n" +
                        "        // return contact\n" +
                        "        return contact;\n" +
                        "    }\n" +
                        "\n" +
                        "    // code to get all contacts in a list view\n" +
                        "    public List<EmployeeContact> getAllContacts() {\n" +
                        "        List<EmployeeContact> contactList = new ArrayList<EmployeeContact>();\n" +
                        "        // Select All Query\n" +
                        "        String selectQuery = \"SELECT  * FROM \" + TABLE_CONTACTS;\n" +
                        "\n" +
                        "        SQLiteDatabase db = this.getWritableDatabase();\n" +
                        "        Cursor cursor = db.rawQuery(selectQuery, null);\n" +
                        "\n" +
                        "        // looping through all rows and adding to list\n" +
                        "        if (cursor.moveToFirst()) {\n" +
                        "            do {\n" +
                        "                EmployeeContact contact = new EmployeeContact();\n" +
                        "                contact.setID(Integer.parseInt(cursor.getString(0)));\n" +
                        "                contact.setName(cursor.getString(1));\n" +
                        "                contact.setPhoneNumber(cursor.getString(2));\n" +
                        "                // Adding contact to list\n" +
                        "                contactList.add(contact);\n" +
                        "            } while (cursor.moveToNext());\n" +
                        "        }\n" +
                        "\n" +
                        "        // return contact list\n" +
                        "        return contactList;\n" +
                        "    }\n" +
                        "\n" +
                        "    // code to update the single contact\n" +
                        "    public int updateContact(EmployeeContact contact) {\n" +
                        "        SQLiteDatabase db = this.getWritableDatabase();\n" +
                        "\n" +
                        "        ContentValues values = new ContentValues();\n" +
                        "        values.put(KEY_NAME, contact.getName());\n" +
                        "        values.put(KEY_PH_NO, contact.getPhoneNumber());\n" +
                        "\n" +
                        "        // updating row\n" +
                        "        return db.update(TABLE_CONTACTS, values, KEY_ID + \" = ?\",\n" +
                        "                new String[] { String.valueOf(contact.getID()) });\n" +
                        "    }\n" +
                        "\n" +
                        "    // Deleting single contact\n" +
                        "    public void deleteContact(EmployeeContact contact) {\n" +
                        "        SQLiteDatabase db = this.getWritableDatabase();\n" +
                        "        db.delete(TABLE_CONTACTS, KEY_ID + \" = ?\",\n" +
                        "                new String[] { String.valueOf(contact.getID()) });\n" +
                        "        db.close();\n" +
                        "    }\n" +
                        "\n" +
                        "    // Getting contacts Count\n" +
                        "    public int getContactsCount() {\n" +
                        "        String countQuery = \"SELECT  * FROM \" + TABLE_CONTACTS;\n" +
                        "        SQLiteDatabase db = this.getReadableDatabase();\n" +
                        "        Cursor cursor = db.rawQuery(countQuery, null);\n" +
                        "        cursor.close();\n" +
                        "\n" +
                        "        // return count\n" +
                        "        return cursor.getCount();\n" +
                        "    }\n" +
                        "\n" +
                        "}</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.sqliteexample;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.util.Log;\n" +
                        "import java.util.List;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        DbHandler db = new DbHandler(this);\n" +
                        "\n" +
                        "        // Inserting Contacts\n" +
                        "        Log.d(\"Insert: \", \"Inserting ..\");\n" +
                        "        db.addContact(new EmployeeContact(\"Jenish\", \"6133453456\"));\n" +
                        "        db.addContact(new EmployeeContact(\"John\", \"6133453456\"));\n" +
                        "        db.addContact(new EmployeeContact(\"Tommy\", \"9522222222\"));\n" +
                        "        db.addContact(new EmployeeContact(\"Eric\", \"9533333333\"));\n" +
                        "\n" +
                        "        // Reading all contacts\n" +
                        "        Log.d(\"Reading: \", \"Reading all contacts..\");\n" +
                        "        List<EmployeeContact> contacts = db.getAllContacts();\n" +
                        "\n" +
                        "        for (EmployeeContact cn : contacts) {\n" +
                        "            String log = \"Id: \" + cn.getID() + \" ,Name: \" + cn.getName() + \" ,Phone: \" +\n" +
                        "                    cn.getPhoneNumber();\n" +
                        "            // Writing Contacts to log\n" +
                        "            Log.d(\"Name: \", log);\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n</pre>",
                "<p><strong>Log Cat Output:</strong></p> <p><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"database_img2.PNG\" width=\"300/\" height=\"500\" /></p> <h2 class=\"h3\">How to view the data stored in SQLite in the android studio:&nbsp;</h2> <p>1) Download and install&nbsp;<a href=\"http://sqlitebrowser.org/\" rel=\"noreferrer\"><strong>SQLiteBrowser</strong></a>.</p> <p>2) To view your database on an Emulator follow these steps:</p> <ul> <li> <p><em><strong>Android Studio versions &lt; 3.0</strong></em>:</p> </li> <li>Open&nbsp;<strong>DDMS</strong>&nbsp;via&nbsp;<code>Tools &gt; Android &gt; Android Device Monitor</code></li> <li><strong>Click on your device</strong>&nbsp;on the left.</li> <li>Go to&nbsp;<strong>File Explorer</strong>&nbsp;(one of the tabs on the right), go to&nbsp;<code>/data/data/databases</code></li> <li><strong>Select the database</strong>&nbsp;by just clicking on it.</li> <li>Go to the top right corner of the Android Device Monitor window. Click on the '<em><strong>pull a file</strong> from the device</em>' button:</li> <li>A window will open asking you where you want to save your database file.&nbsp;<strong>Save it</strong>&nbsp;anywhere you want on your PC.</li> </ul> <p><em>3) To view your database on an actual device follows these steps:</em>&nbsp;</p> <ul> <li><strong><em>Android Studio versions &gt;= 3.0</em></strong>:</li> </ul> <ul> <li> <p>Open&nbsp;<strong>Device File Explorer</strong>&nbsp;via&nbsp;<code>View &gt; Tool Windows &gt; Device File Explorer</code></p> </li> <li> <p>Go to&nbsp;<code>data &gt; data &gt; PACKAGE_NAME &gt; database</code>, where PACKAGE_NAME is the name of your package (it is&nbsp;<em>com.SQLiteExample</em>&nbsp;in the example above)</p> </li> <li> <p>Right-click on the database and select&nbsp;<code>Save As...</code>.&nbsp;<strong>Save it</strong>&nbsp;anywhere you want on your PC.</p> </li> </ul> <p>4) Now, open the&nbsp;<em>SQLiteBrowser</em>&nbsp;you installed. Click on '<em>open database</em>', navigate to the location you saved the database file, and&nbsp;<strong>open</strong>. You can now view the contents of your database as below:</p> <p><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"database_img1.PNG\" width=\"450/\" height=\"400\" /></p>"));
        mTutorialData.put("Android SQLite Spinner",new TabDetailsPojoClass(
                "<h1 style=\"text-align: center;\">SQLite Example (with Spinner)</h1> <hr /> <p>In this tutorial, we are going to learn how to populate android spinner from the SQLIte database.</p> <p>There are situations where app users can be given the privilege to add more data that will be displayed in the android spinner.</p>",
                "<link rel=stylesheet href=\"sunburst\"/><script src=SourceCodeJS></script><p>In this example, we are adding a label on button click and displaying all the added labels on the spinner. As you have seen in the previous example,&nbsp;<strong>SQLiteOpenHelper</strong>&nbsp;class need to be extended for performing operations on the SQLite.</p> <p>We have overridden the onCreate() and onUpgrade() method of SQLiteOpenHelper class in the DatabaseHandler class that provides additional methods to insert and display the labels or data.</p> <h2><em>activity_main.xml</em></h2> <pre class=\"prettyprint\">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;\n" +
                        "&lt;RelativeLayout\n" +
                        "    xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;\n" +
                        "    xmlns:tools=&quot;http://schemas.android.com/tools&quot;\n" +
                        "    android:layout_width=&quot;match_parent&quot;\n" +
                        "    android:layout_height=&quot;match_parent&quot;\n" +
                        "    tools:context=&quot;.MainActivity&quot;&gt;\n" +
                        "    &lt;EditText\n" +
                        "        android:id=&quot;@+id/input_label&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_alignParentTop=&quot;true&quot;\n" +
                        "        android:layout_centerHorizontal=&quot;true&quot;\n" +
                        "        android:layout_marginTop=&quot;46dp&quot;\n" +
                        "        android:hint=&quot;Add item&quot;\n" +
                        "        android:ems=&quot;10&quot;/&gt;\n" +
                        "    &lt;Button\n" +
                        "        android:id=&quot;@+id/btn_add&quot;\n" +
                        "        android:layout_width=&quot;wrap_content&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_below=&quot;@+id/input_label&quot;\n" +
                        "        android:layout_centerHorizontal=&quot;true&quot;\n" +
                        "        android:layout_marginTop=&quot;67dp&quot;\n" +
                        "        android:text=&quot;Add item&quot;/&gt;\n" +
                        "    &lt;Spinner\n" +
                        "        android:id=&quot;@+id/spinner&quot;\n" +
                        "        android:layout_width=&quot;match_parent&quot;\n" +
                        "        android:layout_height=&quot;wrap_content&quot;\n" +
                        "        android:layout_alignParentLeft=&quot;true&quot;\n" +
                        "        android:layout_alignParentStart=&quot;true&quot;\n" +
                        "        android:layout_below=&quot;@+id/btn_add&quot;\n" +
                        "        android:layout_marginTop=&quot;70dp&quot; /&gt;\n" +
                        "&lt;/RelativeLayout&gt;</pre> <h2><em>MainActivity.java</em></h2> <pre class=\"prettyprint\">package com.hd.sqliteexample;\n" +
                        "import android.content.Context;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.view.inputmethod.InputMethodManager;\n" +
                        "import android.widget.AdapterView;\n" +
                        "import android.widget.ArrayAdapter;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.EditText;\n" +
                        "import android.widget.Spinner;\n" +
                        "import android.widget.Toast;\n" +
                        "import java.util.List;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {\n" +
                        "    Spinner spinner;\n" +
                        "    Button btnAdd;\n" +
                        "    EditText inputLabel;\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        spinner = findViewById(R.id.spinner);\n" +
                        "        btnAdd =  findViewById(R.id.btn_add);\n" +
                        "        inputLabel = findViewById(R.id.input_label);\n" +
                        "\n" +
                        "        spinner.setOnItemSelectedListener(this);\n" +
                        "\n" +
                        "        // Loading spinner data from database\n" +
                        "        loadSpinnerData();\n" +
                        "        btnAdd.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View arg0) {\n" +
                        "                String label = inputLabel.getText().toString();\n" +
                        "                if (label.trim().length() > 0) {\n" +
                        "                    DbHandler db = new DbHandler(getApplicationContext());\n" +
                        "                    db.insertLabel(label);\n" +
                        "                    // making input filed text to blank\n" +
                        "                    inputLabel.setText(\"\");\n" +
                        "                    // Hiding the keyboard\n" +
                        "                    InputMethodManager imm = (InputMethodManager)\n" +
                        "                            getSystemService(Context.INPUT_METHOD_SERVICE);\n" +
                        "                    imm.hideSoftInputFromWindow(inputLabel.getWindowToken(), 0);\n" +
                        "                    // loading spinner with newly added data\n" +
                        "                    loadSpinnerData();\n" +
                        "                } else {\n" +
                        "                    Toast.makeText(getApplicationContext(), \"Please enter label name\",\n" +
                        "                            Toast.LENGTH_SHORT).show();\n" +
                        "                }\n" +
                        "\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "    /**\n" +
                        "     * Function to load the spinner data from SQLite database\n" +
                        "     * */\n" +
                        "    private void loadSpinnerData() {\n" +
                        "        DbHandler db = new DbHandler(getApplicationContext());\n" +
                        "        List<String> labels = db.getAllLabels();\n" +
                        "        // Creating adapter for spinner\n" +
                        "        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, labels);\n" +
                        "        // Drop down layout style - list view with radio button\n" +
                        "        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);\n" +
                        "        // attaching data adapter to spinner\n" +
                        "        spinner.setAdapter(dataAdapter);\n" +
                        "    }\n" +
                        "    @Override\n" +
                        "    public void onItemSelected(AdapterView<?> parent, View view, int position,\n" +
                        "                               long id) {\n" +
                        "        // On selecting a spinner item\n" +
                        "        String label = parent.getItemAtPosition(position).toString();\n" +
                        "\n" +
                        "        // Showing selected spinner item\n" +
                        "        Toast.makeText(parent.getContext(), \"You selected: \" + label,\n" +
                        "                Toast.LENGTH_LONG).show();\n" +
                        "    }\n" +
                        "    @Override\n" +
                        "    public void onNothingSelected(AdapterView<?> arg0) {\n" +
                        "        // TODO Auto-generated method stub\n" +
                        "\n" +
                        "    }\n" +
                        "}</pre> <h2><em>DbHandler.java</em></h2> <pre class=\"prettyprint\">package com.hd.sqliteexample;\n" +
                        "import android.content.ContentValues;\n" +
                        "import android.content.Context;\n" +
                        "import android.database.Cursor;\n" +
                        "import android.database.sqlite.SQLiteDatabase;\n" +
                        "import android.database.sqlite.SQLiteOpenHelper;\n" +
                        "import java.util.ArrayList;\n" +
                        "import java.util.List;\n" +
                        "\n" +
                        "public class DbHandler extends SQLiteOpenHelper {\n" +
                        "    private static final int DATABASE_VERSION = 1;\n" +
                        "    private static final String DATABASE_NAME = \"spinnerExample\";\n" +
                        "    private static final String TABLE_NAME = \"labels\";\n" +
                        "    private static final String COLUMN_ID = \"id\";\n" +
                        "    private static final String COLUMN_NAME = \"name\";\n" +
                        "\n" +
                        "    public DbHandler(Context context) {\n" +
                        "        super(context, DATABASE_NAME, null, DATABASE_VERSION);\n" +
                        "    }\n" +
                        "\n" +
                        "    // Creating Tables\n" +
                        "    @Override\n" +
                        "    public void onCreate(SQLiteDatabase db) {\n" +
                        "        // Category table create query\n" +
                        "        String CREATE_ITEM_TABLE = \"CREATE TABLE \" + TABLE_NAME + \"(\"\n" +
                        "                + COLUMN_ID + \" INTEGER PRIMARY KEY,\" + COLUMN_NAME + \" TEXT)\";\n" +
                        "        db.execSQL(CREATE_ITEM_TABLE);\n" +
                        "    }\n" +
                        "\n" +
                        "    // Upgrading database\n" +
                        "    @Override\n" +
                        "    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {\n" +
                        "        // Drop older table if existed\n" +
                        "        db.execSQL(\"DROP TABLE IF EXISTS \" + TABLE_NAME);\n" +
                        "\n" +
                        "        // Create tables again\n" +
                        "        onCreate(db);\n" +
                        "    }\n" +
                        "    //Inserting new lable into lables table\n" +
                        "    public void insertLabel(String label){\n" +
                        "        SQLiteDatabase db = this.getWritableDatabase();\n" +
                        "\n" +
                        "        ContentValues values = new ContentValues();\n" +
                        "        values.put(COLUMN_NAME, label);//column name, column value\n" +
                        "\n" +
                        "        // Inserting Row\n" +
                        "        db.insert(TABLE_NAME, null, values);//tableName, nullColumnHack, CotentValues\n" +
                        "        db.close(); // Closing database connection\n" +
                        "    }\n" +
                        "    /**\n" +
                        "     * Getting all labels\n" +
                        "     * returns list of labels\n" +
                        "     * */\n" +
                        "    public List<String> getAllLabels(){\n" +
                        "        List<String> list = new ArrayList<String>();\n" +
                        "\n" +
                        "        // Select All Query\n" +
                        "        String selectQuery = \"SELECT  * FROM \" + TABLE_NAME;\n" +
                        "\n" +
                        "        SQLiteDatabase db = this.getReadableDatabase();\n" +
                        "        Cursor cursor = db.rawQuery(selectQuery, null);//selectQuery,selectedArguments\n" +
                        "\n" +
                        "        // looping through all rows and adding to list\n" +
                        "        if (cursor.moveToFirst()) {\n" +
                        "            do {\n" +
                        "                list.add(cursor.getString(1));//adding 2nd column data\n" +
                        "            } while (cursor.moveToNext());\n" +
                        "        }\n" +
                        "        // closing connection\n" +
                        "        cursor.close();\n" +
                        "        db.close();\n" +
                        "        // returning lables\n" +
                        "        return list;\n" +
                        "    }\n" +
                        "}</pre>",
                "<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=sqlite_spinner_img1.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=sqlite_spinner_img2.png height=500 width=300/><br/><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=sqlite_spinner_img3.png height=500 width=300/>\n"));
    }

        public static TabDetailsPojoClass getTutorialInfoByName(String subTitleName) {

            TabDetailsPojoClass tab = mTutorialData.get(subTitleName);
            return tab;
        }



        //<link rel=stylesheet href="sunburst"/><script src=SourceCodeJS></script>
    //<pre class="prettyprint">java.lang.Object<br />&nbsp; ↳ android.content.Context<br />
    //<img style="display: block; margin-left: auto; margin-right: auto;" src=edittext_img1.png height=500 width=300/><br/>

}
