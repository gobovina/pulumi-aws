// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.quicksight.RefreshScheduleArgs;
import com.pulumi.aws.quicksight.inputs.RefreshScheduleState;
import com.pulumi.aws.quicksight.outputs.RefreshScheduleSchedule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing a QuickSight Refresh Schedule.
 * 
 * ## Example Usage
 * 
 * ### Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.quicksight.RefreshSchedule;
 * import com.pulumi.aws.quicksight.RefreshScheduleArgs;
 * import com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleArgs;
 * import com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleScheduleFrequencyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new RefreshSchedule("example", RefreshScheduleArgs.builder()
 *             .dataSetId("dataset-id")
 *             .scheduleId("schedule-id")
 *             .schedule(RefreshScheduleScheduleArgs.builder()
 *                 .refreshType("FULL_REFRESH")
 *                 .scheduleFrequency(RefreshScheduleScheduleScheduleFrequencyArgs.builder()
 *                     .interval("HOURLY")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### With Weekly Refresh
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.quicksight.RefreshSchedule;
 * import com.pulumi.aws.quicksight.RefreshScheduleArgs;
 * import com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleArgs;
 * import com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleScheduleFrequencyArgs;
 * import com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleScheduleFrequencyRefreshOnDayArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new RefreshSchedule("example", RefreshScheduleArgs.builder()
 *             .dataSetId("dataset-id")
 *             .scheduleId("schedule-id")
 *             .schedule(RefreshScheduleScheduleArgs.builder()
 *                 .refreshType("INCREMENTAL_REFRESH")
 *                 .scheduleFrequency(RefreshScheduleScheduleScheduleFrequencyArgs.builder()
 *                     .interval("WEEKLY")
 *                     .timeOfTheDay("01:00")
 *                     .timezone("Europe/London")
 *                     .refreshOnDay(RefreshScheduleScheduleScheduleFrequencyRefreshOnDayArgs.builder()
 *                         .dayOfWeek("MONDAY")
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### With Monthly Refresh
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.quicksight.RefreshSchedule;
 * import com.pulumi.aws.quicksight.RefreshScheduleArgs;
 * import com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleArgs;
 * import com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleScheduleFrequencyArgs;
 * import com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleScheduleFrequencyRefreshOnDayArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new RefreshSchedule("example", RefreshScheduleArgs.builder()
 *             .dataSetId("dataset-id")
 *             .scheduleId("schedule-id")
 *             .schedule(RefreshScheduleScheduleArgs.builder()
 *                 .refreshType("INCREMENTAL_REFRESH")
 *                 .scheduleFrequency(RefreshScheduleScheduleScheduleFrequencyArgs.builder()
 *                     .interval("MONTHLY")
 *                     .timeOfTheDay("01:00")
 *                     .timezone("Europe/London")
 *                     .refreshOnDay(RefreshScheduleScheduleScheduleFrequencyRefreshOnDayArgs.builder()
 *                         .dayOfMonth("1")
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import a QuickSight Refresh Schedule using the AWS account ID, data set ID and schedule ID separated by commas (`,`). For example:
 * 
 * ```sh
 * $ pulumi import aws:quicksight/refreshSchedule:RefreshSchedule example 123456789012,dataset-id,schedule-id
 * ```
 * 
 */
@ResourceType(type="aws:quicksight/refreshSchedule:RefreshSchedule")
public class RefreshSchedule extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the refresh schedule.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the refresh schedule.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * AWS account ID.
     * 
     */
    @Export(name="awsAccountId", refs={String.class}, tree="[0]")
    private Output<String> awsAccountId;

    /**
     * @return AWS account ID.
     * 
     */
    public Output<String> awsAccountId() {
        return this.awsAccountId;
    }
    /**
     * The ID of the dataset.
     * 
     */
    @Export(name="dataSetId", refs={String.class}, tree="[0]")
    private Output<String> dataSetId;

    /**
     * @return The ID of the dataset.
     * 
     */
    public Output<String> dataSetId() {
        return this.dataSetId;
    }
    /**
     * The [refresh schedule](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_RefreshSchedule.html). See schedule
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="schedule", refs={RefreshScheduleSchedule.class}, tree="[0]")
    private Output</* @Nullable */ RefreshScheduleSchedule> schedule;

    /**
     * @return The [refresh schedule](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_RefreshSchedule.html). See schedule
     * 
     * The following arguments are optional:
     * 
     */
    public Output<Optional<RefreshScheduleSchedule>> schedule() {
        return Codegen.optional(this.schedule);
    }
    /**
     * The ID of the refresh schedule.
     * 
     */
    @Export(name="scheduleId", refs={String.class}, tree="[0]")
    private Output<String> scheduleId;

    /**
     * @return The ID of the refresh schedule.
     * 
     */
    public Output<String> scheduleId() {
        return this.scheduleId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RefreshSchedule(String name) {
        this(name, RefreshScheduleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RefreshSchedule(String name, RefreshScheduleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RefreshSchedule(String name, RefreshScheduleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:quicksight/refreshSchedule:RefreshSchedule", name, args == null ? RefreshScheduleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RefreshSchedule(String name, Output<String> id, @Nullable RefreshScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:quicksight/refreshSchedule:RefreshSchedule", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RefreshSchedule get(String name, Output<String> id, @Nullable RefreshScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RefreshSchedule(name, id, state, options);
    }
}
