public class Converter {

    double distanceOneStep;
    int calorisOneStep;

    Converter(double distanceOneStep, int calorisOneStep) {
        this.distanceOneStep = distanceOneStep;
        this.calorisOneStep = calorisOneStep;
    }

    double distance(int steps) {
        double distanceOll = steps * distanceOneStep / 100000;
        return distanceOll;
    }

    int caloris(int steps) {
        int calorisDistance = (steps * calorisOneStep) * 1000;
        return calorisDistance;
    }
}
