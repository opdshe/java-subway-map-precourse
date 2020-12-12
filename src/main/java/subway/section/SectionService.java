package subway.section;

import subway.line.domain.Line;
import subway.line.domain.LineRepository;
import subway.station.domain.Station;
import subway.station.domain.StationRepository;

public class SectionService {
    private SectionService() {
    }

    public static void register(String lineName, String stationName, int order) {
        Line line = LineRepository.findByName(lineName);
        Station station = StationRepository.findByName(stationName);
        SectionValidator.validateRegistration(line, station, order);
        line.insert(order, station);
    }
}
