package edu.itesm.stanley

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_actorsk.*
import kotlinx.android.synthetic.main.fragment_kubrick.*
import kotlinx.android.synthetic.main.fragment_movies.*


/**
 * A simple [Fragment] subclass.
 * Use the [ActorskFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ActorskFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_actorsk, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        actores_recycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = ActoresAdapter(createData())
        }
    }

    fun createData(): ArrayList<Actor>{
        val actores = ArrayList<Actor>()
        actores.add(Actor(R.drawable.malcom_mcdowell,"Malcolm McDowell", " A Clockwork Orange","Malcolm John Taylor was born on June 13, 1943 in Leeds, England, to working-class parents Edna (McDowell), a hotelier, and Charles Taylor, a publican. His father was an alcoholic. Malcolm hated his parents' ways. His father was keen to send his son to private school to give him a good start in life..."))
        actores.add(Actor(R.drawable.tom_cruise, "Tom Cruise", "Top Gun", "In 1976, if you had told fourteen-year-old Franciscan seminary student Thomas Cruise Mapother IV that one day in the not too distant future he would be Tom Cruise, one of the top 100 movie stars of all time, he would have probably grinned and told you that his ambition was to join the priesthood. ..."))
        actores.add(Actor(R.drawable.nicole_kidman, "Nicole Kidman", "Moulin Rouge!", "Elegant Nicole Kidman, known as one of Hollywood's top Australian imports, was actually born in Honolulu, Hawaii, while her Australian parents were there on educational visas.\n" +
                "\n" +
                "Kidman is the daughter of Janelle Ann (Glenny), a nursing instructor, and Antony David Kidman, a biochemist and clinical ..."))
        actores.add(Actor(R.drawable.ryan, "Ryan O'Neal", "Love Story", "Ryan O'Neal was born on April 20, 1941 in Los Angeles, California, USA as Charles Samuel Eldridge Patrick Ryan O'Neal III. He is an actor, known for Historia de amor (1970), Barry Lyndon (1975) and Luna de papel (1973). He was previously married to Leigh Taylor-Young and Joanna Moore."))
        actores.add(Actor(R.drawable.jack, "Jack Nicholson", "Chinatown", "Jack Nicholson, an American actor, producer, director and screenwriter, is a three-time Academy Award winner and twelve-time nominee. Nicholson is also notable for being one of two actors - the other being Michael Caine - who have received an Oscar nomination in every decade from the 1960s through ..."))
        actores.add(Actor(R.drawable.vincent, "Vincent D'Onofrio", "Men in Black", "Vincent Phillip D'Onofrio was born on June 30, 1959 in Brooklyn, New York, to Phyllis, a restaurant manager and server, and Gene D'Onofrio, a theatre production assistant and interior designer. He is of Italian descent and has two older sisters. He studied at the Actors Studio and the American ..."))
        actores.add(Actor(R.drawable.matthew, "Matthew Modine", "Full Metal Jacket", "The youngest of seven, Matthew was born in Loma Linda, Ca, to Dolores (Warner), a bookkeeper, and Mark Alexander Modine, a drive-in theater manager. After graduating high school in Imperial Beach, Ca. Modine moved to NYC (1979). Matthew studied with Stella Adler at her Conservatory of Acting. While..."))
        actores.add(Actor(R.drawable.keir, "Keir Dullea", "2001: A Space Odyssey", "Tall, slim, remote and boyishly handsome, one of Keir Dullea's most arresting features is his pale blue eyes, which featured in a number of watershed films of the 1960s. His major breakthrough (providing him legendary status) was the starring role as astronaut Dave Bowman in Stanley Kubrick's 2001:..."))
        actores.add(Actor(R.drawable.gary, "Gary Lockwood", "2001: A Space Odyssey", "Gary Lockwood was born in Van Nuys, California. He attended the University of California at Los Angeles on a football scholarship.\n" +
                "\n" +
                "He began his career as a movie stuntman, and a stand-in for Anthony Perkins, prior to his acting debut in 1959 in an uncredited bit role in Pueblo fantasma (1959). He ..."))
        actores.add(Actor(R.drawable.leonard, "Leonard Rossiter", "2001: A Space Odyssey", "Leonard Rossiter was born on October 21st, 1926 in Liverpool. Unable to afford to go to university, he worked in an insurance office until he was 27, when he joined Preston repertory company and made his professional stage debut in \"The Gay Dog\". After Preston, he starred in productions at ..."))
        actores.add(Actor(R.drawable.sterling, "Sterling Hayden", "Dr. Strangelove or: How I Learned to Stop Worrying and Love the Bomb", "Born to George & Frances Simonson Walter, and named Sterling Relyea Walter. Father died in 1925. Adopted by stepfather 'James Hayden' renamed Sterling Walter Hayden. Grew up in New Hampshire, Massachusetts, Pennsylvania, Washington D.C., and Maine. Though very poor, attended prep school at ..."))
        actores.add(Actor(R.drawable.peter, "Peter Sellers", "Being There", "Often credited as the greatest comedian of all time, Peter Sellers was born Richard Henry Sellers to a well-off acting family in 1925 in Southsea, a suburb of Portsmouth. He was the son of Agnes Doreen \"Peg\" (Marks) and William \"Bill\" Sellers. His parents worked in an acting company run by his ..."))
        actores.add(Actor(R.drawable.james, "James Earl Jones", "Rogue One", "Widely regarded as the one of greatest stage and screen actors both in his native USA and internationally, James Earl Jones was born on January 17, 1931 in Arkabutla, Mississippi. At an early age, he started to take dramatic lessons to calm himself down. It appeared to work as he has since starred ..."))
        actores.add(Actor(R.drawable.scatman, "Scatman Crothers", "The Shining", "Scatman Crothers was born Benjamin Sherman Crothers on May 23, 1910 in Terre Haute, Indiana. Songwriter (\"Dearest One\"), actor, composer, singer, comedian and guitarist who, after high school, appeared in nightclubs, hotels, films and on television. He made many records, including his own ..."))
        actores.add(Actor(R.drawable.kirk, "Kirk Douglas", " Spartacus", "Cleft-chinned, steely-eyed and virile star of international cinema who rose from being \"the ragman's son\" (the name of his best-selling 1988 autobiography) to become a bona fide superstar, Kirk Douglas, also known as Issur Danielovitch Demsky, was born on December 9, 1916 in Amsterdam, New York. ..."))



        return actores
    }

}