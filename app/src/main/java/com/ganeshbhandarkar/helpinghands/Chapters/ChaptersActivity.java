package com.ganeshbhandarkar.helpinghands.Chapters;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Context;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;


import com.ganeshbhandarkar.helpinghands.Chapters.Adapter;
import com.ganeshbhandarkar.helpinghands.Chapters.ChapterItem;
import com.ganeshbhandarkar.helpinghands.MainActivity;
import com.ganeshbhandarkar.helpinghands.R;

import java.util.ArrayList;
import java.util.List;

public class ChaptersActivity extends AppCompatActivity {

    private static final String TAG = "ChaptersActivity";
    private static final int NUM_COLUMN = 2;
    private List<ChapterItem> mlist;

//    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapters);




//        ScrollView scrollView = findViewById(R.id.scroll_view_chapters);
//        OverScrollDecoratorHelper.setUpOverScroll(scrollView);


        List<ChapterItem> mlist = new ArrayList<>();

        mlist.add(new ChapterItem(R.drawable.chapter1,"Childhood and Society","Chapter 1","","","What is childhood?\n" +
                "“Childhood is not a natural biological state, rather childhood is a social role and the norms attached to childhood vary across societies.” But still there are some universal laws for every child in every community like infants/toddler are not socially constructed because they are dependent on adults which seem not to be socialized. Age group from 5 to 12, still somewhere they are not well socialized, being social after age of 15 makes more sense. And last group from age 15 to till person is alive, by adolescence it makes more sense. If childhood has not any relation with society then the question is \n" +
                "“Is childhood socially constructed?”\n" +
                "- Yes\n" +
                "If childhood is socially constructed, then it Must be varies through cultures (anthropological evidence).\n" +
                "Children everywhere go through the same stages of physical Development but cultures construct these stages differently like some people believe that baby must be clean every time to maintain hygiene and provide their child new clothes but some cultures people believe that child must be wore old clothes to get avoid from “Nazar”.\n Age at which children take responsibility varies as do expectations of child obedience like children other western countries get legally mature by the age of 18 but India there is a difference in maturity age girl gets mature at the age of 18 and boys at 21. \n" +
                "Age of starting working varies where mostly in western countries child used to start work at 19 or 20 but still in some Asian cultures children use to earn by age of 23 to 27. \n" +
                "Age of marriage and consent: children also get married by their teenage in India but that age varies through the countries and as per the choice of individuals. \n","What history says about childhood?\n" +
                "Childhood didn’t exist in medieval Europe because there is no evidence found in paintings and other substances like scripts.\n" +
                "Childhood was invented in the 13th century. \n" +
                "Childhood labor was normal in 19th century.\n" +
                "Post-modernism, uncertainty and “precious children”. \n" +
                "** All the above ideas are determined by society.   \n" +
                "\n" +
                "  If No (** appears not to be)\n" +
                "As we have discussed in previous that what if childhood exits in society and now we will talk about if it does not exist then what are the perspectives would take place. \n" +
                "Dominant framework:\n" +
                "As per the society, children are considered as simple (innocent) and immoral and adults are considered as complex, mature and moral. As we can see also in any house while any important discussion how much elders get preference in comparison with children. Yes, that’s true that elders have more experience but in some exceptional cases children also suggest best, because somehow they have a different perspective of thoughts.  \n" +
                "Separateness\n Physical immaturity:  As per children’s life they used have a lengthy socialization in which they are dependent on adult for their biological needs. \n" +
                "Psychological immaturity: children are not competent to run their lives by their own, they cannot be held responsible and also they are emotionally dependent on adults. \n" +
                "Separated socially: They are not social with those things which are common parts of an adult’s life like products, places, laws, etc.  \n","There are psychosocial stages which explains that how a person gets social according to age in his life:- \n" +
                "\n" +
                "Approximate age \n" +
                "\tVirtues \n" +
                "\tPsychosocial crisis \n" +
                "\tSignificant relationship \n" +
                "\tExistential question  \n" +
                "\tExamples \n" +
                "\n" +
                "Infancy (under 2 years)\n" +
                "\n" +
                "\tHope \n" +
                "\tTrust vs. mistrust \n" +
                "\tMother \n" +
                "\tCan I trust the world? \n" +
                "\tFeeding, abandonment \n" +
                "\n" +
                "Toddlerhood (2-4 years)  \n" +
                "\n" +
                "\tWill \n" +
                "\tAutonomy vs. shame/doubt  \n" +
                "\tParents  \n" +
                "\tIs it okay to be me?\n" +
                "\tToilet training, clothing themselves  \n" +
                "\n" +
                "Early childhood (5-8 years)\n" +
                "\tPurpose \n" +
                "\tInitiatives vs. guilt \n" +
                "\tFamily \n" +
                "\tIs it okay for me to do, move, and act?\n" +
                "\tExploring using tools or making \n" +
                "\n" +
                "Middle childhood (9-12 childhood)\tCompetence \n" +
                "\n" +
                "\tIndustry vs. inferiority \n" +
                "\tNeighbors, school\n" +
                "\tCan I make it in the world of people and things?\n" +
                "\tSchool, sports \n" +
                "\n" +
                "Adolescence (13-19 years) \n" +
                "\n" +
                "\tFidelity \n" +
                "\tIdentity vs. role confusion \n" +
                "\tPeers, role model \n" +
                "\tWho am I? Who can I be? \n" +
                "\n" +
                "\tSocial relationships \n" +
                "\n" +
                "Early adulthood (20-39) \n" +
                "\tLove \n" +
                "\tIntimacy vs. isolation \n" +
                "\tFriends, partners \tCan I love? \n" +
                "\n" +
                "\tRomantic relationships \n" +
                "\n" +
                "Middle adulthood (40-59) \n" +
                "\tCare \n" +
                "\tGeneratively vs. stagnation \n" +
                "\tHousehold, workmates \n" +
                "\tCan I make my life count? \n" +
                "\tWork, parenthood \n" +
                "\n" +
                "Late adulthood (60 and above)\n" +
                "\tWisdom \n" +
                "\tEgo integrity vs. despair \n" +
                "\tMankind, my kind \n" +
                "\tIs it okay to have been me? \n" +
                "\tReflection on life \n" +
                "\n" +
                "\n"));



        mlist.add(new ChapterItem(R.drawable.chapter2,"Development and Self esteem","Chapter 2","","","Recognizing the expression of self esteem\n" +
                "Sometimes it's easy to notice when kids seem to feel good about themselves — and when they don't. A child with a high athletic self-esteem is always ready to indulge in outdoor games and sporty activities whereas a child with a low athletic self-esteem finds it difficult to do so. It is important that the parents start to recognize the fields in which their child has low self-esteem and low confidence. They must also figure out the fields in which the child has a high self-esteem. \n" +
                "\n" +
                "Signs of Low Self-Esteem \n" +
                "•\tYour child avoids a task or challenge without even trying. This often signals a fear of failure or a sense of helplessness.\n" +
                "•\tThey quit soon after beginning a game or a task, giving up at the first sign of frustration.\n" +
                "•\tThey cheat or lie when they believe they are going to lose a game or do poorly.\n" +
                "•\tThey become controlling, bossy, or inflexible as ways of hiding feelings of inadequacy, frustration, or powerlessness.\n" +
                "•\tThey make excuses (\"The teacher is dumb\") or downplay the importance of events (\"I don't really like that game anyway\"), uses this kind of rationalizing to place blame on others or external forces.\n" +
                "•\tThey experience changing moods, exhibiting sadness, crying, angry outbursts, frustration, or quietness.\n" +
                "•\tThey make self-critical comments, such as \"I never do anything right,\" \"Nobody likes me,\" \"I'm ugly,\" \"It's my fault,\" or \"Everyone is smarter than I am.\"\n" +
                "•\tThey have difficulty accepting either praise or criticism.\n" +
                "•\tThey become overly concerned or sensitive about other people's opinions of them.\n" +
                "•\tThey are either overly helpful or never helpful at home.\n" +
                "\n" +
                "Signs of High Self Esteem\n" +
                "•\tThey feel liked and accepted by others. They also have a positive regard for themselves.\n" +
                "•\tThey feel confident about their skills, take part in activities more readily. \n" +
                "•\tThey feel proud of what they can do and have a sense of achievement.\n" +
                "•\tThey think good things about themselves and deal with tasks with interest. \n" +
                "•\tThey believe in themselves and don’t make excuses. \n" +
                "\n" +
                " Kids who feel good about themselves have the confidence to try new things. They are more likely to try their best. They feel proud of what they can do. Self-esteem helps kids cope with mistakes. It helps kids try again, even if they fail at first. As a result, self-esteem helps kids do better at school, at home, and with friends.\n" +
                "Kids with low self-esteem feel unsure of themselves. If they think others won't accept them, they may not join in. They may let others treat them poorly. They may have a hard time standing up for themselves. They may give up easily, or not try at all. Kids with low self-esteem find it hard to cope when they make a mistake, lose, or fail. As a result, they may not do as well as they could.\n" +
                "\n" +
                "\n" +
                "It is possible that a child with a positive self-esteem in academics has a negative self-esteem in their social skills and vice- versa. It is therefore necessary for their parents to take an active interest in their activities to figure out the fields in which they feel confident and those in which they don’t. \n" +
                "\n","Does self-confidence and self-esteem mean the same? \n" +
                "Confidence is a measure of faith in one’s own abilities while esteem is about our sense of self. It involves both thoughts and emotions and influences how we perceive others and interact with the world.\n" +
                "When children have healthy self-esteem, they tend to be confident.\n" +
                "Confidence is about knowing what we can and can’t do and trusting in our abilities. Children who are self-confident may be more willing to take on challenges as well as to take responsibility for their actions. They can experience failure and vow to try harder in future endeavors. \n" +
                "If confidence is a matter of trust, esteem is an assessment of value. It is possible for an individual to be confident in certain areas of his or her life and still have low self-esteem. For example, an athlete who trusts him or herself on the playing field but isn’t confident in the classroom may secretly believe he or she is not intelligent.\n" +
                "\n" +
                "How do self-esteem and self-confidence work together? \n" +
                "Self-esteem is forged early in childhood, when kids gain new experiences and learn their capabilities as they learn new skills. Even though we can have high self-confidence and still have low self-esteem, kids who have low self-confidence will develop low self-esteem, as well.\n" +
                "Since all kids are different and vary in how they interact and react to the world, the most important thing we can do for our children is to help them develop a healthy self-esteem that will lead to higher self-confidence in the activities they participate in. When a child has low self-esteem, they develop a fear of failure, thinking they just “can’t do it!” This leads to academic frustration, putting them at risk for developing learned helplessness as they hinder their own learning out of sheer refusal. \n" +
                "The relation between Self Esteem and Confidence is not so simple. A child may be confident about their abilities but still have an overall low self-esteem. However, a high self-esteem does indicate confidence in their abilities to perform tasks. Positive self-esteem gives kids’ confidence to face challenges. Trying to understand a child’s self-esteem goes beyond looking at things they are confident in. Parents need to focus on the activities the child is indulging in, the ones they are not indulging in and why. If a child has low confidence about performing in front of a group of people, it can foster a sense of social insecurity in the child if it is not dealt with in time. \n" +
                "\n" +
                " What are the outcomes of positive and negative self-esteem?\n" +
                " Self-esteem plays a significant role in the development of healthy children. Children with high self-esteem generally become more successful in life. Unfortunately, the outcomes for children with low self-esteem can be quite poor. As a parent, your child’s self-esteem is largely your responsibility. There is a lot you can do to help your child to feel confident and competent.\n" +
                "Children with high self-esteem have the confidence to try new activities and feel a sense of pride in their accomplishments. While it’s never pleasant to fail, these kids possess the emotional ability to withstand lack of success, as well as maintain the courage to try again.\n" +
                "Kids with low self-esteem are self-critical and have difficulty being positive when making mistakes. This may lead to the child not being able to try again, or refusing the next opportunity to be successful.\n" +
                "Children can be sensitive and have a peer group that can be quite harsh, so as a parent, what you do at home matters tremendously. It’s critical that your child possesses a healthy reserve of self-esteem, which will also serve as a buffer to survive the unpleasantness of other kids.\n",
                "Every child is different. Self-esteem may come easier to some kids than others. And some kids face things that can lower their self-esteem. But even if a child's self-esteem is low, it can be raised.\n" +
                        "\n" +
                        "Below are the steps parents can do to make kids feel good about themselves: \n" +
                        "Help your child learn to do things. At every age, there are new things for kids to learn. Even during babyhood, learning to hold a cup or take first steps sparks a sense of mastery and delight. As your child grows, things like learning to dress, read, or ride a bike are chances for self-esteem to grow.\n" +
                        "When teaching kids how to do things, show and help them at first. Then let them do what they can, even if they make mistakes. Be sure your child gets a chance to learn, try, and feel proud. Don't make new challenges too easy — or too hard.\n" +
                        "Praise your child, but do it wisely. Of course, it's good to praise kids. Your praise is a way to show that you're proud. But some ways of praising kids can actually backfire.\n" +
                        "Here's how to do it right:\n" +
                        "Don't overpraise. Praise that doesn't feel earned doesn't ring true. For example, telling a child he played a great game when he knows he didn't feels hollow and fake. It's better to say, \"I know that wasn't your best game, but we all have off days. I'm proud of you for not giving up.\" Add a vote of confidence: \"Tomorrow, you'll be back on your game.\"\n" +
                        "Praise effort. Avoid focusing praise only on results (such as getting an A) or fixed qualities (such as being smart or athletic).Instead, offer most of your praise for effort, progress, and attitude. For example: \"You're working hard on that project,\" \"You're getting better and better at these spelling tests,\" or, \"I'm proud of you for practicing piano — you've really stuck with it.\" With this kind of praise, kids put effort into things, work toward goals, and try. When kids do that, they're more likely to succeed.\n" +
                        "Be a good role model. When you put effort into everyday tasks (like raking the leaves, making a meal, cleaning up the dishes, or washing the car), you're setting a good example. Your child learns to put effort into doing homework, cleaning up toys, or making the bed.\n" +
                        "Modeling the right attitude counts too. When you do tasks cheerfully (or at least without grumbling or complaining), you teach your child to do the same. When you avoid rushing through chores and take pride in a job well done, you teach your child to do that too.\n" +
                        "Ban harsh criticism. The messages kids hear about themselves from others easily translate into how they feel about themselves. Harsh words (\"You're so lazy!\") are harmful, not motivating. When kids hear negative messages about themselves, it harms their self-esteem. Correct kids with patience. Focus on what you want them to do next time. When needed, show them how.\n" +
                        "Focus on strengths. Pay attention to what your child does well and enjoys. Make sure your child has chances to develop these strengths. Focus more on strengths than weaknesses if you want to help kids feel good about themselves. This improves behavior too.\n" +
                        "Let kids help and give. Self-esteem grows when kids get to see that what they do matters to others. Kids can help out at home, do a service project at school, or do a favor for a sibling. Helping and kind acts build self-esteem and other good feelings.\n" +
                        "Love your child unconditionally. Every child should believe that no matter what they do—success or failure— their parents still love them and will continue to be there for them. \n" +
                        "Give your child choices. It’s hard to have self-esteem when you don’t have any control over your life. To provide a sense of self-control, give your child choices. This can be as simple as giving them two options for lunch or allowing them to choose what shoes they wear that day.\n" +
                        "Allow your child to overhear you complimenting them. A child gets a big boost to their self-esteem when they hear a parent praising them to another adult. Your children are always watching you. Use that to your advantage.\n" +
                        "Improve Your Own Self-Confidence. Parenting is therapeutic. In caring for your child you often heal yourself. A mother with a high-need baby in our practice once declared, “My baby brings out the best and the worst in me.” If there are problems in your past that affect your present parenting, confront them. Get psychological help if they are interfering with your ability to remain calm and parent effectively.\n"));


        mlist.add(new ChapterItem(R.drawable.chapter3,"Eating Habits","Chapter 3","","","It is always confusion for parents regarding their children that “what should they should feed to their children to keep them healthy?” also rather than this is a huge problem rises with when children refuse to eat healthy items because of their taste issues. It is become important for parents to provide their kids healthy food which should be tasty as well, to convince their child to eat healthy. And this problem starts from early childhood of children where babies refuse to eat those things which they don’t like in taste, it also depends on their mood. Yes!! Babies eat according to their mood swings, is they want to eat what you have been provided they will eat that without showing any tantrums. But if they are not in their mood they would refuse to eat that. Some parents are not serious about providing fatty food items, which may leads to stomach problems and non-nutritional in kids and also cause serious health hazards in some serious cases. ","To avoid this health hazards by conditioning of healthy eating habits from early childhood of their child. This conditioning can help parents very easily and also by modeling these behaviors in your children you can maintain a healthy weight and normal growth. And this habit also helps at your child’s adult age as a habit of healthy life stage. \n" +
                "\n" +
                "Child eating behavior: Parents are influenced in turn, by children’s behavior and characteristics. Patents of preschool children have been found to adopt their controlling in feeding practices in response to their kid’s weight: they tend to pressure infants who are lighter and have a small appetite and strictness towards those infants who have large appetite. Moreover, the use of food as reward and restriction for health reasons with 3-5 years old children may be responsible for a high intake of food during periods of negative emotion at 5-7 years of age. \n" +
                "  How to develop healthy eating habits in your child:\n" +
                "Parents can control supply of unhealthy items by not buying it or may be through get them in fewer amounts at home. Because it is the main reason of bad eating habits. Child will eat the things which would be provided in home, it also shapes eating routine according to that supply.  \n" +
                " Do not let them drink sodas and cold-drinks whenever they want this might be hazard for them. Parents can replace these drinks by water. \n" +
                "You do not have to get strict that much with you kids; you should prepare a proper routine for those junky food items. Then they would not feel like bounded toward their favorite food items while there daily routine. \n" +
                "Parents should recognize the nutritional difference and beverages (water, juice and milk) and make the less choice. Parents and child both have contribution in eating routine but it mostly depends on parents that would they let eat their child because carelessness would lead to health problems and may causes serious issues.  \n","Coming Soon..."));
        mlist.add(new ChapterItem(R.drawable.chapter4,"Fostering self esteem","Chapter 4","","","Why self-esteem matters?\n" +
                "Kids who feel good about themselves have the confidence to try new things. Self-esteem helps kids cope with mistakes. It helps kids try again, even if they fail at first. As a result, self-esteem helps kids do better at school, at home, and with friends. Kids with low self-esteem feel unsure of themselves. If they think others won't accept them, they may not join in. They may let others treat them poorly. They may have a hard time standing up for themselves. They may give up easily, or not try at all.\n" +
                "\n" +
                "Kids with self-esteem-feel liked and accepted, feel confident, feel proud of what they can do, think good things about themselves, believe in themselves.\n" +
                "\n" +
                "Parent’s role in developing self-esteem-\n" +
                "Positive self-esteem starts with your child’s healthy attachment to you. It begins as early as birth, and continues as your child grows and develops. Recent studies shows that Children need to feel loved and accepted to build self-esteem. When you take good care of your baby, it helps her feel loved and valued. When you play with your child and help her learn, she becomes more self-confident and willing to try new things. When your child goes to school and does well on a test, or while playing a sport, your praise and encouragement will help her feel proud of what she’s done.\n" +
                "As your child gets older, providing rules and structure will help her feel confident that she is cared for. Gradually give her opportunities to make choices for herself and feel more independent.  The more honest, open, and mindful we make the environment we share with our children, the more we enable our children to be resilient and to move confidently and independently into the world.\n" +
                "Be a role model-have a strong self-esteem yourself, set goals for him and if your child fails, encourage him by telling him his strengths, pointing out his weakness and helping him overcome it. Compliment your child, but do not exaggerate. Do not compare him to other children and do not criticize him in-front of them or anyone. Make him realize he should be an independent, confident and a unique person.\n" +
                "Provide a positive psychological mirror- develop an image of themselves and how valuable and lovable they are over time based upon their interactions with their primary caregiver. How you respond to their needs, to their requests, and to their attempts to grow tell your children what you think of them. Known as a “psychological mirror,” your words, tone, and actions reflect whether you see your children as being worthwhile or an annoyance and whether you see them as capable or inept\n" +
                "OFFER PRAISE-One of the most common and effective ways to build children’s self-esteem is to praise them. Praise is a way of saying, “I like what you did! “When you see a child doing something that you want to encourage, praise it! “Catch them being good.” You can do it with a word, a phrase, a gesture or a facial expression. Children crave their parents’ attention. If they do not get attention from positive behavior, they will seek out negative attention. So acknowledge and praise the behavior’s you want to see repeated.\n" +
                "USE “BEING” AND “DOING” MESSAGES-There are two different kinds of messages that we can communicate to children that will directly help to support their self-esteem. \n" +
                "The Being Messages\n" +
                "This refers to the lovable part of the self-esteem equation. They communicate unconditional love. It is valuing our children for who they are and embracing all of the things that make them unique, \n" +
                "“I love you.”\n" +
                "“I am so glad you are my son.” “You are the best son I could ever have wanted!”\n" +
                "“I love to watch you grow.”\n" +
                "“You are important to me.”\n" +
                "“Hearing your laugh makes me smile.”\n" +
                "“I am glad you are here.”\n" +
                "“Welcome home.”\n" +
                "“When you feel sad, you can always talk to me about what is bothering you.”\n" +
                "The Doing Messages\n" +
                "This speaks to the capable part of the self-esteem equation. Feeling competent leads to people feeling good about themselves. These messages refer to all the things our children can do, their special areas of talent, and also to their potential and their growth.\n" +
                "For example:\n" +
                "“Look how hard you worked on this project. That’s what I call being persistent.”\n" +
                "“With practice, you can do it.”\n" +
                "“Thank you for your help. It made the chore go so much faster.”\n" +
                "“You have a good eye for color.”\n" +
                "“I believe that you’ll learn to ride your bike really soon – I can see how hard you are working on it.”\n" +
                "“It was very thoughtful of you to call Grandma on her birthday.”\n" +
                "High five when child does well in a karate competition.\n" +
                "\n","Have reasonable expectations for your children and help them to set reasonable goals for themselves.\n" +
                "Expectations that are too high lead to feelings of helplessness and incompetence.\n" +
                "Expectations that are too low lead to lack of effort and lack of a sense of accomplishment.\n" +
                "\n" +
                "Characteristics:\n" +
                "High self-esteem-\n" +
                "•\tHappy,\n" +
                "•\tMake friends easily,\n" +
                "•\tEnjoy social activities,\n" +
                "•\tAre enthusiastic about new activities,\n" +
                "•\tCan play on their own and with other children,\n" +
                "•\tLike to be creative and have their own ideas, and\n" +
                "•\tTalk comfortably with others without much encouragement.\n" +
                "\n" +
                "Low self-esteem:\n" +
                "•\tHave few friends,\n" +
                "•\tBe easily frustrated or discouraged,\n" +
                "•\tBe unwilling to try new things,\n" +
                "•\tHave trouble following rules or behaving well,\n" +
                "•\tBe withdrawn or depressed, or\n" +
                "•\tSay “I can’t” a lot.\n" +
                "\n" +
                "Things that can damage children self esteem\n" +
                "Messages that say something negative about children are bad for their self-esteem – for example, ‘You are slow, naughty, a bully, a shook …’ when children do something you don’t like, it’s better to tell them what they could do instead. For example, ‘You haven’t done your homework. You need to sit down now and finish your math’s questions’.\n" +
                "Messages that imply that life would be better without children might harm their self-esteem. For example, ‘If it weren’t for the children, we could afford a new car’.\n" +
                "Ignoring children, treating them like a nuisance and not taking an interest in them are likely to be bad for children’s self-esteem. An example might be, ‘I am sick and tired of you’. Frowning or sighing all the time when children want to talk to you might have the same effect.\n" +
                "Negative comparisons with other children, especially brothers and sisters, are also unlikely to be helpful. Each child in your family is different, with individual strengths and weaknesses. It’s better if you can recognize each child’s successes and achievements.\n" +
                "All parents feel frustrated and tired sometimes. But if parents send the message that they feel like this about their children all the time, children get the message that they’re a nuisance.\n"," As a parent, you have the opportunity to develop your child’s self-esteem by encouraging them to take on challenges and learn from their mistakes. Your role is to offer guidance, not interference. That means, if your child is struggling with a problem, you shouldn’t give away a solution. Instead, ask thought-provoking questions or encourage different approaches. Here are some of the activities:\n" +
                "All about me collage----this all about me collage is a great activity to do with a group of children or for an individual child. A collage is a form of art where various pictures are arranged and glued to paper.  In this activity children make a collage that represents the things they like.  Ask kids what makes you, you? Let them tell you through art. This activity is always a big hit with kids. You’ll learn a lot about the child and the child will feel good about themselves\n" +
                "\n" +
                "I tree---this is a fun activity to do with kids.  In this activity children will create a tree that represents positive things about themselves.  This is a great project that can be displayed in a classroom or on the wall of the child’s room to remind them about how special they are. This will help in enhancing the self-esteem of child. Instead of tree he/she can also draw a flower and write something positive about themselves.\n" +
                "\n" +
                "Packing for a trip---Focus Skill: Independence\n" +
                "Instil confidence in your child by encouraging them to practice independence. Before you go on your next family trip, ask your child to pack their own suitcase. Once they’re packed, check the suitcase and prompt them to think about items they missed. Instead of saying, “You forgot your hiking shoes,” say, “Do you have everything you need for hiking the trail?”\n" +
                "Invent a recipe---Focus Skill: Learning from Mistakes\n" +
                "Help your child see mistakes as learning opportunities, not failures. Gently encourage mistake-making by asking your child to invent their own pancake recipe. Have them write down an ingredient list and quantities of each item. Supervise the process so nothing dangerous is ingested, but do not interfere. Even if your child adds something unusual to the recipe (like goat cheese or garbanzo beans!), let them experiment. After cooking a test batch of pancakes, ask, “What could you have done differently?” Then, allow your child to modify the recipe and try again.\n" +
                "Float your boat—Focus Skill: problem solving\n" +
                "Problem-solving is one of the best self-esteem activities. Give your child an open-ended challenge and let them brainstorm ways to create solutions. One great exercise is to give your kid several items from the recycling bin—milk jugs, cans\n" +
                "Cardboard, glass jars—and challenge them to build a boat. Provide tape, glue, string…and nothing else! Let them experiment with different ways to put together their boat. Then test their creation in a lake or pond. You can also incorporate” doing “messages by complimenting your kid on his work for ex: you have really done well!! High five!!\n" +
                "\n" +
                "Block 3\n" +
                "\n" +
                "When your child believes in their ability to overcome mistakes and accomplish tasks all on their own, they will feel empowered to take on challenges in school and in life. While there is no magic key to unlock every child’s inner-confidence, these activities will give you a good starting point. The key to helping your child trust in their abilities is look for opportunities to challenge them and then to let them seek solutions on their own. Use “being “and “doing good “ messages frequently that will help in building up the self-esteem of the child along with good parenting skills such as encouraging the child, allowing them to take their own decisions etc. The way parents interact with their children influences the type of people they become. Nurturing parents who share their love help increase their children's sense of self-worth. Kids learn to feel good about themselves and to care about others. When parents build their Children’s self-esteem, a foundation for a strong, loving relationship is laid.\n"));


        mlist.add(new ChapterItem(R.drawable.chapter5,"Genders in children","Chapter 5","","","Watch out, they are more common than you believe!\n" +
                "To understand how much we are surrounded by them, we first need to look at what gender stereotypes actually mean at its core, for that a very important distinction is to be made between sex of a person and gender of a person. ‘Sex’ refers to the biological classification of people as male or female. ‘Gender’ on the other hand refers to the social roles, behaviors and traits that a society may assign to men (masculine) or women (feminine).\n" +
                ". \n" +
                "Gender stereotyping refers to assigning particular traits, attributes and roles with a gender and expecting them to behave in these certain ways.\n" +
                "•How do these gender stereotypes emerge?\n" +
                "According to gender schema theory developed by Sandra Bem, once children have formed a basic gender identity they start to develop gender schemas. Gender schemas are based on children's interactions and observations of others, their environment, and the culture. These gender schemas are used to organize and direct the child's behavior based on his or her society's gender norms and expectations related to the child's gender. So these gender schemas when exhibited by a large group of people leads to conception of gender stereotypes!\n" +
                "•Loophole of gender expectations: - They are so much more intertwined with our daily lives than we believe. “Be a man, men don’t cry” or “don’t be so loud, women don’t shout” are phrases which we all have grown up listening to, and that is precisely the reason why we don’t even realize them happening all around us. So as a result of not knowing the negative effects of these stereotypes, not even realizing them as a stereotype in the first place we tend to raise our children with the same kind of stereotypical environment and inevitably they would raise their children in the same way establishing a loophole of gender expectations generations after generation. \n" +
                "•Labelling your child is not the way to go!\n" +
                "Children start paying attention to gender differences much earlier than some parents realize, according to psychologist Christia Spears Brown, the author of Parenting beyond Pink and Blue. Herr’s and other researches have mentioned that labelling kids such as ‘come on boys’ or ’oh, there’s that girl’ is the reason behind recognition and association of  their gender than their own innate awareness. Labelling your children and asserting this gender identity on them again and again can lead to a feeling of self-consciousness and it may influence or even alter their own sense of who they actually are. This also suggests that children raised in a gender neutralized homes are more likely to not differentiate between genders and less likely to conform to these gender stereotypes. \n" +
                "•But when exactly do children become aware of their gender? Well as mentioned before quite early than most of the parents realize, studies show that most children start showing their gender identity by the age of 2 or 3. By the time they reach 3 year old, most children play games which they think fit their gender, and with other children who are the same sex as them. For example boys may want to play with guns and girls with kitchen sets. It is very important to realize that it is not because they are innately or biologically wired this way but because of their environmental exposure.\n" +
                "\n","Disadvantages of raising your child with gender stereotypes:-\n" +
                "•Problems associated with children playing stereotypical toys:-\n" +
                " In an Institute of Engineering and Technology (IET) study, 9 out of 10 toys targeted at girls were pink and toys with a science, technology, engineering or math focus were three times more likely to be targeted at boys. Psychologist Cristia Brown reveals that it is not just about the toys, the skills children learn through playing actually shape their cognitive and mental development. So parents have you started noticing the negative threats gender stereotypes can hold in the cognitive development of your children?\n" +
                "•Discouraged, discriminated and bullied:-\n" +
                "Unfortunately there’s more, children who don’t fit in these stereotypes often get discouraged, discriminated and even bullied and the sad part is not just by the society but also by their own parents. Ever heard a father discouraging his boy child to not cry loudly like his sister? Now this kind of discouragement may lead to child hiding his emotions, and eventually becoming emotionally unstable. \n" +
                "•Inculcating stereotypical skills leads to no recognition:-\n" +
                "Moreover children do not get appreciated or recognized for inculcating a good ‘stereotypical’ skill. For example girls do not get appreciation when they display empathy because they are supposed to infer that in their characteristics. So remember parents no matter what, when your child display good behaviors encourage them irrespective of their gender!\n" +
                "•Other considerable ‘Risks’:-\n" +
                "Researchers with the Johns Hopkins Bloomberg School of Public Health and the World Health Organization collaborated on the Global Early Adolescent Study to identify universal themes in gender identity development across countries and income levels. They found out various issues girls and boys go through because of these stereotypes. For girls, those risks can include child marriage, pregnancy, leaving school early, sexually transmitted infections and exposure to violence. Boys suffer, too, from increased risk of substance abuse, suicide and shorter life expectancy than women -- especially if they try to challenge masculine norms.\n" +
                "•Gender stereotyping worse for boys, but how?\n" +
                "Though boys too resist typical masculine norms, researchers discovered a greater willingness among girls to challenge gender stereotypes, Moreover, \"tomboy\" behavior in girls enjoyed more peer and parental acceptance than their male \"sissy\" counterparts, who faced significantly more stigma and rejection, the study said. \n" +
                "Another study show that parents and society in general are more accepting of girls being masculine or inculcating “tomboyish” characteristics than accepting the boys with more feminine and “girlish”.\n" +
                "\"A potential explanation for this may be that girls who 'act like boys' display masculine characteristics associated with power and dominance,\" researchers surmised.\n" +
                "Conversely, \"boys who 'act like girls' are generally not granted the same social acceptance because of the lower power or prestige associated with femininity traits and behaviors.\"\n" +
                "•Gender Dysphoria \n" +
                "Gender dysphoria is the emotional distress experienced by transgender or gender diverse people, caused by feeling they were born into the wrong body. At around 3 years of age or older, many children who are transgender or gender diverse will begin to express their identities, as other children do, through their play, behavior and choices. This could mean dressing more like the opposite sex or playing games or with toys typically associated with the other sex.\n" +
                "•Now that we have established the fact that gender stereotypes should not be a playmate for your child, it is also important to recognize that every child is unique and different in his/ her own ways and there may be some symptoms which you may consider as risks but are completely normal and not something to be scared of. Any particular behavior is fine until it causes dysfunctional problems or dangerous outcomes. Even if you think your child’s behavioral patterns signify an alarming issue, do not worry but to be on a safer side consult with your nearest child psychologist.\n",
                "Parenting above and beyond blue and pink:-\n" +
                        "•Science behind the girls with pink dolls and boys with blue tool sets. \n" +
                        "There is widespread agreement among educators, sociologists and developmental psychologists that children’s play is an important aspect of their educational development. Rational neuro-scientific research was heavily invested in the idea that children are hardwired to select and excel at certain types of play, arguing that boys are better at spatial reasoning and girls are better at collaborative play but recent researchers have found that these researches are flawed because they deny the role played by learning and practice in determining social and cognitive sex differences. To demonstrate this scientifically Lise Eliot, Professor of Neuroscience at the Chicago Medical School at Rosalind Franklin University of Medicine and Science and author of the ironically titled book Pink Brain, Blue Brain, has demonstrated how neuroplasticity (the adaptation of the brain to environment) is the primary factor in shaping children's gender development. This means that their environmental exposure shape the way their brains work! So because of this factor they learn the gender stereotypes and eventually their brain starts to learn them and actually behave in accordance with them, this has led to the belief that a gender is specifically good at certain tasks. When these stereotypes are reinforced again and again generation after generation it leads to the loophole of gender expectations! The only way to shatter these stereotypes is through challenging them by raising your child in a gender neutralized home.\n" +
                        "•More gendered than ever before? \n" +
                        " Dr. Elizabeth Sweet, a sociologist and lecturer at the University of California, Davis, whose research focuses on toys and genders have found out in her research that toys are more gendered now than they’ve ever been before. “The use of signage and color-coding to gender segregate toy aisles is a relatively new phenomenon that has only become popular in the past several decades,” she said. We can see the implementation of this at our local markets where there are entirely different sections dedicated to girls painted in pink with varieties of “feminine” toys and to boys painted in blue with varieties of “masculine” toys.\n" +
                        "•Why is it important for me as a parent to shatter stereotypes?\n" +
                        "Your child is mostly influenced by observing you; nobody else have that kind of influence on your kid in her/his formative years. It’s not about dressing your boy in blue or dressing your girl in pink, you need not stereotype colors for your kid. Don’t make your boy wear pink as its non-stereotypical, make him wear pink because it’s just like any other color! Remember stereotypes emerge, they don’t have a biological basis so if we as society refuse to enforce them they will cease to exist.\n" +
                        "•What if my children likes to play or dress stereotypically? \n" +
                        "As mentioned before you should provide them an environment where there is no preconception regarding any color at all. Whether your girl or boy child likes pink or not, should not be an issue of concern, just provide them a comforting environment where all colors are equal and your children have the liberty to choose as per their preference. The same is supposed to be done with their liking of stereotypical toys. Laura Zimmermann, a developmental psychologist who is a professor of psychology at Shenandoah University in Virginia mentioned that this is not about taking away the doll, or banishing the train. “If they aren’t interested in engaging in non-stereotypic gender play that is O.K. too,” Dr. Zimmermann said in an email. “Children should be free to play with the toys they enjoy — toys should not be ‘assigned’ by gender.\n" +
                        "There are a lot of benefits of shattering these stereotypes for your children. It not only proves a nurturing and comforting environment but is also very important for their cognitive, social, mental and emotional development. Apart from that, “Gender-neutral upbringing empowers kids to be confident in their choices and expression. It makes them open-minded individuals who can have stronger conversations to fight gender stereotypes and biases as they grow up,” says clinical psychologist Varsha Makhija.\n"));
//        mlist.add(new ChapterItem(R.drawable.chapter6,"Handling child tantrums","Chapter 6"));
//        mlist.add(new ChapterItem(R.drawable.chapter7,"healthy eating Quode for babies","Chapter 7"));
//        mlist.add(new ChapterItem(R.drawable.chapter8,"Infants and sleep","Chapter 8"));
//        mlist.add(new ChapterItem(R.drawable.chapter9,"Love languages for Child","Chapter 9"));
//        mlist.add(new ChapterItem(R.drawable.chapter10,"Preschooler","Chapter 10"));
//        mlist.add(new ChapterItem(R.drawable.chapter11,"Social Cognition","Chapter 11"));
//        mlist.add(new ChapterItem(R.drawable.parents_image2,"Caring","Chapter 12"));
//        mlist.add(new ChapterItem(R.drawable.parents_image2,"Caring","Chapter 13"));
//        mlist.add(new ChapterItem(R.drawable.parents_image2,"Caring","Chapter 14"));
//        mlist.add(new ChapterItem(R.drawable.parents_image2,"Caring","Chapter 15"));
//        mlist.add(new ChapterItem(R.drawable.parents_image2,"Caring","Chapter 16"));
//        mlist.add(new ChapterItem(R.drawable.parents_image2,"Caring","Chapter 17"));
//        mlist.add(new ChapterItem(R.drawable.parents_image2,"Caring","Chapter 18"));
//        mlist.add(new ChapterItem(R.drawable.parents_image2,"Caring","Chapter 19"));
//        mlist.add(new ChapterItem(R.drawable.parents_image2,"Caring","Chapter 20"));



        RecyclerView recyclerView = findViewById(R.id.chapters_recycle_view);

        Adapter adapter = new Adapter(this,mlist);


        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(NUM_COLUMN,LinearLayoutManager.VERTICAL);



//
//        LayoutAnimationController layoutAnimationController;

//        layoutAnimationController = AnimationUtils.loadLayoutAnimation(this,R.anim.layout_amimation_slide_in_from_left);
//        recyclerView.setLayoutAnimation(layoutAnimationController);


        recyclerView.setAdapter(adapter);
//        AnimationLoader(recyclerView);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

//        RecyclerViewInit();


    }

//    private void RecyclerViewInit() {
//
//
//
//    }

    private void AnimationLoader(RecyclerView recyclerView){
        Context context = recyclerView.getContext();

        LayoutAnimationController layoutAnimationController = AnimationUtils.loadLayoutAnimation(context,R.anim.layout_animation_slide_from_right);
        recyclerView.setLayoutAnimation(layoutAnimationController);
        recyclerView.getAdapter().notifyDataSetChanged();
        recyclerView.scheduleLayoutAnimation();
    }

}
