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
    'GetFaqResult',
    'AwaitableGetFaqResult',
    'get_faq',
    'get_faq_output',
]

@pulumi.output_type
class GetFaqResult:
    """
    A collection of values returned by getFaq.
    """
    def __init__(__self__, arn=None, created_at=None, description=None, error_message=None, faq_id=None, file_format=None, id=None, index_id=None, language_code=None, name=None, role_arn=None, s3_paths=None, status=None, tags=None, updated_at=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if error_message and not isinstance(error_message, str):
            raise TypeError("Expected argument 'error_message' to be a str")
        pulumi.set(__self__, "error_message", error_message)
        if faq_id and not isinstance(faq_id, str):
            raise TypeError("Expected argument 'faq_id' to be a str")
        pulumi.set(__self__, "faq_id", faq_id)
        if file_format and not isinstance(file_format, str):
            raise TypeError("Expected argument 'file_format' to be a str")
        pulumi.set(__self__, "file_format", file_format)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if index_id and not isinstance(index_id, str):
            raise TypeError("Expected argument 'index_id' to be a str")
        pulumi.set(__self__, "index_id", index_id)
        if language_code and not isinstance(language_code, str):
            raise TypeError("Expected argument 'language_code' to be a str")
        pulumi.set(__self__, "language_code", language_code)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if role_arn and not isinstance(role_arn, str):
            raise TypeError("Expected argument 'role_arn' to be a str")
        pulumi.set(__self__, "role_arn", role_arn)
        if s3_paths and not isinstance(s3_paths, list):
            raise TypeError("Expected argument 's3_paths' to be a list")
        pulumi.set(__self__, "s3_paths", s3_paths)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if updated_at and not isinstance(updated_at, str):
            raise TypeError("Expected argument 'updated_at' to be a str")
        pulumi.set(__self__, "updated_at", updated_at)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        ARN of the FAQ.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> str:
        """
        Unix datetime that the faq was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the FAQ.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="errorMessage")
    def error_message(self) -> str:
        """
        When the `status` field value is `FAILED`, this contains a message that explains why.
        """
        return pulumi.get(self, "error_message")

    @property
    @pulumi.getter(name="faqId")
    def faq_id(self) -> str:
        return pulumi.get(self, "faq_id")

    @property
    @pulumi.getter(name="fileFormat")
    def file_format(self) -> str:
        """
        File format used by the input files for the FAQ. Valid Values are `CSV`, `CSV_WITH_HEADER`, `JSON`.
        """
        return pulumi.get(self, "file_format")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="indexId")
    def index_id(self) -> str:
        return pulumi.get(self, "index_id")

    @property
    @pulumi.getter(name="languageCode")
    def language_code(self) -> str:
        """
        Code for a language. This shows a supported language for the FAQ document. For more information on supported languages, including their codes, see [Adding documents in languages other than English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html).
        """
        return pulumi.get(self, "language_code")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the FAQ.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> str:
        """
        ARN of a role with permission to access the S3 bucket that contains the FAQs. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
        """
        return pulumi.get(self, "role_arn")

    @property
    @pulumi.getter(name="s3Paths")
    def s3_paths(self) -> Sequence['outputs.GetFaqS3PathResult']:
        """
        S3 location of the FAQ input data. Detailed below.
        """
        return pulumi.get(self, "s3_paths")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Status of the FAQ. It is ready to use when the status is ACTIVE.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        Metadata that helps organize the FAQs you create.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> str:
        """
        Date and time that the FAQ was last updated.
        """
        return pulumi.get(self, "updated_at")


class AwaitableGetFaqResult(GetFaqResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFaqResult(
            arn=self.arn,
            created_at=self.created_at,
            description=self.description,
            error_message=self.error_message,
            faq_id=self.faq_id,
            file_format=self.file_format,
            id=self.id,
            index_id=self.index_id,
            language_code=self.language_code,
            name=self.name,
            role_arn=self.role_arn,
            s3_paths=self.s3_paths,
            status=self.status,
            tags=self.tags,
            updated_at=self.updated_at)


def get_faq(faq_id: Optional[str] = None,
            index_id: Optional[str] = None,
            tags: Optional[Mapping[str, str]] = None,
            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFaqResult:
    """
    Provides details about a specific Amazon Kendra Faq.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.kendra.get_faq(faq_id="87654321-1234-4321-4321-321987654321",
        index_id="12345678-1234-1234-1234-123456789123")
    ```
    <!--End PulumiCodeChooser -->


    :param str faq_id: Identifier of the FAQ.
    :param str index_id: Identifier of the index that contains the FAQ.
    :param Mapping[str, str] tags: Metadata that helps organize the FAQs you create.
    """
    __args__ = dict()
    __args__['faqId'] = faq_id
    __args__['indexId'] = index_id
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:kendra/getFaq:getFaq', __args__, opts=opts, typ=GetFaqResult).value

    return AwaitableGetFaqResult(
        arn=pulumi.get(__ret__, 'arn'),
        created_at=pulumi.get(__ret__, 'created_at'),
        description=pulumi.get(__ret__, 'description'),
        error_message=pulumi.get(__ret__, 'error_message'),
        faq_id=pulumi.get(__ret__, 'faq_id'),
        file_format=pulumi.get(__ret__, 'file_format'),
        id=pulumi.get(__ret__, 'id'),
        index_id=pulumi.get(__ret__, 'index_id'),
        language_code=pulumi.get(__ret__, 'language_code'),
        name=pulumi.get(__ret__, 'name'),
        role_arn=pulumi.get(__ret__, 'role_arn'),
        s3_paths=pulumi.get(__ret__, 's3_paths'),
        status=pulumi.get(__ret__, 'status'),
        tags=pulumi.get(__ret__, 'tags'),
        updated_at=pulumi.get(__ret__, 'updated_at'))


@_utilities.lift_output_func(get_faq)
def get_faq_output(faq_id: Optional[pulumi.Input[str]] = None,
                   index_id: Optional[pulumi.Input[str]] = None,
                   tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFaqResult]:
    """
    Provides details about a specific Amazon Kendra Faq.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.kendra.get_faq(faq_id="87654321-1234-4321-4321-321987654321",
        index_id="12345678-1234-1234-1234-123456789123")
    ```
    <!--End PulumiCodeChooser -->


    :param str faq_id: Identifier of the FAQ.
    :param str index_id: Identifier of the index that contains the FAQ.
    :param Mapping[str, str] tags: Metadata that helps organize the FAQs you create.
    """
    ...
