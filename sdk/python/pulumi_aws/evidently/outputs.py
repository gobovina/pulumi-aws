# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'FeatureEvaluationRule',
    'FeatureVariation',
    'FeatureVariationValue',
    'LaunchExecution',
    'LaunchGroup',
    'LaunchMetricMonitor',
    'LaunchMetricMonitorMetricDefinition',
    'LaunchScheduledSplitsConfig',
    'LaunchScheduledSplitsConfigStep',
    'LaunchScheduledSplitsConfigStepSegmentOverride',
    'ProjectDataDelivery',
    'ProjectDataDeliveryCloudwatchLogs',
    'ProjectDataDeliveryS3Destination',
]

@pulumi.output_type
class FeatureEvaluationRule(dict):
    def __init__(__self__, *,
                 name: Optional[str] = None,
                 type: Optional[str] = None):
        """
        :param str name: The name for the new feature. Minimum length of `1`. Maximum length of `127`.
        :param str type: This value is `aws.evidently.splits` if this is an evaluation rule for a launch, and it is `aws.evidently.onlineab` if this is an evaluation rule for an experiment.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        The name for the new feature. Minimum length of `1`. Maximum length of `127`.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        """
        This value is `aws.evidently.splits` if this is an evaluation rule for a launch, and it is `aws.evidently.onlineab` if this is an evaluation rule for an experiment.
        """
        return pulumi.get(self, "type")


@pulumi.output_type
class FeatureVariation(dict):
    def __init__(__self__, *,
                 name: str,
                 value: 'outputs.FeatureVariationValue'):
        """
        :param str name: The name of the variation. Minimum length of `1`. Maximum length of `127`.
        :param 'FeatureVariationValueArgs' value: A block that specifies the value assigned to this variation. Detailed below
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the variation. Minimum length of `1`. Maximum length of `127`.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def value(self) -> 'outputs.FeatureVariationValue':
        """
        A block that specifies the value assigned to this variation. Detailed below
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class FeatureVariationValue(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "boolValue":
            suggest = "bool_value"
        elif key == "doubleValue":
            suggest = "double_value"
        elif key == "longValue":
            suggest = "long_value"
        elif key == "stringValue":
            suggest = "string_value"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in FeatureVariationValue. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        FeatureVariationValue.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        FeatureVariationValue.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 bool_value: Optional[str] = None,
                 double_value: Optional[str] = None,
                 long_value: Optional[str] = None,
                 string_value: Optional[str] = None):
        """
        :param str bool_value: If this feature uses the Boolean variation type, this field contains the Boolean value of this variation.
        :param str double_value: If this feature uses the double integer variation type, this field contains the double integer value of this variation.
        :param str long_value: If this feature uses the long variation type, this field contains the long value of this variation. Minimum value of `-9007199254740991`. Maximum value of `9007199254740991`.
        :param str string_value: If this feature uses the string variation type, this field contains the string value of this variation. Minimum length of `0`. Maximum length of `512`.
        """
        if bool_value is not None:
            pulumi.set(__self__, "bool_value", bool_value)
        if double_value is not None:
            pulumi.set(__self__, "double_value", double_value)
        if long_value is not None:
            pulumi.set(__self__, "long_value", long_value)
        if string_value is not None:
            pulumi.set(__self__, "string_value", string_value)

    @property
    @pulumi.getter(name="boolValue")
    def bool_value(self) -> Optional[str]:
        """
        If this feature uses the Boolean variation type, this field contains the Boolean value of this variation.
        """
        return pulumi.get(self, "bool_value")

    @property
    @pulumi.getter(name="doubleValue")
    def double_value(self) -> Optional[str]:
        """
        If this feature uses the double integer variation type, this field contains the double integer value of this variation.
        """
        return pulumi.get(self, "double_value")

    @property
    @pulumi.getter(name="longValue")
    def long_value(self) -> Optional[str]:
        """
        If this feature uses the long variation type, this field contains the long value of this variation. Minimum value of `-9007199254740991`. Maximum value of `9007199254740991`.
        """
        return pulumi.get(self, "long_value")

    @property
    @pulumi.getter(name="stringValue")
    def string_value(self) -> Optional[str]:
        """
        If this feature uses the string variation type, this field contains the string value of this variation. Minimum length of `0`. Maximum length of `512`.
        """
        return pulumi.get(self, "string_value")


@pulumi.output_type
class LaunchExecution(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "endedTime":
            suggest = "ended_time"
        elif key == "startedTime":
            suggest = "started_time"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in LaunchExecution. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        LaunchExecution.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        LaunchExecution.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 ended_time: Optional[str] = None,
                 started_time: Optional[str] = None):
        """
        :param str ended_time: The date and time that the launch ended.
        :param str started_time: The date and time that the launch started.
        """
        if ended_time is not None:
            pulumi.set(__self__, "ended_time", ended_time)
        if started_time is not None:
            pulumi.set(__self__, "started_time", started_time)

    @property
    @pulumi.getter(name="endedTime")
    def ended_time(self) -> Optional[str]:
        """
        The date and time that the launch ended.
        """
        return pulumi.get(self, "ended_time")

    @property
    @pulumi.getter(name="startedTime")
    def started_time(self) -> Optional[str]:
        """
        The date and time that the launch started.
        """
        return pulumi.get(self, "started_time")


@pulumi.output_type
class LaunchGroup(dict):
    def __init__(__self__, *,
                 feature: str,
                 name: str,
                 variation: str,
                 description: Optional[str] = None):
        """
        :param str feature: Specifies the name of the feature that the launch is using.
        :param str name: Specifies the name of the lahnch group.
        :param str variation: Specifies the feature variation to use for this launch group.
        :param str description: Specifies the description of the launch group.
        """
        pulumi.set(__self__, "feature", feature)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "variation", variation)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def feature(self) -> str:
        """
        Specifies the name of the feature that the launch is using.
        """
        return pulumi.get(self, "feature")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Specifies the name of the lahnch group.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def variation(self) -> str:
        """
        Specifies the feature variation to use for this launch group.
        """
        return pulumi.get(self, "variation")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        Specifies the description of the launch group.
        """
        return pulumi.get(self, "description")


@pulumi.output_type
class LaunchMetricMonitor(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "metricDefinition":
            suggest = "metric_definition"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in LaunchMetricMonitor. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        LaunchMetricMonitor.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        LaunchMetricMonitor.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 metric_definition: 'outputs.LaunchMetricMonitorMetricDefinition'):
        """
        :param 'LaunchMetricMonitorMetricDefinitionArgs' metric_definition: A block that defines the metric. Detailed below.
        """
        pulumi.set(__self__, "metric_definition", metric_definition)

    @property
    @pulumi.getter(name="metricDefinition")
    def metric_definition(self) -> 'outputs.LaunchMetricMonitorMetricDefinition':
        """
        A block that defines the metric. Detailed below.
        """
        return pulumi.get(self, "metric_definition")


@pulumi.output_type
class LaunchMetricMonitorMetricDefinition(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "entityIdKey":
            suggest = "entity_id_key"
        elif key == "valueKey":
            suggest = "value_key"
        elif key == "eventPattern":
            suggest = "event_pattern"
        elif key == "unitLabel":
            suggest = "unit_label"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in LaunchMetricMonitorMetricDefinition. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        LaunchMetricMonitorMetricDefinition.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        LaunchMetricMonitorMetricDefinition.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 entity_id_key: str,
                 name: str,
                 value_key: str,
                 event_pattern: Optional[str] = None,
                 unit_label: Optional[str] = None):
        """
        :param str entity_id_key: Specifies the entity, such as a user or session, that does an action that causes a metric value to be recorded. An example is `userDetails.userID`.
        :param str name: Specifies the name for the metric.
        :param str value_key: Specifies the value that is tracked to produce the metric.
        :param str event_pattern: Specifies The EventBridge event pattern that defines how the metric is recorded.
        :param str unit_label: Specifies a label for the units that the metric is measuring.
        """
        pulumi.set(__self__, "entity_id_key", entity_id_key)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "value_key", value_key)
        if event_pattern is not None:
            pulumi.set(__self__, "event_pattern", event_pattern)
        if unit_label is not None:
            pulumi.set(__self__, "unit_label", unit_label)

    @property
    @pulumi.getter(name="entityIdKey")
    def entity_id_key(self) -> str:
        """
        Specifies the entity, such as a user or session, that does an action that causes a metric value to be recorded. An example is `userDetails.userID`.
        """
        return pulumi.get(self, "entity_id_key")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Specifies the name for the metric.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="valueKey")
    def value_key(self) -> str:
        """
        Specifies the value that is tracked to produce the metric.
        """
        return pulumi.get(self, "value_key")

    @property
    @pulumi.getter(name="eventPattern")
    def event_pattern(self) -> Optional[str]:
        """
        Specifies The EventBridge event pattern that defines how the metric is recorded.
        """
        return pulumi.get(self, "event_pattern")

    @property
    @pulumi.getter(name="unitLabel")
    def unit_label(self) -> Optional[str]:
        """
        Specifies a label for the units that the metric is measuring.
        """
        return pulumi.get(self, "unit_label")


@pulumi.output_type
class LaunchScheduledSplitsConfig(dict):
    def __init__(__self__, *,
                 steps: Sequence['outputs.LaunchScheduledSplitsConfigStep']):
        """
        :param Sequence['LaunchScheduledSplitsConfigStepArgs'] steps: One or up to six blocks that define the traffic allocation percentages among the feature variations during each step of the launch. This also defines the start time of each step. Detailed below.
        """
        pulumi.set(__self__, "steps", steps)

    @property
    @pulumi.getter
    def steps(self) -> Sequence['outputs.LaunchScheduledSplitsConfigStep']:
        """
        One or up to six blocks that define the traffic allocation percentages among the feature variations during each step of the launch. This also defines the start time of each step. Detailed below.
        """
        return pulumi.get(self, "steps")


@pulumi.output_type
class LaunchScheduledSplitsConfigStep(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "groupWeights":
            suggest = "group_weights"
        elif key == "startTime":
            suggest = "start_time"
        elif key == "segmentOverrides":
            suggest = "segment_overrides"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in LaunchScheduledSplitsConfigStep. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        LaunchScheduledSplitsConfigStep.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        LaunchScheduledSplitsConfigStep.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 group_weights: Mapping[str, int],
                 start_time: str,
                 segment_overrides: Optional[Sequence['outputs.LaunchScheduledSplitsConfigStepSegmentOverride']] = None):
        """
        :param Mapping[str, int] group_weights: The traffic allocation percentages among the feature variations during one step of a launch. This is a set of key-value pairs. The keys are variation names. The values represent the percentage of traffic to allocate to that variation during this step. For more information, refer to the [AWS documentation for ScheduledSplitConfig groupWeights](https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_ScheduledSplitConfig.html).
        :param str start_time: Specifies the date and time that this step of the launch starts.
        :param Sequence['LaunchScheduledSplitsConfigStepSegmentOverrideArgs'] segment_overrides: One or up to six blocks that specify different traffic splits for one or more audience segments. A segment is a portion of your audience that share one or more characteristics. Examples could be Chrome browser users, users in Europe, or Firefox browser users in Europe who also fit other criteria that your application collects, such as age. Detailed below.
        """
        pulumi.set(__self__, "group_weights", group_weights)
        pulumi.set(__self__, "start_time", start_time)
        if segment_overrides is not None:
            pulumi.set(__self__, "segment_overrides", segment_overrides)

    @property
    @pulumi.getter(name="groupWeights")
    def group_weights(self) -> Mapping[str, int]:
        """
        The traffic allocation percentages among the feature variations during one step of a launch. This is a set of key-value pairs. The keys are variation names. The values represent the percentage of traffic to allocate to that variation during this step. For more information, refer to the [AWS documentation for ScheduledSplitConfig groupWeights](https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_ScheduledSplitConfig.html).
        """
        return pulumi.get(self, "group_weights")

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> str:
        """
        Specifies the date and time that this step of the launch starts.
        """
        return pulumi.get(self, "start_time")

    @property
    @pulumi.getter(name="segmentOverrides")
    def segment_overrides(self) -> Optional[Sequence['outputs.LaunchScheduledSplitsConfigStepSegmentOverride']]:
        """
        One or up to six blocks that specify different traffic splits for one or more audience segments. A segment is a portion of your audience that share one or more characteristics. Examples could be Chrome browser users, users in Europe, or Firefox browser users in Europe who also fit other criteria that your application collects, such as age. Detailed below.
        """
        return pulumi.get(self, "segment_overrides")


@pulumi.output_type
class LaunchScheduledSplitsConfigStepSegmentOverride(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "evaluationOrder":
            suggest = "evaluation_order"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in LaunchScheduledSplitsConfigStepSegmentOverride. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        LaunchScheduledSplitsConfigStepSegmentOverride.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        LaunchScheduledSplitsConfigStepSegmentOverride.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 evaluation_order: int,
                 segment: str,
                 weights: Mapping[str, int]):
        """
        :param int evaluation_order: Specifies a number indicating the order to use to evaluate segment overrides, if there are more than one. Segment overrides with lower numbers are evaluated first.
        :param str segment: The name or ARN of the segment to use.
        :param Mapping[str, int] weights: The traffic allocation percentages among the feature variations to assign to this segment. This is a set of key-value pairs. The keys are variation names. The values represent the amount of traffic to allocate to that variation for this segment. This is expressed in thousandths of a percent, so a weight of 50000 represents 50%!o(MISSING)f traffic.
        """
        pulumi.set(__self__, "evaluation_order", evaluation_order)
        pulumi.set(__self__, "segment", segment)
        pulumi.set(__self__, "weights", weights)

    @property
    @pulumi.getter(name="evaluationOrder")
    def evaluation_order(self) -> int:
        """
        Specifies a number indicating the order to use to evaluate segment overrides, if there are more than one. Segment overrides with lower numbers are evaluated first.
        """
        return pulumi.get(self, "evaluation_order")

    @property
    @pulumi.getter
    def segment(self) -> str:
        """
        The name or ARN of the segment to use.
        """
        return pulumi.get(self, "segment")

    @property
    @pulumi.getter
    def weights(self) -> Mapping[str, int]:
        """
        The traffic allocation percentages among the feature variations to assign to this segment. This is a set of key-value pairs. The keys are variation names. The values represent the amount of traffic to allocate to that variation for this segment. This is expressed in thousandths of a percent, so a weight of 50000 represents 50%!o(MISSING)f traffic.
        """
        return pulumi.get(self, "weights")


@pulumi.output_type
class ProjectDataDelivery(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "cloudwatchLogs":
            suggest = "cloudwatch_logs"
        elif key == "s3Destination":
            suggest = "s3_destination"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ProjectDataDelivery. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ProjectDataDelivery.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ProjectDataDelivery.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 cloudwatch_logs: Optional['outputs.ProjectDataDeliveryCloudwatchLogs'] = None,
                 s3_destination: Optional['outputs.ProjectDataDeliveryS3Destination'] = None):
        """
        :param 'ProjectDataDeliveryCloudwatchLogsArgs' cloudwatch_logs: A block that defines the CloudWatch Log Group that stores the evaluation events. See below.
        :param 'ProjectDataDeliveryS3DestinationArgs' s3_destination: A block that defines the S3 bucket and prefix that stores the evaluation events. See below.
        """
        if cloudwatch_logs is not None:
            pulumi.set(__self__, "cloudwatch_logs", cloudwatch_logs)
        if s3_destination is not None:
            pulumi.set(__self__, "s3_destination", s3_destination)

    @property
    @pulumi.getter(name="cloudwatchLogs")
    def cloudwatch_logs(self) -> Optional['outputs.ProjectDataDeliveryCloudwatchLogs']:
        """
        A block that defines the CloudWatch Log Group that stores the evaluation events. See below.
        """
        return pulumi.get(self, "cloudwatch_logs")

    @property
    @pulumi.getter(name="s3Destination")
    def s3_destination(self) -> Optional['outputs.ProjectDataDeliveryS3Destination']:
        """
        A block that defines the S3 bucket and prefix that stores the evaluation events. See below.
        """
        return pulumi.get(self, "s3_destination")


@pulumi.output_type
class ProjectDataDeliveryCloudwatchLogs(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "logGroup":
            suggest = "log_group"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ProjectDataDeliveryCloudwatchLogs. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ProjectDataDeliveryCloudwatchLogs.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ProjectDataDeliveryCloudwatchLogs.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 log_group: Optional[str] = None):
        """
        :param str log_group: The name of the log group where the project stores evaluation events.
               
               The `s3_destination` block supports the following arguments:
        """
        if log_group is not None:
            pulumi.set(__self__, "log_group", log_group)

    @property
    @pulumi.getter(name="logGroup")
    def log_group(self) -> Optional[str]:
        """
        The name of the log group where the project stores evaluation events.

        The `s3_destination` block supports the following arguments:
        """
        return pulumi.get(self, "log_group")


@pulumi.output_type
class ProjectDataDeliveryS3Destination(dict):
    def __init__(__self__, *,
                 bucket: Optional[str] = None,
                 prefix: Optional[str] = None):
        """
        :param str bucket: The name of the bucket in which Evidently stores evaluation events.
        :param str prefix: The bucket prefix in which Evidently stores evaluation events.
        """
        if bucket is not None:
            pulumi.set(__self__, "bucket", bucket)
        if prefix is not None:
            pulumi.set(__self__, "prefix", prefix)

    @property
    @pulumi.getter
    def bucket(self) -> Optional[str]:
        """
        The name of the bucket in which Evidently stores evaluation events.
        """
        return pulumi.get(self, "bucket")

    @property
    @pulumi.getter
    def prefix(self) -> Optional[str]:
        """
        The bucket prefix in which Evidently stores evaluation events.
        """
        return pulumi.get(self, "prefix")


