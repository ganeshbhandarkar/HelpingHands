package com.ganeshbhandarkar.helpinghands.Explore;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ganeshbhandarkar.helpinghands.R;

import java.util.ArrayList;
import java.util.List;

public class ExploreFragment extends Fragment {
    private View view;
    private List<ExploreModel> exploreModelList;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_explore,container,false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewExplore);

        ExploreAdapter exploreAdapter = new ExploreAdapter(getContext(),exploreModelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(exploreAdapter);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        exploreModelList = new ArrayList<>();
        exploreModelList.add(new ExploreModel(R.drawable.activity1a,R.drawable.activity1b,"Block 1","Dealing effectively when your child whines and complains excessively","EPISODE","ACTIVITY","Activity 1","SAVED","Pragya Arora","‘Dealing effectively when your child whines and complains excessively’\n" +
                "-\tPragya Arora\n" +
                "\n" +
                "Introduction:\n" +
                "\n" +
                "You know that your preschooler is trying to manipulate you, but whenever he whines, he wins. Like nails on a chalkboard, whining - an irritating blend of talking and crying - has the ability to make almost any parent get angry or give in. And preschoolers are pretty smart. They know that pleading in that pitch has a strong effect on their parents.\n" +
                "\n" +
                "A whiny child, however, isn't deliberately annoying or spoiled. Whining is often the only way that young kids can express themselves when they're tired, cranky, hungry, uncomfortable, or just don't want to do something. Although 3- and 4-year-olds' language skills are rapidly improving, they still don't have the vocabulary to describe all of these feelings, explains Michele Borba, Ed.D., author of Parents Do Make a Difference (Jossey Bass, 1999)\n" +
                "\n" +
                "\n" +
                "Need for this activity:\n" +
                "\n" +
                "Even when your child is able to articulate that she is hungry for lunch or hates sitting in her car seat, for example, she may still whine because she's learned from experience that you'll pay attention. \"For 3 and 4-year-olds who are testing the limits of their independence; whining makes them feel very powerful,\" says psychologist Carolyn Crowder, Ph.D., co-author of Whining: 3 Steps to Stopping It Before the Tears and Tantrums Start (Fireside Paperbacks, 2000).\n" +
                "\n" +
                "\"If you can't stand whining, your child will do it even more, simply because it gets a reaction,\" agrees Jane Nelsen, Ed.D., co-author of Positive Discipline for Preschoolers (Prima Publishing, 1998). Even scolding your child can reinforce the behavior. \"Kids just want a response. When they don't know how to get a positive response, they'll go for a negative one,\" Nelsen explains. And needless to say, giving in (\"Okay, you can have one piece of candy, but promise you'll eat your lunch?\") doesn't work either. You'll get a respite from the whining, but you're still perpetuating the problem.\n" +
                "\n" +
                "Fortunately, you can break this pattern -- in a way that encourages your child's development rather than punishes her. \"When you stop getting frustrated by the whining, your child will stop too,\" insists Nelsen. \n" +
                "\n" +
                "Activity 1:\n" +
                "\n" +
                "Step 1: Refuse to let it bother you. \n" +
                "\n" +
                "Pick a quiet time and tell your child that there's a new rule: If he whines, you won't respond. \"From then on, whenever he whines, keep your facial expression absolutely neutral.” Calmly tell your child that you can't understand what he wants when he whines and that you'll listen when he talks in a nicer voice. You might also ask him to choose a signal for you to use as a warning sign when you're about to stop listening, such as pulling on your ear.\n" +
                "\n" +
                "Step 2: Make sure your child knows what \"asking nicely\" means. \n" +
                "\n" +
                "She may not even realize she's whining--or she may not truly understand what the word means. The best way to explain it is to tape-record both her whiny and pleasant voices and then play them back for her. (Make it clear that you're using the tape to help her learn, not to make her feel bad.) You may also have to teach her the specific words to use when she wants to tell you that she's tired, hungry, bored, or frustrated. \n" +
                "\n" +
                "Step 3: Give praise where praise is due. \n" +
                "\n" +
                "\"Parents always point out, 'That's not a nice voice' but often don't provide enough positive reinforcement,\" so instead, you might say, \"Thanks for using your normal voice\" or \"My ears love that voice.\" \n" +
                "\n" +
                "Step 4: Hang in there. \n" +
                "\n" +
                "Many parents say, 'I tried it yesterday and it didn't help,’ but think of changing one of your own habits: It won't happen overnight.\" Unfortunately, if you don't help your child practice effective methods of communication, the whining may get worse and affect his future friendships. \"Keep in mind that your goal is to help your child be the best he can be--and the time that it takes will be well worth it.\"\n" +
                "\n" +
                "\n" +
                "Activity 2:\n" +
                "\n" +
                "Step 1: React\n" +
                "\n" +
                "Put away the earplugs and take action. \"Kids can whine all day, easily outlasting a parent who is trying to tune it out,\" says Rene Hackney, Ph.D., a developmental psychologist in Alexandria, Virginia. \"The longer you let your child complain, the more determined she'll become to get her way.\" Instead, help your child understand that her whining voice is very hard to listen to. You can say, \"I can't understand you when you whine. If you want to tell me how you feel, then I need you to use your regular voice.\" Don't assume she knows what it means to whine. Demonstrate how it sounds by whining back at her, suggests Hayward. Also, take stock of whether she may be whining because she's tired or hungry. Sticking to a nap schedule and stashing a snack in your purse for outings can help prevent a major meltdown.\n" +
                "\n" +
                "Step 2: Relate\n" +
                "Try to get to the bottom of your kid's bellyaching. Is he whining because he's trying to control a situation? If that's the case, give him a job that relates to that specific scenario. For instance, if he whines about how long you're taking at the supermarket, let him choose which apples to bag or how many bagels to buy.\n" +
                "Is he simply venting? Just as you like to gripe to your partner about a bad day at work or a stressful exchange with another mom, 3- and 4-year-olds need to express themselves too. You might start by saying, \"I know you really want to have an extra balloon, but each child gets only one at the party,\" Dr. Hackney advises. This will validate his feelings and also give him a reason why you're rejecting his request.\n" +
                "\n" +
                "Step 3: Rephrase\n" +
                "Although you may be tempted to punish your child if she continues to whine, that's not the best solution, says Hayward. \"Taking away something like a favorite toy or a special privilege doesn't teach kids how to engage in a positive way in order to get what they're after and just ends up adding to their feelings of powerlessness.\"\n" +
                "\n" +
                "Step 4: Reward\n" +
                "When your preschooler does ask you for something in a calm, sweet way (\"Can I please have a cookie?\"), it's a perfect opportunity to recognize and reinforce his good behavior. \"Don't be afraid to gush! You can say, 'Wow, what a lovely way to ask. That sounded so nice,' \" says Dr. Hackney. Even if you refuse his request (\"We are going to save our appetite for dinner and skip the cookie now\"), pointing out how well he used his good voice will make him less likely to resort to whining next time. You'll be relieved you've silenced the din, and he'll have learned how to make himself heard.\n" +
                "\n" +
                "\n" +
                "Conclusion\n" +
                "\n" +
                "Whining is often the only way that young kids can express themselves when they're tired, cranky, hungry, uncomfortable, or just don't want to do something. Although 3 and 4-year-olds' language skills are rapidly improving, they still don't have the vocabulary to describe all of these feelings.\n" +
                "\n" +
                "\"If you can't stand whining, your child will do it even more. It is simply because it gets a reaction and they’re encouraged to do it again. Apply the activities to your daily life and you’ll see the change. When you stop getting frustrated by the whining, your child will stop too.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n"));
        exploreModelList.add(new ExploreModel(R.drawable.activity2a,R.drawable.activity2b,"Block 2","Knowing your child's temperament","EPISODE","ACTIVITY","Activity 2","SAVED","Pragya Arora","Knowing Your Child’s Temperament \n" +
                "& \n" +
                "Working with highly active children\n" +
                "\n" +
                "-Pragya Arora\n" +
                "\n" +
                "\n" +
                "Introduction: \n" +
                "\n" +
                "Since each child is different, the starting point of being a good parent is to know your child. What are his talents? What gives him trouble? Is he a child who needs a little extra encouragement or a little extra self-control? Does he plunge willingly into new situations? What makes him happy? Does he enjoy company?\n" +
                "\n" +
                "If you know your child’s temperament, you will be able to determine not only what is right for him, but what he enjoys. Every person is born into this world exhibiting his or her own unique temperament. How much activity or energy a person generally exhibits is one of the ten temperament traits we all possess and is a contributing factor in helping to make every person a unique individual. Your temperament is inborn and defines how you respond to the world around you.\n" +
                "\n" +
                "Need for the activity:\n" +
                "\n" +
                "The activity level of a child refers to the amount of physical motion your children have while doing activities. Some children seem to be born with a lot of energy.\n" +
                "\n" +
                "In fact, often in utero, they demonstrate high activity with lots of kicking and moving. In the crib, they squirm and move around so that they are never found in the same place where their parents put them. When they begin crawling, they are all over the place. Growing up, these children run, jump, and climb a lot. Even sitting at the dinner table can be a challenge for children who are highly active. They seem to need to fidget and squirm just to get out their energy.\n" +
                "\n" +
                "\n" +
                "The activity helps in calming down your highly active child. It helps increase the self-esteem and confidence of the child. Furthermore, it helps you know your child better by letting you know the type of temperament he/she fits in. The following activity will help to relax your child’s mind of all the worries he/she may be carrying with him/her.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Activity:\n" +
                "\n" +
                "Step 1: Determine your child’s activity level.\n" +
                "\n" +
                "Determining your children’s activity is easy. Chances are if you have children who are highly active, you are already well aware of it. If you are not sure, it helps to try to track their energy on a scale from one to five, with regard to the following questions:\n" +
                "\n" +
                "\uF076\tDo your children seem to be moving all the time?\n" +
                "\uF076\tDo they have a hard time sitting at the dinner table or waiting patiently for something?\n" +
                "\uF076\tDo your children have difficulty sitting during long car trips?\n" +
                "\uF076\tWhile sleeping, do your children move all over the bed, getting entangled in blankets?\n" +
                "\uF076\tAre your children attracted to sports requiring lots of movement, like soccer and bike riding?\n" +
                "\uF076\tDuring habits of daily living, like brushing teeth and getting dressed, do your children move all over the place rather than stand in one spot?\n" +
                "\n" +
                " \n" +
                "No                                                                                     Yes\n" +
                "1                       2                     3                      4                    5\n" +
                "Quiet                                                                         Very Active\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Activity 2:\n" +
                "\n" +
                "After determining the activity levels of your child, you can utilize this second activity to regulate the energy levels of your child using positive affirmations. This is highly beneficial for children of ‘age group 3-6’ with high activity level, and ADHD.\n" +
                "\n" +
                "The following positive affirmations can be used:\n" +
                "\n" +
                "1. “My Child, you are doing very well.”\n" +
                "\n" +
                "2. “I am grateful for you, my child.”\n" +
                "\n" +
                "3. “You are happy.”\n" +
                "\n" +
                "4. “You do know how to be calm and quiet.”\n" +
                "\n" +
                "5. “My Child, you are worthy.”\n" +
                "\n" +
                "6. “You are unique.”\n" +
                "\n" +
                "7. “You, my child, are very creative.”\n" +
                "\n" +
                "8. “You are very smart and know how to handle situations.”\n" +
                "\n" +
                "9. “When someone talks to you, you listen to them, I really appreciate that.”\n" +
                "\n" +
                "10. “You care for others so well.”\n" +
                "\n" +
                "11. “I know you can handle it when you have to sit quietly for a while.”\n" +
                "\n" +
                "12. “You are beautiful the way you are.”\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Step 1:\n" +
                "Use any of these desired ‘positive affirmations’ with your child, usually 10-15 minutes after your child is asleep.\n" +
                "\n" +
                "Step 2:\n" +
                "The mind enters the unconscious state while asleep. This is the time it can relieve itself from all its problems and worries.\n" +
                "\n" +
                "Step 3:\n" +
                "During this time, go to your child’s room and speak softly into his/her ears giving out ‘Positive night affirmations’, but be careful that you don’t ‘Whisper’ or call out the child’s name. Whispering or calling out the child’s name can make the child conscious leading to him/her waking up.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Conclusion:\n" +
                "\n" +
                "Children are the most precious assets not only to parents but also to our country. When their activity levels are regulated, it not only helps to build a better world but also strengthens your relationship with them. Communication with your child and gentle touches will make your bond grow deeper each time. If you try these activities, it will help you to determine the activity level of your child and be a step forward to predict any possible hazards to their overall development. \n" +
                "\n" +
                " \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                " \n"));
        exploreModelList.add(new ExploreModel(R.drawable.parents_image1,R.drawable.parents_image2,"Block 3","Carrot and Stick Indoctrination","EPISODE","ACTIVITY","Activity 3","SAVED","Pragya Arora","\n" +
                "\n" +
                "Carrot and Stick Indoctrination\n" +
                "-\tPragya Arora\n" +
                "\n" +
                " \n" +
                "Introduction:\n" +
                "The Carrot and the Stick approach to motivation, makes use of rewards and penalties in order to induce desired behavior.\n" +
                "\n" +
                "The philosophy of this approach comes from the old story that the best way to make a donkey move is to put a carrot out in front of it or jab it with a stick from behind.\n" +
                "\n" +
                "Carrot refers to rewards, which are offered or promised to children to act in the desired way; while stick refers to punishments which are to be inflicted on children, for not acting in the desired way. In a way, carrot refers to positive motivation; and stick refers to negative motivation.\n" +
                "\n" +
                "It’s been deeply ingrained in us for the longest time that if we want our children to perform well, we dangle a reward in front of them (carrot) as an incentive, in hope that what’s good will be achieved and gets repeated.\n" +
                "\n" +
                "Likewise, we put up a system of punishment (stick) in its various forms, in hope that what’s bad will be avoided and not get repeated. This is the carrot and stick principle, which is very much extrinsic in nature. By whatever name we call it, it’s been practiced everywhere: education, ideal behavior place, sports, games, family and relationships.\n" +
                "\n" +
                "Need for the activity:\n" +
                "\n" +
                " \n" +
                "\n" +
                "1.\tObtaining Results Through Rewards or Punishment:\n" +
                "One of the old adages of management and motivation techniques is the carrot or stick approach. Originally applying to animals, it describes whether to get it to move by enticing the animal with a nice juicy carrot in front of it as a reward, or beating it with a stick. Getting the animal to move is the objective or target, and the carrot and stick are a means of achieving it.\n" +
                "Parents who wish to get their children to achieve a certain objective can also apply one of these techniques. Whilst many children would not be too enthusiastic about receiving a carrot, rewards such as a bonus time of television, some favorite food, chocolate, star chart can greatly encourage them to ideal behavior harder in order to achieve the objective. Conversely, the parent can take the stick approach. \n" +
                "\n" +
                "2.\tThe problem with punishment:\n" +
                "\n" +
                "An overdose of ‘Carrot’ element, in the system of motivation invites laziness and fewer attitudes towards ideal behavior on the part of children. This happens, specially, because many- a-times, children get carrot i.e. rewards regardless of their performance e.g. leisure time, chocolates, star, etc. An overdose of ‘stick’ element, in the system of motivation leads to retaliatory behavior on part of children.\n" +
                "\n" +
                "3.\tThe one-up showdown:\n" +
                "\n" +
                "Both ways can be extremely successful methods for motivating children to ideal behavior, but conversely both ways are fraught with danger, particularly the stick approach as this can easily have the opposite effect to its desired intention if children rebel against these rules. The carrot approach may lead to ideal behavior the first time, but children might then expect to receive rewards for every project or major task they complete. This could cause de-motivation and poor performance if the children no longer receive the rewards. They may also wonder if they have done something wrong this time.\n" +
                "\n" +
                "4.\tThe goal of discipline:\n" +
                "\n" +
                "In a research, researchers have examined demands for rewards and punishments and their effects on cooperation. They considered a simple proposer-responder environment. In this way, the experiment allowed them to concentrate on the pure demands for rewards and punishments. By considering the four conditions — punish or reward, reward only, punish only, and neither — they could identify the effect each has separately and jointly. \n" +
                "\n" +
                "\uF0B2\tFirst, and perhaps surprisingly, that rewards alone are relatively ineffective in moving the modal offer away from the most selfish one possible. \n" +
                "\n" +
                "\uF0B2\tSecond, punishments improved cooperation by eliminating extremely selfish offers, pushing proposers in the Stick treatment to modest degrees of cooperation. Combining rewards and punishments had a very strong effect. In the Carrot-Stick treatment the modal offer was the most generous one possible, often leading to rewards by responders. (James Andreoni, William Harbaugh, And Lise Vesterlund, June 2003)\n" +
                "\n" +
                "\n" +
                "5.\tPunishments versus consequences:\n" +
                "\n" +
                " The word consequence may at times even suggest trouble which also creates confusion between consequences and punishments. When your kid hits the ball and it strikes at the neighbor’s window, it is not only important to tell your child the correct way to deal with the matter but also to have the window fixed. The true consequence is always immediate and thus, has to be a correct and ideal one. Punishment might not work here. \n" +
                "\n" +
                "6.\tCan rewards replace punishments?\n" +
                "\n" +
                "The process suggested by the data is that the stick can help by getting children to move away from perfect selfishness and to test the waters of cooperation. The carrot can then take over by encouraging further cooperation, rendering the stick a rarely used but necessary tool. The results show that when devising parenting systems, it is important to recognize that in some environments the absence of a reward is not equivalent to a punishment — it is important that both tools be present.\n" +
                "\n" +
                "\n" +
                "Activity:\n" +
                "\n" +
                "The goal of the following activity is with concern to discipline. Examine your thoughts, goals and strategies on the topic of disciplining your child and determine both areas of strengths and opportunities for growth.\n" +
                "\n" +
                "For 10 days, each day, take at least 10 minutes and think about your discipline goals for your child and how well your current strategies are meeting them. You can use a journal or a diary and write these points down. \n" +
                "\n" +
                "Ask yourself: \n" +
                " \n" +
                "\uF0B2\tWhat is my goal when I think about disciplining my child?\n" +
                "\uF0B2\tAre my strategies effective?\n" +
                "\n" +
                "\uF0B2\tAm I handling well all areas of disciplining my child?\n" +
                "\n" +
                "\uF0B2\tAm I struggling with any areas of discipling my child?\n" +
                "\n" +
                "\uF0B2\tWas I able to maintain the discipline today? What was the crucial factor? \n" +
                "\n" +
                "\n" +
                "Conclusion:\n" +
                "\n" +
                "By understanding the need of this activity and the activity itself, parents can discipline their children effectively. As we all know, discipline is a crucial aspect of making our child a better person. Thus, incorporating rewards and punishments at the appropriate time and in the appropriate situation, it will be very effective in a long run. \n" +
                "\n" +
                "After all, discipline is not all about corporal punishments. A child’s behavior can be improved by sparing the rod and introduction of psychologically effective teachniques.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n"));
        exploreModelList.add(new ExploreModel(R.drawable.parents_image1,R.drawable.parents_image2,"Block 4","Developing Emotional Regulation in children","EPISODE","ACTIVITY","Activity 4","SAVED","Japnit Kaur","Developing Emotional Regulation in Children\n" +
                "\n" +
                "-\tJapnit Kaur\n" +
                "\n" +
                "Introduction:\n" +
                "\n" +
                "Emotional regulation is not something we are born with. Toddlers have no emotional regulation skills. Their emotions can swing like a pendulum. Helping our kids learn to self-regulate is one of the most important tasks in raising children. To regulate emotions, one needs to monitor, recognize and adapt emotions optimally according to the situation.\n" +
                "\n" +
                "Children should be taught how to listen to and understand the language of their own, which can bolster their emotional and mental health. A parent’s first step in this direction is listening to and honouring a child’s feelings. \n" +
                "\n" +
                "Emotion regulation means being able to think constructively about how to cope with feelings. We want children to have their feelings, but not be overwhelmed by them - to feel discouraged but not give up; to feel anxious but not stay home; and to be excited but not get so carried away in their enthusiasm that they use poor judgment in making decisions\n" +
                "\n" +
                "Need for the Activity:\n" +
                "\n" +
                "At different stages of development, children and youth have different ways of showing or acting on their feelings. It's important to remember that feelings of excitement, anger or frustration, are all normal feelings; we all feel these emotions at times.\n" +
                "\n" +
                "Meltdowns:\n" +
                "\n" +
                "Young children may have meltdowns when they are upset. They may cry, yell and swing their arms and legs when they're asked to do something they don't want to do. Children may also have meltdowns when they are having a hard time learning something new, when they are tired, overstimulated or under stress.\n" +
                "\n" +
                "Most young children have meltdowns but usually \"grow out\" of them by about the age of four. As they get older, they learn how to deal with big feelings and find better ways to show their feelings.\n" +
                "\n" +
                "Meltdowns are a problem if they continue past the age of four, they are violent (the child hurts himself/herself, other people or other things), happens often and last for a long time (longer than 15 minutes, more than 3 times a day)\n" +
                "\n" +
                "\n" +
                "Activity 1: \n" +
                "\n" +
                "SELF AWARENESS (NAME-IT TO TAME–IT)\n" +
                "\n" +
                "Self-awareness is our ability to recognize our own emotions. This includes being able to notice the changes in our thoughts and body that are signs of our emotions and being able to label our emotions.\n" +
                "\n" +
                "When we are mad, irritated, afraid, or worried, our brain thinks we are in a dangerous situation and our body changes to address this potential danger. Some of these changes include: Rapid heartbeat or breathing, Redness in face, Clenched teeth, Clenched fists, Raised voice, Tight muscles, Upset stomach, Headache, Feel fidgety, etc.\n" +
                "\n" +
                "When your child notices these changes to their body, they can identify strong emotions better. \n" +
                "\n" +
                "•\tTo help them with this, help them label their emotions (name it to tame it). \n" +
                "\n" +
                "•\tModel by labelling your own emotions when you are talking with may feel awkward at first, but if you give a play-by-play during your own emotions, you’ll help your child recognize these emotions in themselves.\n" +
                "\n" +
                "•\t Point out the changes that occur to their bodies.\n" +
                "\n" +
                "•\t Anger, for instance is a particularly strong emotion – learning to identify the physical changes happening in your body can help your child (and you!) identify the emotion and take steps to handle it.\n" +
                "\n" +
                "\n" +
                "Activity 2: \n" +
                "\n" +
                "SELF MANAGEMENT: FOCUS BREATHING \n" +
                "\n" +
                "Self-management is our ability to control our emotions so we can make appropriate decisions. When we have strong emotions, it makes it harder for us to make an appropriate decision about our problems. Calming strategies can help us refocus on the problem and promote positive choices.\n" +
                "\n" +
                "An effective calming strategy is focused breathing.\n" +
                "\n" +
                "•\tWith focused breathing, you become aware of your own breathing. One example includes counting to 5, taking a deep breath, and repeating until you feel calm. \n" +
                "\n" +
                "•\tAnother example is balanced breathing. With balanced breathing, you breathe in for three seconds and then breathe out for three seconds. \n" +
                "\n" +
                "\n" +
                "•\t Belly breathing is another example. This is where you put your hands on your stomach and pay attention to your belly going up and down as you breathe. Another way to show belly breathing is to put a stuffed animal on their belly and have them breathe it up and down.\n" +
                "\n" +
                "Sometimes parents will tell their child, “Just breathe.” not realizing that young kids may not quite know what that means. Practice belly breathing with your child to show them how they can feel their hand going up and down with their breath.\n" +
                "\n" +
                " \n" +
                "ACTIVITY 3: \n" +
                "\n" +
                "SCAFFOLDING \n" +
                "\n" +
                "Acting out is essentially an ineffective response to a stimulus. The parent or teacher needs to help the child slow down and more carefully choose an effective response instead of being impulsive.\n" +
                "\n" +
                "The key to learning self-regulation skills is not to avoid situations that are difficult for kids to handle, but to coach kids through them and provide a supportive framework — clinicians call it “scaffolding” the behaviour you want to encourage — until they can handle these challenges on their own.\n" +
                "\n" +
                "Imagine a situation that can produce strong negative emotions, like a frustrating math homework assignment. If a parent hovers too much, she risks taking over the regulation role. Instead of the child recognizing that the work is frustrating and figuring out how to handle it what he feels is that the parent is frustrating him by making him do it.\n" +
                "\n" +
                "Scaffolding in this situation might be helping the child with one problem, and then expecting him to try the rest. If he feels frustrated, he might get up and get a drink. He might use a timer to give himself periodic breaks. The parent would check in on him at intervals, and offer praise for his efforts.\n" +
                "\n" +
                "Activity 4: \n" +
                "\n" +
                "PRACTICE RUNS \n" +
                "\n" +
                "Dry runs are another way to scaffold self-regulation. For instance, if you’ve had trouble with a child reacting impulsively or having a tantrum in a store, make a short visit when you don’t need to do serious shopping. Have her practice walking with you, keeping her hands to herself. She gets points towards some goal every time she is successful.\n" +
                "\n" +
                "Often parents get discouraged when things don’t go well the first time they try skill-building, but consistency and starting at a level that is appropriate for your child is the key. Rather than giving up, try paring down the activity so it is more doable, and slowly give your child more and more independence to handle it.\n" +
                "\n" +
                "For instance, if brushing her teeth is a problem for your child, you might start by focusing just on putting toothpaste on the brush, and respond with positive feedback and rewards when she does it. Once she’s practiced that a few times, add the next step in the chain.\n" +
                "\n" +
                "Similarly, if getting out the door in the morning is causing meltdowns, target one step at a time. First, say, getting dressed by 7:15. Once she’s mastered that, set a target time for breakfast, and adds that. Breaking the chain into small steps allows her to build self-regulation skills in manageable increments.\n" +
                "\n" +
                "Conclusion:\n" +
                "\n" +
                "Your child’s mastery of understanding and regulating their emotions will help them to succeed in life in a myriad of different ways – they will be more self-confident, perform better in social and academic situations, and even become physically healthier.\n" +
                "\n" +
                "Positive emotional environment is consistently linked to adaptive children emotion regulation whereas negativity and tension is linked to maladaptive strategies. When the emotional climate is positive, responsive and consistent, children feel accepted and secure.\n" +
                "\n" +
                "Parents who express positive emotions create a positive climate. However, parents who express high levels of negative emotions, such as anger, hostility or criticisms, result in a negative environment which is linked to worse emotional regulation in children.\n" +
                "\n" +
                "Teaching coping strategies (e.g. take a deep breathe), redirecting attention (e.g. look, here is a red bunny!) and reframing the situation (e.g. we can turn this into a rocket) have also been shown in studies to be beneficial to children’s regulation. At the end of the day, though, nothing can replace the role of the parent. The family environment is the most important piece.”\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n"));
        exploreModelList.add(new ExploreModel(R.drawable.activity4a,R.drawable.activity4b,"Block 5","HOW TO DEAL WITH LAZY CHILDREN","EPISODE","ACTIVITY","Activity 5","SAVED","Japnit Kaur",
                "HOW TO DEAL WITH LAZINESS IN CHILDREN\n" +
                        "-\tJapnit Kaur\n" +
                        "\n" +
                        "Introduction:\n" +
                        "Well, no child is born lazy. Laziness is a habit. It generally sets in when your child is in the primary school stage. And, by the time your child becomes a teen, the ‘lazy’ stage is almost a rite of passage. But, as a parent, you need to remember that a lazy child will turn into a lazy adult. And, laziness brings with it a whole host of problems.\n" +
                        " \n" +
                        "On the one hand, it brings with it obesity and related health issues. On the other, it practically erases the ability, as an adult, to achieve positive results in any venture. And this brings with it its own problems. So, the best thing is to prevent your child from becoming lazy. If she has already acquired the trait, don’t be discouraged.\n" +
                        "\n" +
                        "Need for the Activity:\n" +
                        "\n" +
                        "Most of the parents know what career and academic demands are expected from children right from a very young age. With respect to these demands, it is highly unlikely for any child to be lazy unless and until the situations around him are either demanding too much or too less of them.\n" +
                        "\n" +
                        "There’s a need to respect the age of the child and only put those things on their plates that they can manage. Thus, you’ll be motivating optimal level of working and inhibiting future procrastination. \n" +
                        "Activity:\n" +
                        "1.\tObserve your child and his/her behaviour patterns. Do you notice the child making a reason for every work that is assigned to him/her? That’s probably just the beginning of laziness creeping in. Make sure that you don’t overburden them either. Because, that could be another reason why they would prefer sitting idle rather than working. \n" +
                        "\n" +
                        "2.\tDon’t make it too easy for them - Let your child learn the importance of valuing things. Don’t make it easy by  simply giving in to his/her demands. Give them rewards for the tasks they have completed. This will also raise financial responsibility in them.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "3.\tYou could start by making your toddler in charge of collecting the day’s newspapers and stacking them in a particular place every evening. Make it a game. Tell him to see if he can complete the job before you finish singing ‘Mary had a little lamb’.\n" +
                        "\n" +
                        "4.\tYou can also put up a chart, and award stars for responsibilities well done. An agreed-upon number of accumulated stars can be exchanged for a dream toy or some other treat. (Black stars for jobs not done can also be put in for older children.)\n" +
                        "\n" +
                        "5.\tNever label a child ‘lazy’. No child deserves that. Every child deserves the loving support of his parents to help him bloom into a happy, productive, well-adjusted adult. So parents, let’s work towards that.\n" +
                        "\n" +
                        "6.\tTell them bedtime stories of how the fruit of hard work is really sweet. Besides fictitious stories, also tell them your own real life stories, which will encourage them and idealize the need for hard work. This will not only motivate them but also because, children always try to imitate their parents.\n" +
                        "\n" +
                        "Conclusion:\n" +
                        "\n" +
                        "One of the most encouraging things to say to a child is that you have faith in them. Give attention when they're participating instead of when they're not. You will get more of any behaviours you pay attention to.\n" +
                        "Talk about their laziness, and you will get more laziness. Talk about how much you enjoyed and appreciated their helpfulness, and the more help you will receive. Appreciate their hard work whenever possible. Besides encouraging them to work hard, make them realise why hard work is needed in life. \n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n"));
//        exploreModelList.add(new ExploreModel(R.drawable.parents_image1,R.drawable.parents_image2,"Block 6","Me,Myself & Media","EPISODE","ACTIVITY","DONE","SAVED"));

    }
}
