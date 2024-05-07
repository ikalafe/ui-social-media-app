package com.example.socialmedia.data

import com.example.socialmedia.R
import com.example.socialmedia.model.Post
import com.example.socialmedia.model.Story
import com.example.socialmedia.model.User
import java.lang.reflect.Array

object MockData {
    val stories = ArrayList<Story>()
    val users = ArrayList<User>()
    val posts = ArrayList<Post>()

    init {
        stories.add(Story(1, "Bahram", R.drawable.bahram, true))
        stories.add(Story(2, "Sorena", R.drawable.sorena, false))
        stories.add(Story(3, "Fashad HipHop", R.drawable.farshad, false))
        stories.add(Story(4, "Fadaie", R.drawable.fadaie, false))
        stories.add(Story(5, "Mehyad", R.drawable.mehyad, false))
        stories.add(Story(6, "Chvrsi", R.drawable.chvrsi, false))
        stories.add(Story(7, "Hiphopologist", R.drawable.hiphopologist, false))

        users.add(
            User(
                "Bahram",
                "Bahram Nouraei",
                "https://ememay.ir/wp-content/uploads/2023/12/Bahram-Nouraei-Wallpaper-1.webp"
            )
        )
        users.add(
            User(
                "Sorena",
                "Ali Sorena",
                "https://upload.wikimedia.org/wikipedia/commons/f/f3/Ali_Sorena_in_Meidaan_Interview.jpg"
            )
        )
        users.add(
            User(
                "Farshad",
                "Farshad Hiphop",
                "https://ihtrap.iht-group.ir/wp-content/uploads/2021/04/photo_2021-04-15_23-21-41.jpg"
            )
        )
        users.add(
            User(
                "Fadaei",
                "Fadaei",
                "https://ts12.tarafdari.com/contents/user777352/content-article/img_20220630_141729_sxuh.jpg"
            )
        )

        posts.add(
            Post(
                users[0],
                "Sweden",
                "https://ts16.tarafdari.com/contents/user827465/content-sound/bahram-bamdad-begoosham-img.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
            )
        )
        posts.add(
            Post(
                users[1],
                "Iran",
                "https://soil.ifilo.net/filo/video/TVRRd01pOHhNaTh4Tmc9PQ==/TjFacFoxSllSdz09/RMHW-300X169.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
            )
        )
        posts.add(
            Post(
                users[2],
                "Tehran/Iran",
                "https://musichi.ir/wp-content/uploads/2023/03/Farshad-Nevisande.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
            )
        )
        posts.add(
            Post(
                users[3],
                "France",
                "https://www.tarafdari.com/sites/default/files/contents/user723506/content-sound/photo_6015059418846183168_w.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
            )
        )
    }
}
//        stories.add(Story("Dani Kalafe", R.drawable.danikalafe, false))
