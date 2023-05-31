def findJudge(n, trust):
	population = set()
	non_judge = set()
	for relation in trust:
		population.add(relation[0])
		population.add(relation[1])	
		non_judge.add(relation[0])
	potential_judge = population - non_judge
	if len(potential_judge) == 0:
		return -1

	potential_judge_relations = {}

	for relation in trust:
		if relation[1] in potential_judge:
			potential_judge_relations.setdefault(relation[1], [])
			potential_judge_relations[relation[1]].append(relation[0])
	return -1 if len(population) <
	
n = 3
# trust = [[1,3],[2,3],[3,1]]
trust = [[1,3],[2,3]]
print(findJudge(n, trust))
