package practice_programs;

class Room {
    int l;
    int b;

    Room(int x, int y) {
        l = x;
        b = y;
    }

    int area() {
        return (l * b);
    }
}

class BedRoom extends Room {
    int h;

    BedRoom(int x, int y, int z) {
        super(x, y);
        h = z;
    }

    int volume() {
        return (l * b * h);
    }
}

class Inheritance {
    public static void main(String[] args) {
        BedRoom room1 = new BedRoom(10, 10, 10);
        int area = room1.area();
        int volume = room1.volume();
        System.out.println("Area : " + area + "\nVolume: " + volume);
    }
}
