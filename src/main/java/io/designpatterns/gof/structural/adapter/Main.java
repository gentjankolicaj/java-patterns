package io.designpatterns.gof.structural.adapter;

import io.designpatterns.gof.structural.adapter.car.BMW;
import io.designpatterns.gof.structural.adapter.car.Car;
import io.designpatterns.gof.structural.adapter.car.Ferrari;
import io.designpatterns.gof.structural.adapter.car.Mercedes;
import io.designpatterns.gof.structural.adapter.car.Tesla;
import io.designpatterns.gof.structural.adapter.jet.F16;
import io.designpatterns.gof.structural.adapter.jet.F22;
import io.designpatterns.gof.structural.adapter.jet.Jet;
import io.designpatterns.gof.structural.adapter.jet.MIG35;
import io.designpatterns.gof.structural.adapter.jet.SU35;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

  public static void main(String[] args) {

    //Create cars & use car adapter to make car interface as machine
    List<Car> cars = getCars();
    List<CarAdapter> carAdapters = new ArrayList<>();
    for (Car car : cars) {
      CarAdapter newCarAdapter = new CarAdapter(car);
      carAdapters.add(newCarAdapter);
    }

    //Create jets & use jet adapter to make jet interface as machine
    List<Jet> jets = getJets();
    List<JetAdapter> jetAdapters = new ArrayList<>();
    for (Jet jet : jets) {
      JetAdapter newJetAdapter = new JetAdapter(jet);
      jetAdapters.add(newJetAdapter);
    }

    //Call operate method on each element of adapter list
    startMachineOperation(carAdapters, jetAdapters);
  }

  public static List<Car> getCars() {
    List<Car> cars = new ArrayList<>();
    cars.add(new BMW());
    cars.add(new Ferrari());
    cars.add(new Mercedes());
    cars.add(new Tesla());
    return cars;
  }

  public static List<Jet> getJets() {
    List<Jet> jets = new ArrayList<>();
    jets.add(new F16());
    jets.add(new F22());
    jets.add(new MIG35());
    jets.add(new SU35());
    return jets;
  }

  @SafeVarargs
  public static void startMachineOperation(List<? extends Machine>... lists) {
    for (List<? extends Machine> machines : lists) {
      for (Machine machine : machines) {
        log.info(machine.operate());
      }
    }
  }

}
