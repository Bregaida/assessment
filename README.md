assessment
===============

The assessment consists of designing and implementing a sorting service.

This document describes the OnCast Technologies Technical Assessment in terms of requirements
and deliverables needed to be submitted. You should read it carefully before you begin working on
the assessment.

<b>Requirements</b></br>

We are always searching for professionals with very good comportamental skills and ongoing relationship. We prioritize hard teamwork skills. So, we
will prefer the Ruby and Java languages, that are present at most of ours clients. Therefore, we will consider your solution, even if we don't have
demand for that special skill.

We will pay special attention on how your solution was provided. Pay special attention on tests, clean code and best principles for a good architecture.

We have a simple backlog here:

However, we will appreciate if you be able to write your own set o stories and the acceptance criteria of each one.

We believe that the only way we can do software is with Agile and Lean principles. If you are a newbie on these subjects, and want to learn how we can do that weird
thing, you will be welcome. But if you don't like agile principles and don't want to learn, please close this file and we apologyse for the inconvenient.

If you are here, let's take a look on the last rule. We ask you to clone this repository and create a branch with your name - language, like this: celso-java.
When you finish, push this branch and send us a message. We'll be glad to read your code.

So, we need you find a very good solution for:

<b>User Requirements</b></br>
- SSC - Sorting Service Client

1. SSC sends a set of Books to be sorted by the Sorting Service.
2. The Sorting Service sorts the set of Books by title and author’s name, both ascendently.
3. The Sorting Service returns the sorted set of Books to the SSC.

<b>Technical Requirement</b></br>

The Sorting Service considers one or more attributes to sort the Books. Also, for each attribute, a
sort direction can be defined: ascending or descending. For example, in the point 2 of the flow, it
considered the title and the author’s name, both ascendently.
By this way, it is important to this solution, to provide means to prepare the Sorting Service with
attributes and their directions.

  The following design constraints apply:
    - Without changes to the code and by means of a configuration file, the design must allow
configure attributes and directions to the Sorting Service.

We put a little more extensive documentation into folder /docs on project root directory. Feel free to also check this documetation.

Have a nice codding. =)
