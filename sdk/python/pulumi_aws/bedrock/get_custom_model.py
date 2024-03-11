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
    'GetCustomModelResult',
    'AwaitableGetCustomModelResult',
    'get_custom_model',
    'get_custom_model_output',
]

@pulumi.output_type
class GetCustomModelResult:
    """
    A collection of values returned by getCustomModel.
    """
    def __init__(__self__, base_model_arn=None, creation_time=None, hyperparameters=None, id=None, job_arn=None, job_name=None, job_tags=None, model_arn=None, model_id=None, model_kms_key_arn=None, model_name=None, model_tags=None, output_data_configs=None, training_data_configs=None, training_metrics=None, validation_data_configs=None, validation_metrics=None):
        if base_model_arn and not isinstance(base_model_arn, str):
            raise TypeError("Expected argument 'base_model_arn' to be a str")
        pulumi.set(__self__, "base_model_arn", base_model_arn)
        if creation_time and not isinstance(creation_time, str):
            raise TypeError("Expected argument 'creation_time' to be a str")
        pulumi.set(__self__, "creation_time", creation_time)
        if hyperparameters and not isinstance(hyperparameters, dict):
            raise TypeError("Expected argument 'hyperparameters' to be a dict")
        pulumi.set(__self__, "hyperparameters", hyperparameters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if job_arn and not isinstance(job_arn, str):
            raise TypeError("Expected argument 'job_arn' to be a str")
        pulumi.set(__self__, "job_arn", job_arn)
        if job_name and not isinstance(job_name, str):
            raise TypeError("Expected argument 'job_name' to be a str")
        pulumi.set(__self__, "job_name", job_name)
        if job_tags and not isinstance(job_tags, dict):
            raise TypeError("Expected argument 'job_tags' to be a dict")
        pulumi.set(__self__, "job_tags", job_tags)
        if model_arn and not isinstance(model_arn, str):
            raise TypeError("Expected argument 'model_arn' to be a str")
        pulumi.set(__self__, "model_arn", model_arn)
        if model_id and not isinstance(model_id, str):
            raise TypeError("Expected argument 'model_id' to be a str")
        pulumi.set(__self__, "model_id", model_id)
        if model_kms_key_arn and not isinstance(model_kms_key_arn, str):
            raise TypeError("Expected argument 'model_kms_key_arn' to be a str")
        pulumi.set(__self__, "model_kms_key_arn", model_kms_key_arn)
        if model_name and not isinstance(model_name, str):
            raise TypeError("Expected argument 'model_name' to be a str")
        pulumi.set(__self__, "model_name", model_name)
        if model_tags and not isinstance(model_tags, dict):
            raise TypeError("Expected argument 'model_tags' to be a dict")
        pulumi.set(__self__, "model_tags", model_tags)
        if output_data_configs and not isinstance(output_data_configs, list):
            raise TypeError("Expected argument 'output_data_configs' to be a list")
        pulumi.set(__self__, "output_data_configs", output_data_configs)
        if training_data_configs and not isinstance(training_data_configs, list):
            raise TypeError("Expected argument 'training_data_configs' to be a list")
        pulumi.set(__self__, "training_data_configs", training_data_configs)
        if training_metrics and not isinstance(training_metrics, list):
            raise TypeError("Expected argument 'training_metrics' to be a list")
        pulumi.set(__self__, "training_metrics", training_metrics)
        if validation_data_configs and not isinstance(validation_data_configs, list):
            raise TypeError("Expected argument 'validation_data_configs' to be a list")
        pulumi.set(__self__, "validation_data_configs", validation_data_configs)
        if validation_metrics and not isinstance(validation_metrics, list):
            raise TypeError("Expected argument 'validation_metrics' to be a list")
        pulumi.set(__self__, "validation_metrics", validation_metrics)

    @property
    @pulumi.getter(name="baseModelArn")
    def base_model_arn(self) -> str:
        """
        ARN of the base model.
        """
        return pulumi.get(self, "base_model_arn")

    @property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> str:
        """
        Creation time of the model.
        """
        return pulumi.get(self, "creation_time")

    @property
    @pulumi.getter
    def hyperparameters(self) -> Mapping[str, str]:
        """
        Hyperparameter values associated with this model.
        """
        return pulumi.get(self, "hyperparameters")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="jobArn")
    def job_arn(self) -> str:
        """
        Job ARN associated with this model.
        """
        return pulumi.get(self, "job_arn")

    @property
    @pulumi.getter(name="jobName")
    def job_name(self) -> str:
        """
        Job name associated with this model.
        """
        return pulumi.get(self, "job_name")

    @property
    @pulumi.getter(name="jobTags")
    def job_tags(self) -> Mapping[str, str]:
        """
        Key-value mapping of tags for the fine-tuning job.
        """
        return pulumi.get(self, "job_tags")

    @property
    @pulumi.getter(name="modelArn")
    def model_arn(self) -> str:
        """
        ARN associated with this model.
        """
        return pulumi.get(self, "model_arn")

    @property
    @pulumi.getter(name="modelId")
    def model_id(self) -> str:
        return pulumi.get(self, "model_id")

    @property
    @pulumi.getter(name="modelKmsKeyArn")
    def model_kms_key_arn(self) -> str:
        """
        The custom model is encrypted at rest using this key.
        """
        return pulumi.get(self, "model_kms_key_arn")

    @property
    @pulumi.getter(name="modelName")
    def model_name(self) -> str:
        """
        Model name associated with this model.
        """
        return pulumi.get(self, "model_name")

    @property
    @pulumi.getter(name="modelTags")
    def model_tags(self) -> Mapping[str, str]:
        """
        Key-value mapping of tags for the model.
        """
        return pulumi.get(self, "model_tags")

    @property
    @pulumi.getter(name="outputDataConfigs")
    def output_data_configs(self) -> Sequence['outputs.GetCustomModelOutputDataConfigResult']:
        """
        Output data configuration associated with this custom model.
        """
        return pulumi.get(self, "output_data_configs")

    @property
    @pulumi.getter(name="trainingDataConfigs")
    def training_data_configs(self) -> Sequence['outputs.GetCustomModelTrainingDataConfigResult']:
        """
        Information about the training dataset.
        """
        return pulumi.get(self, "training_data_configs")

    @property
    @pulumi.getter(name="trainingMetrics")
    def training_metrics(self) -> Sequence['outputs.GetCustomModelTrainingMetricResult']:
        """
        Metrics associated with the customization job.
        """
        return pulumi.get(self, "training_metrics")

    @property
    @pulumi.getter(name="validationDataConfigs")
    def validation_data_configs(self) -> Sequence['outputs.GetCustomModelValidationDataConfigResult']:
        """
        Information about the validation dataset.
        """
        return pulumi.get(self, "validation_data_configs")

    @property
    @pulumi.getter(name="validationMetrics")
    def validation_metrics(self) -> Sequence['outputs.GetCustomModelValidationMetricResult']:
        """
        The loss metric for each validator that you provided.
        """
        return pulumi.get(self, "validation_metrics")


class AwaitableGetCustomModelResult(GetCustomModelResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCustomModelResult(
            base_model_arn=self.base_model_arn,
            creation_time=self.creation_time,
            hyperparameters=self.hyperparameters,
            id=self.id,
            job_arn=self.job_arn,
            job_name=self.job_name,
            job_tags=self.job_tags,
            model_arn=self.model_arn,
            model_id=self.model_id,
            model_kms_key_arn=self.model_kms_key_arn,
            model_name=self.model_name,
            model_tags=self.model_tags,
            output_data_configs=self.output_data_configs,
            training_data_configs=self.training_data_configs,
            training_metrics=self.training_metrics,
            validation_data_configs=self.validation_data_configs,
            validation_metrics=self.validation_metrics)


def get_custom_model(model_id: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCustomModelResult:
    """
    Returns properties of a specific Amazon Bedrock custom model.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.bedrock.get_custom_model(model_id="arn:aws:bedrock:us-west-2:123456789012:custom-model/amazon.titan-text-express-v1:0:8k/ly16hhi765j4 ")
    ```
    <!--End PulumiCodeChooser -->


    :param str model_id: Name or ARN of the custom model.
    """
    __args__ = dict()
    __args__['modelId'] = model_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:bedrock/getCustomModel:getCustomModel', __args__, opts=opts, typ=GetCustomModelResult).value

    return AwaitableGetCustomModelResult(
        base_model_arn=pulumi.get(__ret__, 'base_model_arn'),
        creation_time=pulumi.get(__ret__, 'creation_time'),
        hyperparameters=pulumi.get(__ret__, 'hyperparameters'),
        id=pulumi.get(__ret__, 'id'),
        job_arn=pulumi.get(__ret__, 'job_arn'),
        job_name=pulumi.get(__ret__, 'job_name'),
        job_tags=pulumi.get(__ret__, 'job_tags'),
        model_arn=pulumi.get(__ret__, 'model_arn'),
        model_id=pulumi.get(__ret__, 'model_id'),
        model_kms_key_arn=pulumi.get(__ret__, 'model_kms_key_arn'),
        model_name=pulumi.get(__ret__, 'model_name'),
        model_tags=pulumi.get(__ret__, 'model_tags'),
        output_data_configs=pulumi.get(__ret__, 'output_data_configs'),
        training_data_configs=pulumi.get(__ret__, 'training_data_configs'),
        training_metrics=pulumi.get(__ret__, 'training_metrics'),
        validation_data_configs=pulumi.get(__ret__, 'validation_data_configs'),
        validation_metrics=pulumi.get(__ret__, 'validation_metrics'))


@_utilities.lift_output_func(get_custom_model)
def get_custom_model_output(model_id: Optional[pulumi.Input[str]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCustomModelResult]:
    """
    Returns properties of a specific Amazon Bedrock custom model.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.bedrock.get_custom_model(model_id="arn:aws:bedrock:us-west-2:123456789012:custom-model/amazon.titan-text-express-v1:0:8k/ly16hhi765j4 ")
    ```
    <!--End PulumiCodeChooser -->


    :param str model_id: Name or ARN of the custom model.
    """
    ...
