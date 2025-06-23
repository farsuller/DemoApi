package com.example.demoapi.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class School(
    val id: Int,

    @SerialName("school_name")
    val schoolName: String? = null,

    val description: String? = null,

    val address: String? = null,

    val latitude: Double? = null,

    val longitude: Double? = null,
)

val schools = listOf(
    School(
        id = 1,
        schoolName = "University of the Philippines Diliman",
        description = "It offers undergraduate and graduate programs. At UP, students can study business, engineering, law, and the arts. UP has several research centers supporting students doing various research projects.",
        address = "M339+H94, Roxas Ave, Diliman, Quezon City, Metro Manila",
        latitude = 14.6539,
        longitude = 121.0685
    ),
    School(
        id = 2,
        schoolName = "Ateneo de Manila University",
        description = "Ateneo de Manila University offers business, law, engineering, and arts programs. It also provides commerce, governance, medicine, and social sciences programs. People honor ADMU for its strong stress on research and humanistic learning. ",
        address = "Katipunan Ave, Quezon City, 1108 Metro Manila",
        latitude = 14.6396,
        longitude = 121.0786
    ),
    School(
        id = 3,
        schoolName = "De La Salle University",
        description = "De La Salle University ranks top on the Philippines colleges and universities list for its in-demand courses. The college offers business, engineering, education, and arts. Furthermore, DLSU offers computer studies, economics, and sciences programs. ",
        address = "2401 Taft Ave, Malate, City Of Manila, 1004 Metro Manila",
        latitude = 14.5647694,
        longitude = 120.9905903
    ),
    School(
        id = 4,
        schoolName = "University of Santo Tomas",
        description = "The University of Santo Tomas is Asia’s most ancient private University. Students honor the college’s rich history, Christian values, and marketable academic programs. The college has 63 courses, including arts, business, law, and engineering.",
        address = "España Blvd, Sampaloc, City Of Manila, 1008 Metro Manila",
        latitude = 14.6098107,
        longitude = 120.9870045
    ),
    School(
        id = 5,
        schoolName = "Mapua University",
        description = "Mapua University is regarded as a Center of Excellence in Civil Engineering by CHED. Besides engineering, it offers programs in engineering, architecture, and business. The university has 15 internationally accredited programs.",
        address = "658 Muralla St, Intramuros, City Of Manila, 1002 Metro Manila",
        latitude = 14.598,
        longitude = 120.9799
    ),
    School(
        id = 6,
        schoolName = "Far Eastern University",
        description = "Far Eastern University (FEU) has multiple academic programs for undergraduate and postgraduate students. Its top courses are business, health sciences, engineering, and education. It has a status for training competitive graduates appreciated for excellence and uprightness.",
        address = "Nicanor Reyes Sr, Street, Sampaloc, City Of Manila, 1008 Metro Manila",
        latitude = 14.6037,
        longitude = 120.9865
    ),
    School(
        id = 7,
        schoolName = "Polytechnic University of the Philippines",
        description = "The Polytechnic University of the Philippines is known for one main thing. It offers professional instruction to produce self-reliant, creative, and productive graduates. It provides administration, computer science, social sciences, and tourism programs.",
        address = "1016 Anonas, Sta. Mesa, City Of Manila, Kalakhang Maynila",
        latitude = 14.5979,
        longitude = 121.0108
    ),
)