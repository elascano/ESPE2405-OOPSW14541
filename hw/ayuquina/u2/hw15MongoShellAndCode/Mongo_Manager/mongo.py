from pymongo import MongoClient
import logging


logging.basicConfig(level=logging.WARNING)

client = MongoClient("mongodb+srv://ayuquina:ayuquina@cluster0.crwllgh.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0")
database = client["OOP"]
collection = database["Students"]
student_1={
    "id":"L00111155",
    "name":"Jefferson",
    "male":True,
    "siblings":2}
student_2={
    "id":"L00111166",
    "name":"Alicia",
    "male":False,
    "siblings":1}


collection.insert_one([student_1,student_2])

